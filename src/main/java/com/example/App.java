package com.example;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Iniciar sesion\n2. Registrar");
        int opcion = scanner.nextInt();
        if(opcion == 1){
            IniciarSesion iniciar = new IniciarSesion();
            iniciar.formulario(true);

        }else if(opcion == 2){
            Registrar registrar = new Registrar();
            registrar.registro("", "", "");
        }else{
            System.out.println("Error debes de elegir una opcion");
        }
    }
}
