package com.impacta.treinamento.cap12.cap10;

public class TesteInterface {

    Calculadora calcular = new Calculadora();

    public static void main(String[] args) {

        Calculadora calcular = new Calculadora();

        calcular.subtrair(10, 5);
        calcular.metodoStaticoNaInterface(10, 10D);

        Soma soma = new Calculadora();
        Subtrair subtrair = new Calculadora();

        soma.somar(10, 10);
        subtrair.subtrair(10, 10);

        ((Calculadora) soma).metodoStaticoNaInterface(10, 10);

        Calculadora calculadoraSoma = (Calculadora) soma;
        calculadoraSoma.subtrair(10, 10);

        Calculadora calculadoraSubtrair = (Calculadora) subtrair;
        calculadoraSubtrair.subtrair(10, 10);

        Soma.metodoStaticoNaInterface(10D, 10D);

        boolean tipoDaInstancia = calculadoraSubtrair instanceof Calculadora;

        Eletrodomestico aparelho;

        aparelho = new Geladeira();
        aparelho.ligar();
        aparelho.desligar();
        String voltagemPadrao = Eletrodomestico.voltagem;

        aparelho = new Televisao();

        aparelho.ligar();
        aparelho.desligar();

        ligar();

    }

    static void ligar() {
    }
}
