package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testeSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void testeSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtracao(3, 2));
    }

    @Test
    public void testeMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicacao(2, 3));
    }

    @Test
    public void testeDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.divisao(6, 3));
    }

    @Test
    public void testeDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.divisao(6, 0));
    }
}
