package cap3.operador;

public class Operadores {

    public static void main(String[] args) {


        int soma = 10 + 10; // 20
        int subtracao = 10 - 8; // 2
        int divisao = 10 / 2;  // 5
        int multiplicacao = 10 * 2; //20
        int modulo1 = 10 % 2; // 0
        int modulo2 = 10 % 3; // 1

        System.out.println("Concatena: " + 10 + 10);
        System.out.println("Concatena: " + 10);
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("modulo1: " + modulo1);
        System.out.println("modulo2: " + modulo2);


        soma += 10; // soma = soma + 10;
        System.out.println("atribuição reduzida: " + soma); // 30
        soma = 10;
        System.out.println("atribuição reduzida: " + soma); //10
        soma -= 2;
        System.out.println("atribuição reduzida: : " + soma); //08
        soma *= 2;
        System.out.println("atribuição reduzida: : " + soma); //16
        soma /= 2;
        System.out.println("atribuição reduzida: : " + soma); //08
        soma %= 3;
        System.out.println("atribuição reduzida: : " + soma); //2


        System.out.println("incremental: : " + soma++); //2
        System.out.println("valor: " + soma); //3
        System.out.println("decremental: " + soma--); //3
        System.out.println("valor: " + soma); //2
        System.out.println("decremental " + --soma); //1
        System.out.println("valor: " + soma); //1
        System.out.println("incremental " + ++soma); //2


        System.out.println("10==10: " + (10 == 10)); //true
        System.out.println("10==5: " + (10 == 5)); //false
        System.out.println("10>5: " + (10 > 5)); //true
        System.out.println("10<5: " + (10 < 5)); //false
        System.out.println("10<=5: " + (10 <= 5)); //false
        System.out.println("10>=5: " + (10 >= 5)); //true
        System.out.println("10!=10: " + (10 != 10)); //false
        System.out.println("10!=5: " + (10 != 5)); //true

        System.out.println("10 == 10 && 10 >= 9: " + (10 == 10 && 10 >= 9)); //true
        System.out.println("10 == 9 && 10 >= 9: " + (10 == 9 && 10 >= 9)); //false
        System.out.println("10 == 9 || 10 >= 9: " + (10 == 9 || 10 >= 9)); //true

        System.out.println("!(10 == 9 && 10 >= 9): " + !(10 == 9 && 10 >= 9)); //!false
        //SE Verdadeiro =1ª : Se Falso=2ª

        String ternarioTrue = 10 == 10 ? "Igual" : "Diferente";
        System.out.println("ternarioTrue: " + ternarioTrue);
        String ternarioFalse = 10 > 10 ? "Igual" : "Diferente";
        System.out.println("ternarioFalse: " + ternarioFalse);

                                 // true/false ? true : false
        int ternarioInteiro2 = 10 == 9 || 10 >= 9 && 10 == 9 || 10 >= 9 || 10 == 9 || 10 >= 9 && 10 == 9 || 10 >= 9 ? 20 : 0;
        String validacao = soma > divisao && multiplicacao == soma || modulo1 == modulo2 ? "sim" : "não";
        boolean ternarioBoleano = 10 == 20 ? true : false;


        int ternarioInteiro = 10 != 20 ? 20 : 0;
        // se verdadeiro
        if (10 != 20) {
            ternarioInteiro = 20;
        } else {
            ternarioInteiro = 0;
        }
    }
}
