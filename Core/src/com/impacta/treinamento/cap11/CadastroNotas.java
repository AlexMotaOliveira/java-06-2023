package com.impacta.treinamento.cap11;

public class CadastroNotas {

    public static void main(String[] args) {

        try {
            Nota nota = new Nota("Alex", 11);
            System.out.println(nota);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        Nota nota = new Nota(11);

        //todo voltamos as 21:30
    }
}
