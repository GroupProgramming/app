package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;


public class ArchivoTest {
    
    @Test
    public void getUserTest(){
       assertEquals("comprar", Archivo.getUser("dany"));
    }


}




