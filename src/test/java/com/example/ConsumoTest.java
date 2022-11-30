package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class ConsumoTest {
    Consumo consumo;

    @Before
    public void setUp() {
        consumo = new Consumo();
    }

    @Test
    public void TestAgregarGastoVacio() {
        try {
            consumo.agregarGasto(0);
            fail("Debes introducir un gasto mayor a 0");
        } catch (Exception e) {

        }
    }

    @Test
    public void TestAgregarGastoNoVacio() {
        try {
            int result = consumo.agregarGasto(50);
            assertEquals(50, result);
        } catch (Exception e) {

        }

    }

    @Test
    public void TestAgregarIngresoVacio() {
        try {
            consumo.agregarIngreso(0);
            fail("Debes introducir un ingreso mayor a 0");
        } catch (Exception e) {

        }
    }

    @Test
    public void TestAgregarIngresoNoVacio() {
        try {
            int result = consumo.agregarIngreso(300);
            assertEquals(300, result);
        } catch (Exception e) {

        }
    }

}
