package com.example;

import java.util.Scanner;

public class IniciarSesion {

    public void formulario(boolean iniciar){
        Scanner scanner = new Scanner(System.in);

        if(iniciar){
            System.out.println("Ingresa tu nombre");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa tu contraseña");
            String contraseña = scanner.nextLine();
            UsuarioEsquema usuario = Archivo.getUser(nombre);
            if(contraseña != usuario.getContraseña()){
                System.out.println("Contraseña incorrecta");
                return;
            }
        }
    }

}
