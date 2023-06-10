package com.impacta.treinamento.cap5.carro;

public class Cap5Lab2 {

    public static void main(String[] args) {
        Garagem g = new Garagem();

        g.carroUtilitario = new Carro();
        g.carroUtilitario.modelo = "Jeep";
        g.carroUtilitario.cor = "vermelho";
        g.carroUtilitario.potenciaDoMotor = 4.0f;

        g.carroPasseio = new Carro();
        g.carroPasseio.modelo = "VW Jetta";
        g.carroPasseio.cor = "prata";
        g.carroPasseio.potenciaDoMotor = 2.4f;

        System.out.println("Carro de Passeio");
        System.out.println("Cor: " + g.carroPasseio.cor);
        System.out.println("Modelo: " + g.carroPasseio.modelo);
        System.out.println("Potencia: " + g.carroPasseio.potenciaDoMotor);
        System.out.println(" ************************** ");

        System.out.println("Carro de Utilitario");
        System.out.println("Cor: " + g.carroUtilitario.cor);
        System.out.println("Modelo: " + g.carroUtilitario.modelo);
        System.out.println("Potencia: " + g.carroUtilitario.potenciaDoMotor);


    }

}
