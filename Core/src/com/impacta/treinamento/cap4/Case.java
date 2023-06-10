package com.impacta.treinamento.cap4;

public class Case {

    public static void main(String[] args) {

        String texto = "sim";

        switch (texto) {
            case "sim":
                System.out.println("Sim");
                break;
            case "nao":
                System.out.println("Não");
                break;
            case "talvez":
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Default");
                break;
        }

        DiaDaSemana diaSemana = DiaDaSemana.SEXTA;

        switch (diaSemana) {
            case SEGUNDA_FEIRA:
                System.out.println(DiaDaSemana.SEGUNDA_FEIRA); break;
            case TERCA:
                System.out.println(DiaDaSemana.TERCA);         break;
            case QUARTA:
                System.out.println(DiaDaSemana.QUARTA);
                break;
            case QUINTA:
                System.out.println(DiaDaSemana.QUINTA);
                break;
            case SEXTA:
                System.out.println(DiaDaSemana.SEXTA);
                break;
            case SABADO:
                System.out.println(DiaDaSemana.SABADO);
                break;
            case DOMINGO:
                System.out.println(DiaDaSemana.DOMINGO);
                break;
        }
    }
}
