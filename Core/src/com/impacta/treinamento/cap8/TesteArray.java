package com.impacta.treinamento.cap8;

import com.impacta.treinamento.cap6.Metodos;
import com.impacta.treinamento.cap7.laboratorio.Cadastro;

public class TesteArray {

    public static void main(String[] args) {
        String arrayDCaracteres = "aqui";

        byte array[] = new byte[4];
        array[0] = 97;  // 1
        array[1] = 113; // 2
        array[2] = 117; // 3
        array[3] = 105; // 4

        int[] array1;
        array1 = new int[50];

        for (int elemento : array1) {
            System.out.println(elemento);
        }

        Cadastro cadastro0[] = new Cadastro[50];

        for (Cadastro elemento : cadastro0) {
            System.out.println(elemento);
        }

        int array2[] = {25, 30, 89, 43};


        Cadastro cadastro[] = new Cadastro[3];
        cadastro[0] = new Cadastro();
        cadastro[1] = new Cadastro("Alex", "Mota");
        cadastro[2] = new Cadastro("Maria", "Joaquina", 50);

//        cadastro[0] = 50; sempre o mesmo tipo para associar ao array

//        System.out.println(cadastro[1].getNome());
//        cadastro[2].mostrar();

        //0, 1, 2
        int array3[] = new int[]{10, 5, 9};
//        System.out.println(array3[0]);
//        System.out.println(array3[1]);
//        System.out.println(array3[0]);

        for (int index = 0; index < array3.length; index++) {
            int elementoDentroDoArray = array3[index];
            System.out.println("elementoDentroDoArray: " + elementoDentroDoArray);
        }

        for (int index = 0; index < cadastro.length; index++) {
            System.out.println(cadastro[index]);
        }

        int contador = 0;
        while (contador < array3.length) {
            System.out.println(array3[contador]);
            contador++;
        }

        //0, 1, 2
        int array4[] = new int[]{100, 55, 915};

        int soma = 0;
        for (int elemento : array4) {
//            System.out.println("foreach: " + elemento);
            soma += elemento;
            System.out.println("valor de cada soma: " + soma);
        }

        System.out.println("valor final: " + soma);

        Metodos metodos = new Metodos();

        metodos.somar(1, 10L);
        metodos.somar(1, 2, 3, 524, 5, 4, 8, 544564, 46848, 554, 2315, 5454, 5454);
        metodos.somar(1);

    }
}
