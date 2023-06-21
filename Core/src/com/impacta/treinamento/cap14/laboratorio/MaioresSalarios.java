package com.impacta.treinamento.cap14.laboratorio;

public class MaioresSalarios {

    public static void main(String[] args) {

        double salariosBrutos[] = {1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 850.26, 3614.29, 12500.0};
        double salariosTopo[] =
                DoubleArrayUtils
                        .filtraValores(salariosBrutos, salario -> salario >= 3_000);


        DoubleInterfaceRetornaBoolean aBoolean = salario -> salario >= 3_000;

        System.out.println("Salarios maior que 3000");
        for (int i = 0; i < salariosBrutos.length; i++) {
            double salariosBruto = salariosBrutos[i];
            if (aBoolean.validar(salariosBruto)) {
                System.out.println("Salario: " + salariosBruto);
            }
        }

        System.out.println("-----------------------------------");
        DoubleArrayUtils.processaValores(salariosTopo, salario -> System.out.println(salario));
    }
}
