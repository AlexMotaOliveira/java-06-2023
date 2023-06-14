package com.impacta.treinamento.cap6;

import com.impacta.treinamento.cap5.Pessoa;

public class Metodos extends Abstrata {

    String nome;
    final static double PI_static = 3.14;
    final private double PI = 3.14;


    //varivel dentro da classe é Atributo

    //    private
//    protected
//    default
    public void exibirNoTerminal(String texto) {
//        System.out.println("** exibindo no terminal** ");
        System.out.println(texto);
    }

    public void exibirNoTerminal(long valor) {
//        System.out.println("** exibindo no terminal** ");
        System.out.println(valor);
    }

    public void exibirNoTerminal(Pessoa pessoa) {
//        System.out.println("** exibindo no terminal** ");
        System.out.println(pessoa);
    }

    public long somar(long valor1, long valor2) {
        long soma = valor1 + valor2;
        return soma;
    }

    public long somar(int valor1, long valor2) {
        long soma = valor1 + valor2;
        return soma;
    }


    strictfp double somar(Long valor1, Long valor2) {
        return valor1 + valor2;
    }

    // sobrecarga dos metodos somar
    public static Long somar(long valor1, long valor2, long valor3) {
        long soma = valor1 + valor2 + valor3;
        return soma;
    }

    public long somar(long ...array){
        long valoresSomados = 0;
        for (long elemento: array) {
            valoresSomados+= elemento;
        }
        return valoresSomados;
    }

    public long trocarValor(long valor1) {
        valor1 = 50;
        return valor1;
    }

    public synchronized Pessoa trocarValorString(Pessoa valor1) {
        valor1 = new Pessoa("Maria", 30, "brasileiro");
        return valor1;
    }


    @Override // sobrescrito do metodo
    final long somarAbstrato(long valor1, long valor2) {
        return valor1 + valor2;
    }



    public static double calcularAreadoCirculo(long raio) {
        return raio * raio * PI_static;
    }

    public double getPI() {
        return PI;
    }

//    public void setPI(double PI) {
//        this.PI = PI;
//    }

    //todo pausa as 21:00 e retorno as 21:20
}
