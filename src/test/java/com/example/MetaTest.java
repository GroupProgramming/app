package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class MetaTest {
    Meta meta;

    @Before
    public void setUp() {
        meta = new Meta();
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
