import Utils.Utils;
import model.Filme;
import service.FilmeDAOImpl;

import java.util.List;
import java.util.Scanner;

public class ApplicationUserFilme {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");

        System.out.println("01- Consultar");
        System.out.println("02- Sortear");
        System.out.println("03- Sair");

        int valor = scanner.nextInt();

        switch (valor) {
            case 1:
                consultar();
            case 2:
                boolean isTrue = true;
                while (isTrue) {
                    isTrue = sortear();
                }
                break;
            case 3:
            default:
                System.out.println("fim do programa");
        }
    }

    private static boolean sortear() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações para o sorteio do Filme:");
        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        System.out.print("Nota do filme: ");
        String notaTexto = scanner.nextLine();

        System.out.print("Numero minimo de votos: ");
        String numeroVotosTexto = scanner.nextLine();

        double nota = Utils.getDouble(notaTexto);
        int numeroVotos = Utils.getInt(numeroVotosTexto);

        FilmeDAOImpl dao = new FilmeDAOImpl();
        Filme filme = dao.sortedFilme(genero, nota, numeroVotos);

        if (filme == null) {
            System.out.println("Nenhum Filme Encontrado");
        } else {
            filme.imprimir();
            System.out.println();
        }

        System.out.println("Deseja escolher outro filme: S ou N");
        String resposta = scanner.nextLine();
        return !resposta.isEmpty() && resposta.equalsIgnoreCase("s");
    }

    private static void consultar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações do Filme:");
        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("ano: ");
        String anoTexto = scanner.nextLine();

        int ano = Utils.getInt(anoTexto);

        FilmeDAOImpl filmeDAO = new FilmeDAOImpl();
        List<Filme> filmes = filmeDAO.findByTituloAndGeneroAndAno(titulo, genero, ano);

        if (filmes.isEmpty()) {
            System.out.println("Nenhum Filme Encontrado");
            return;
        }

        // TODO: 04/07/2023 ainda falta imprimir os dados conforme o requisito
//        filmes.stream().sorted().forEach(System.out::println);
        filmes.forEach(Filme::imprimir);

    }

}