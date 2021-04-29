package com.company;

public class Deportivo extends Coche {

    private boolean descapotable;
    private boolean aleron;
    private int numeroPlazas;

    public Deportivo(Colores colorCoche, String matriculaCoche, double pesoCoche,
                     double potenciaCoche, boolean descapotable, boolean aleron, int numeroPlazas
    ) {

        super(colorCoche, matriculaCoche, pesoCoche, potenciaCoche);

        this.descapotable = descapotable;
        this.aleron = aleron;
        this.numeroPlazas = numeroPlazas;
    }

    public Deportivo() {

    }

    //GETTERS Y SETTERS
    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public boolean isAleron() {
        return aleron;
    }

    public void setAleron(boolean aleron) {
        this.aleron = aleron;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
