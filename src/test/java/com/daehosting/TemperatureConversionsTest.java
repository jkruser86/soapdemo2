package com.daehosting;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12CelsiusToFahrTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celsius to fahrenheit conversion failed", BigDecimal.valueOf(32), celsiusToFahrenheitResult);

    }

    @Test
    public void getTemperatureConversionsSoap12FahrToCelsiusTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("The fahrenheit conversion failed",BigDecimal.valueOf(0), fahrToCelsiusResult);
    }

    @Test
    public void getTemperatureConversionsSoap12WindChillInCelsiusTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(32.0), BigDecimal.valueOf(7));
        assertEquals("The wind chill in Celsius conversion failed", BigDecimal.valueOf(29.3876), windChillInCelsiusResult);
    }

    @Test
    public void getTemperatureConversionsSoap12WindChillInFahrTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInFahrResult = service.windChillInFahrenheit(BigDecimal.valueOf(32.0), BigDecimal.valueOf(7));
        assertEquals("The wind chill in Fahrenheit conversion failed", BigDecimal.valueOf(20.99048), windChillInFahrResult);
    }

}