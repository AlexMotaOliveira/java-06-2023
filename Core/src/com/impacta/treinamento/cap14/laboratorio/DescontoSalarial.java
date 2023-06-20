package com.impacta.treinamento.cap14.laboratorio;

public class DescontoSalarial {

    public static void main(String[] args) {

        double salariosBrutos[] = {1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 850.26, 3614.29, 12500.0};
        double salarioLiquido[] =
                DoubleArrayUtils.transformaValores(salariosBrutos, salarioBruto -> salarioBruto * 0.9);

        for (int i = 0; i < salariosBrutos.length; i++) {
            System.out.print("Salario bruto: " + salariosBrutos[i]);
            System.out.println(" - Salario liquido: " + salarioLiquido[i]);
        }


    }
}
