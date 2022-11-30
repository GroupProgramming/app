package com.example;

public class Meta {
    public String crearMeta(String meta) throws Exception {
        if (meta.equals("")) {
            throw new Exception("Tiene que introducir una meta");
        }
        return meta;
    }

    public int agregarMontoObjetivo(int monto) throws Exception {
        if (monto <= 0) {
            throw new Exception("Debe ingresar un monto mayor a cero");
        }
        return monto;
    }
}
