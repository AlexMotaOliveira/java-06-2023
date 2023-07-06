import Utils.Utils;
import model.Filme;
import service.FilmeDAOImpl;

import java.util.List;
import java.util.Scanner;

public class ApplicationAdminFilme {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");

        System.out.println("02- Consultar");
        System.out.println("03- Cadastrar");
        System.out.println("04- Sair");

        int valor = scanner.nextInt();

        switch (valor) {
            case 1:
                break;
            case 2:
                deletedFilme(scanner);
                break;
            case 3:
                saveFilme(scanner);
                break;
            case 4:
            default:
                System.out.println("fim do programa");
        }
    }

    private static void saveFilme(Scanner scanner) {
        Filme filme = new Filme();
        System.out.println("Digite as informações do Filme:");
        scanner.nextLine();

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        filme.setTitulo(titulo);

        System.out.print("Diretores: ");
        filme.setDiretores(scanner.nextLine());

        System.out.print("url: ");
        filme.setUrl(scanner.nextLine());

        System.out.print("Generos: ");
        filme.setGeneros(scanner.nextLine());

        System.out.print("nota [0 a 10]: ");
        filme.setNota(Utils.getDouble());

        System.out.print("ano (>=0): ");
        filme.setAno(Utils.getInt());

        System.out.print("numero de votos (>=0): ");
        filme.setNumeroVotos(Utils.getInt());

        System.out.print("duracao em minutos (>=0): ");
        filme.setDuracao(Utils.getInt());

        FilmeDAOImpl filmeDAO = new FilmeDAOImpl();
        filmeDAO.save(filme);
    }

    private static void deletedFilme(Scanner scanner) {
        System.out.println("Digite as informações para a consultar um Filme:");
        scanner.nextLine();

        //gênero, anoInicial, anoFinal, titulo parcial
        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Ano inicial: ");
        String anoInicialTexto = scanner.nextLine();

        System.out.print("Ano final: ");
        String anoFinalTexto = scanner.nextLine();

        int anoInicial = Utils.getInt(anoInicialTexto, 1900); // 0
        int anoFinal = Utils.getInt(anoFinalTexto, 2023); //

        FilmeDAOImpl filmeDAO = new FilmeDAOImpl();
        List<Filme> filmes = filmeDAO.findByGeneroAndTituloAndAnoBetweenAno(genero, titulo, anoInicial, anoFinal);

        filmes.forEach(Filme::imprimir);

        System.out.println("Deseja excluir um filme: S ou N");
        String decisao = scanner.nextLine();

        if (decisao.equalsIgnoreCase("s")) {
            System.out.println("\nInforme o id do filme: ");
            long id = Utils.getLong();
            filmeDAO.delete(id);
            System.out.println("filme exclucido, id: " + id);

            List<Filme> filmeEntities = filmeDAO.findByGeneroAndTituloAndAnoBetweenAno(genero, titulo, anoInicial, anoFinal);
            filmeEntities.forEach(Filme::imprimir);
        }
    }

}