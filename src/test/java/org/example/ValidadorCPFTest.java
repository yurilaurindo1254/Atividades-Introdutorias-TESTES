package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorCPFTest {

    @Test
    public void testeCPFValido() {
        ValidadorCPF validador = new ValidadorCPF();
        assertTrue(validador.validarCPF("12345678909")); // CPF válido de exemplo
    }

    @Test
    public void testeCPFInvalido() {
        ValidadorCPF validador = new ValidadorCPF();
        assertFalse(validador.validarCPF("12345678900")); // CPF inválido
    }

    @Test
    public void testeCPFNuloOuVazio() {
        ValidadorCPF validador = new ValidadorCPF();
        assertFalse(validador.validarCPF(null));
        assertFalse(validador.validarCPF(""));
    }

    @Test
    public void testeCPFFormatoInvalido() {
        ValidadorCPF validador = new ValidadorCPF();
        assertFalse(validador.validarCPF("1234")); // CPF muito curto
        assertFalse(validador.validarCPF("abc45678901")); // CPF com letras
    }
}
