import java.util.stream.Stream;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // tipo da variavel - Nome = atibuição
        byte Byte = 127; // -128 > 127  300
        short Short = 32_767;

        int Int = 2_147_483_647;
        final long Long = 9_223_372_036_854_775_806l;

        float Float = 12.23f;
        double Double = 12.23;

        char Caracter_A = 65;
        char Caracter = 'A';

        boolean Verdadeiro = true;
        boolean Falso = false;

        var ByteVar = 127l;
        var BoleanVar = true;

        // formatação Ctrl + ALT + l

        int a, b, c;
        int d;

        a = 1;
        b = 2;
        c = 3;
        d = 3;

        System.out.println("valor da variavel Int: " + Int);
        Int = 10;
        System.out.println("valor da variavel Int depois de reatribuir um valor " + Int);

        //Long = 50;

        final double pi = 3.14159265359;
        //pi= 3.15;

        // cast implicito >> menor para o maior
        Short = Byte;
        Int = Short;

        // cast explicito << maior para um menor
        // 127 // 9_223_372_036_854_775_806l
        Byte = (byte) Long;

        System.out.println("cast explicito: " + Byte);
        Byte = (byte) Caracter;

        String texto = "Esse é um texto, que são diversos caracteres";

        System.out.println("cast explicito: " + texto);

        System.out.println("Hoje é : " +  DiaDaSemana.SEGUNDA_FEIRA);

        String numero_String = "27";

        int castNumero = Integer.parseInt(numero_String);

        // int Integer
        // char Character
        // double Double
        // long Long
        // float Float
        // byte Byte
        System.out.println("Hoje é : " +  numero_String);
        System.out.println("Hoje é : " +  castNumero);

    }
}
