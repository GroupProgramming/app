package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.MockedStatic.Verification;

public class MetaTest {
    Meta meta;

    @Before
    public void setUp() {
        meta = new Meta("dany");
    }

    @Test
    public void TestCrearMetaVacia() {
        try {
            meta.crearMeta("");
            fail("Tiene que introducir una meta");
        } catch (Exception e) {

        }
    }

    @Test
    public void TestCrearMetaNoVacio() {
        try {
            String result = meta.crearMeta("comprar un car");
            assertEquals("comprar un car", result);
        } catch (Exception e) {

        }
    }

    @Test
    public void TestAgregarMontoObjetivoVacio() {
        try {
            meta.agregarMontoObjetivo(0);
            fail("Debe ingresar un monto mayor a cero");
        } catch (Exception e) {

        }
    }

    @Test
    public void TestAgregarMontoObjetivoNoVacio() {
        try {
            int result = meta.agregarMontoObjetivo(250);
            assertEquals(250, result);
        } catch (Exception e) {

        }
    }

}
