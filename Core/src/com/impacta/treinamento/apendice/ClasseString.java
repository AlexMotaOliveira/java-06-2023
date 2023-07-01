package com.impacta.treinamento.apendice;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class ClasseString {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "10";  // s=10
        s += " 10"; // s1=10 10
        s += " 10"; // s2=10 10 10
        s += " 10"; // s3=10 10 10 10
        s += " 10"; // s4=10 10 10 10 10 10
        s += " 10"; // s5=10 10 10 10 10 10 10
        s += " 10"; // s6=10 10 10 10 10 10 10 10
        s += " 10"; // s7=10 10 10 10 10 10 10 10 10
        s += " 10"; // s8=10 10 10 10 10 10 10 10 10
        s += " 10"; // s9=10 10 10 10 10 10 10 10 10 10
        s += " 10"; // s10=10 10 10 10 10 10 10 10 10 10 10

        s.concat(" 33");
        s = s.concat(" 33"); // s11=10 10 10 10 10 10 10 10 10 10 10 33
        System.out.println(s);

        String texto = " este é um teste de um texto ";

        String replace = texto.replace("e", "*");

        System.out.println(replace);
        System.out.println(texto.trim().replace(" ", ""));

        String scanner = "10 "; // 49,48,32
        int valor = Integer.parseInt(scanner.trim()); // byte > 48 && byte < 57
        System.out.println(valor);

        texto.equals("10"); // 49,48,32 == 49,48

        System.out.println(texto.length());

        byte[] getbytes = texto.getBytes(StandardCharsets.UTF_8);

        System.out.println(getbytes.toString());

        texto.toLowerCase();
        System.out.println(texto.toUpperCase(Locale.CHINESE));

        if (texto.contains(" ")) {
            System.out.println("contem");
        }

        String texto2 = " Este é um teste de um texto ";
        System.out.println(texto2.charAt(6));

        texto2.equals(" este é um teste de um texto ");
        texto2.toLowerCase().equals(" este é um teste de um texto ");
        texto2.compareToIgnoreCase(" este é um teste de um texto ".toLowerCase());

        texto2.replace("este", "aquele");

        texto2.endsWith(" este"); // %like
        texto2.startsWith("texto "); // like%

        char[] caracteres = texto2.toCharArray();

        System.out.println(texto2.subSequence(3, 10));
        String[] split = texto2.repeat(10).split("e");
        System.out.println();

        System.out.println(texto2.repeat(10).split("e"));

        String nula = null;
        String nada;
        String blank = "    "; // blank == null
        blank.isBlank();
        String vazio = ""; // vazio == null
        vazio.isBlank();
        vazio.isEmpty();

        System.out.println(texto2.strip());

        System.out.println(texto2.substring(3, 10));

        String cpf = "123.123.123-25";
        boolean validaFormatoCpf = cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$");

        System.out.println(cpf.toString());

        System.out.println();

        StringBuilder stringBuilder = new StringBuilder(texto2);
        stringBuilder.append("novo texto aqui dentro");
        stringBuilder.delete(5, 15);
        stringBuilder.insert(10, "novo texto inserido na metade");


        String novoTexto = texto2.substring(0, 10) + " " + texto2.substring(11, 20);

        stringBuilder.append(novoTexto);

        System.out.println(stringBuilder.reverse());


    }
}
