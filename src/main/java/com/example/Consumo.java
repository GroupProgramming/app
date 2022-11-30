package com.example;

public class Consumo {
    public int agregarGasto(int gasto)throws Exception{
        if(gasto <= 0){
            throw new Exception("Debes introducir un gasto mayor a 0");
        }
        return gasto;
    }

    public int agregarIngreso(int ingreso)throws Exception{
            if(ingreso <= 0){
            throw new Exception("Debes introducir un ingreso mayor a 0");
        }
        return ingreso;
    }
}
