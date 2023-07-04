import model.Filme;
import service.FilmeDAOImpl;

import java.util.Scanner;

public class ApplicationFilme {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");

        System.out.println("02- Consultar");
        System.out.println("03- Cadastrar");

        int valor = scanner.nextInt();

        switch (valor) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                saveFilme(scanner);
                break;
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
        filme.setNota(getDouble());

        System.out.print("ano (>=0): ");
        filme.setAno(getInt());

        System.out.print("numero de votos (>=0): ");
        filme.setNumeroVotos(getInt());

        System.out.print("duracao em minutos (>=0): ");
        filme.setDuracao(getInt());

        FilmeDAOImpl filmeDAO = new FilmeDAOImpl();
        filmeDAO.save(filme);
    }

    private static double getDouble() {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextDouble();

            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    private static int getInt() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}