package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConversorTemperaturaTest {

    @Test
    public void testeCelsiusParaFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0), 0.001);
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100), 0.001);
    }

    @Test
    public void testeFahrenheitParaCelsius() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32), 0.001);
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    public void testeCelsiusParaKelvin() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(273.15, conversor.celsiusParaKelvin(0), 0.001);
        assertEquals(373.15, conversor.celsiusParaKelvin(100), 0.001);
    }

    @Test
    public void testeZeroAbsoluto() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(0.0, conversor.celsiusParaKelvin(-273.15), 0.001);
    }
}
