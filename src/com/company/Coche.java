package com.company;

public class Coche {

    enum Colores {
        VERDE,
        AZUL,
        AMARILLO,
        GRIS;
    }

    //Atributos
    private Colores color;
    private String matricula;
    private double peso;
    private double potencia;

    //Método constructor vacío
    public Coche ()
    {

    }

    //Constructor con parámetros
    public Coche (Colores color, String matriculaCoche, double pesoCoche,
                  double potenciaCoche)
    {
        this.color = color;
        this.matricula = matriculaCoche;
        this.peso = pesoCoche;
        this.potencia = potenciaCoche;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", matricula='" + matricula + '\'' +
                ", peso=" + peso +
                ", potencia=" + potencia +
                '}';
    }

    //Métodos GETTERS Y SETTERS


    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
