package com.impacta.treinamento.cap13;

import com.impacta.treinamento.cap12.laboratorio.Aluno;
import org.junit.jupiter.api.*;

import static com.impacta.treinamento.cap13.MegasenaUtilitario.sortearNumero;


public class MegasenaUtilitarioTest {

    static Aluno aluno;

    //    @BeforeAll
    @BeforeEach
    void setUp() {
        aluno = new
                Aluno("Manuel", 38, 'M',
                123456789, "05/02/1985", 2500, "Java");
    }

    @AfterEach
    void destroy() {
        // encerrar a conexão com banco de dados
    }

    @Order(1)
    @Test
    @DisplayName("Esse teste é Fake")
    void testeFake() {
        sortearNumero();
    }

    @Test
    @Order(2)
    @DisplayName("Gerar um unico numero para jogar na MegaSena")
    void gerarNumeroMegaSena() {
        int numeroSorteado = sortearNumero();
        System.out.println("numero sorteado: " + numeroSorteado);
        Assertions.assertTrue(numeroSorteado > 0, "Valor esta correto: " + numeroSorteado);
        Assertions.assertTrue(numeroSorteado <= 60, "Valor esta correto: " + numeroSorteado);
    }

    @Test
    @Order(3)
    void forNumerosSoteados() {
        for (int i = 0; i < 60; i++) {
            int numeroSorteado = sortearNumero();
            System.out.println("numero sorteado: " + numeroSorteado);
            Assertions.assertTrue(numeroSorteado > 0, "Valor esta correto: " + numeroSorteado);
            Assertions.assertTrue(numeroSorteado <= 60, "Valor esta correto: " + numeroSorteado);
        }
    }


    @Test
    @Order(4)
    void testTDD() {
        int numeroSorteadoMegaSena = SorteadorDeNumeros.sortear(60);

        Assertions.assertTrue(numeroSorteadoMegaSena > 0, "numero invalido: " + numeroSorteadoMegaSena);
        Assertions.assertTrue(numeroSorteadoMegaSena <= numeroSorteadoMegaSena, "numero invalido:  " + numeroSorteadoMegaSena);
    }

    @Test
    @Order(5)
    void testTDD2() {
        int numeroSorteadoMegaSena = SorteadorDeNumeros.sortear(30); // 0 a 99 + 1 = 1 ate 100
        Assertions.assertTrue(numeroSorteadoMegaSena > 0, "numero invalido: " + numeroSorteadoMegaSena);
        Assertions.assertTrue(numeroSorteadoMegaSena <= numeroSorteadoMegaSena, "numero invalido:  " + numeroSorteadoMegaSena);
    }

    @Test
    @Order(6)
    void jogoMegaSenaTest() {
        for (int i = 0; i < 6; i++) {
            int numeroSorteado = SorteadorDeNumeros.sortear(6);
            Assertions.assertTrue(numeroSorteado > 0, "numero invalido: " + numeroSorteado);
            Assertions.assertTrue(numeroSorteado <= numeroSorteado, "numero invalido:  " + numeroSorteado);
            System.out.println(numeroSorteado);
        }
    }

    @Test
    @Order(7)
    void jogoMegaSenaTest2() {

        int lista[] = SorteadorDeNumeros.jogoMegaSena();
        Assertions.assertTrue(lista.length == 6, "quantidade de numeros para o jogo invalido: " + lista.length);

        for (int i = 0; i < lista.length; i++) {
            int numeroSorteado = lista[i];
            Assertions.assertTrue(numeroSorteado > 0, "numero invalido: " + numeroSorteado);
            Assertions.assertTrue(numeroSorteado <= 60, "numero invalido:  " + numeroSorteado);

            Assertions.assertNotNull(aluno);
            int valor = 10;
            Assertions.assertEquals(10, valor);
//            Assertions.fail("caiu no Assertions.fail");
            imprimirOteste(numeroSorteado);
        }
    }

    private void imprimirOteste(int numero) {
        System.out.println(numero);
    }

}
