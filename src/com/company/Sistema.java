package com.company;

import java.io.File;

public class Sistema implements ISistema {


    @Override
    public void leerArchivo(File file) {

    }

    @Override
    public void grabarArchivo() {

    }


    @Override
    public void ejecutar() {

        Coche coche = new Coche(Coche.Colores.VERDE, "A00001",
                1800, 120);

        System.out.println("Color coche: " + coche.getColor());
        System.out.println("Coche: " + coche.toString());


        Coche coche1 = new Coche();
        coche1.setColor(Coche.Colores.GRIS);
        coche1.setMatricula("B00001");
        coche1.setPeso(1650);
        coche1.setPotencia(90);

        System.out.println(coche1.toString());

        Deportivo deportivo = new Deportivo();
        deportivo.setAleron(false);
        deportivo.setDescapotable(true);
        deportivo.setNumeroPlazas(2);

        Coche coche2 = deportivo;


    }
}
