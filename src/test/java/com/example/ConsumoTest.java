package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



import org.junit.Before;
import org.junit.Test;

public class ConsumoTest {
    Consumo consumo;

    @Before
    public void setUp() {
        consumo = new Consumo("dany");
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

    @Test
    public void actualizarDineroActualGastos(){
        try{
            Consumo consumo = mock(Consumo.class);
            when(consumo.agregarGasto(300)).thenReturn(100);
            int result = consumo.agregarGasto(300);
            assertEquals(100, result);
        }catch(Exception e){

        }
    }

    @Test
    public void actualizarDineroActualIngresos(){
        try{
            Consumo consumo = mock(Consumo.class);
            when(consumo.agregarIngreso(100)).thenReturn(300);
            int result = consumo.agregarIngreso(100);
            assertEquals(300, result);
        }catch(Exception e){

        }
    }

    @Test
    public void verificarGastoNoSeaMayorDineroActual(){
        try{
            UsuarioEsquema usuario = mock(UsuarioEsquema.class);
            when(usuario.getDineroActual()).thenReturn(200);
            consumo.verificarGasto(300, usuario.getDineroActual());
            fail("El gasto no puede exeder la cantidad de dinero actual");
        }catch(Exception e){
        }
    }


    // @Test
    // public void verificarCompletarMeta(){
    //     try{
    //         UsuarioEsquema usuario = mock(UsuarioEsquema.class);
    //         when(usuario.getDineroActual()).thenReturn(1200);
    //         when(usuario.getMontoObjetivo()).thenReturn(1000);
    //         assertEquals(true, consumo.verificarCompletarMeta(usuario.getDineroActual(), usuario.getMontoObjetivo()));
    //     }catch(Exception e){
    //     }
    // }

}
