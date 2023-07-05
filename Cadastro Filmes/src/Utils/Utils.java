package Utils;

import java.util.Scanner;

public class Utils {

    public static double getDouble() {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextDouble();

            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getInt() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
    public static int getInt(String texto) {
        int valor = 0;
        if (!texto.isEmpty()) {
            try {
                valor = Integer.parseInt(texto);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        return valor;
    }

    public static double getDouble(String texto) {
        double valor = 0;
        if (!texto.isEmpty()) {
            try {
                valor = Double.parseDouble(texto);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        return valor;
    }
}
