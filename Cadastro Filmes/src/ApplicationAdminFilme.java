import Utils.Utils;
import model.Filme;
import service.FilmeDAOImpl;

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

}