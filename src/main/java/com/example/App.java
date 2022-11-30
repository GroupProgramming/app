package com.example;

public class App
{
    public static void main( String[] args )
    {
        UsuarioEsquema usuario = new UsuarioEsquema();
        usuario.setNombre("dany");
        // usuario.setContraseña("12345");
        // usuario.setEmail("dany@gmail");
        // usuario.setMeta("comprar helado");
        // usuario.setMontoObjetivo(300);
        // usuario.setDineroActual(100);
        Archivo.postUser(usuario);

        // UsuarioEsquema user = Archivo.getUser("dany");
        // System.out.println(user.getMontoObjetivo());

        // IniciarSesion iniciar = new IniciarSesion();
        // iniciar.formulario(true);


    }
}
