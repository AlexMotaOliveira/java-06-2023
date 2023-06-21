package com.impacta.treinamento.cap14.laboratorio;

import java.util.Collection;

public class DescontoSalarial {

    public static void main(String[] args) {

        double salariosBrutos[] = {1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 850.26, 3614.29, 12500.0};
        double salarioLiquidos[] =
                DoubleArrayUtils.transformaValores(salariosBrutos, salarioBruto -> salarioBruto * 0.9);


        DoubleInterfaceRetornaDouble interfaceRetornaDouble = salario -> salario * 0.8;


        for (int i = 0; i < salariosBrutos.length; i++) {
            System.out.print("Salario bruto: " + salariosBrutos[i]);
            double salarioLiquido = interfaceRetornaDouble.converter(salariosBrutos[i]);
            System.out.println(" - Salario liquido: " + salarioLiquido);
        }

        System.out.println("------------------------------");
        DoubleArrayUtils.processaValores(salarioLiquidos, salario -> {
            System.out.println(" - Salario liquido: " + salario);
        });


    }
}
