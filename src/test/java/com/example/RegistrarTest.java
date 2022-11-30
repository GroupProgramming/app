package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class RegistrarTest {
    Registrar register;

    @Before
    public void setUp(){
        register = new Registrar();
    }


    @Test
    public void registroNombreVacio(){
        try{
            register.registro("","camila@gail.com","102024L");
            fail("Nombre No Valido");
        }catch(Exception e){

        }
    }


    @Test
    public void registroEmailVacio(){
        try{
            register.registro("Camila","","5678102L");
            fail("Email No Valido");
        }catch(Exception e){

        }
    }

    @Test
    public void registroContraseñaVacio(){
        try{
            register.registro("Camila","camila@gmail.com","");
            fail("Contraseña No Valida");
        }catch(Exception e){

        }
    }

}


