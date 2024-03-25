package com.example.atividade2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testConstructorWithParameter() {
        Calculadora calculadora = new Calculadora(3);
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(3, resultadoObtido);
    }

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora(3);
        calculadora.somar(-2);
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(1, resultadoObtido);
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora(3);
        calculadora.subtrair(2);
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(1, resultadoObtido);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora(3);
        calculadora.multiplicar(2);
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(6, resultadoObtido);
    }

    @Test
    public void testDividirPorZero() {
        Calculadora calculadora = new Calculadora(3);
        Assertions.assertThrows(Exception.class, () -> calculadora.dividir(0));
    }

    @Test
    public void testDividirPorValorPositivo() throws Exception {
        Calculadora calculadora = new Calculadora(3);
        calculadora.dividir(2);
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(1.5, resultadoObtido, 0.01);
    }

    @Test
    public void testExponenciacaoPorUm() throws Exception {
        Calculadora calculadora = new Calculadora(3);
        calculadora.exponenciar(1);
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(3, resultadoObtido);
    }

    @Test
    public void testExponenciacaoPorDez() throws Exception {
        Calculadora calculadora = new Calculadora(3);
        calculadora.exponenciar(10);
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(59049, resultadoObtido);
    }

    @Test
    public void testExponenciacaoPorValorMaiorQueDez() {
        Calculadora calculadora = new Calculadora(3);
        Assertions.assertThrows(Exception.class, () -> calculadora.exponenciar(11));
    }

    @Test
    public void testZerarMemoria() {
        Calculadora calculadora = new Calculadora(3);
        calculadora.zerarMemoria();
        int resultadoObtido = calculadora.getMemoria();
        Assertions.assertEquals(0, resultadoObtido);
    }
}
