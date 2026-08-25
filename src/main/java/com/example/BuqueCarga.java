package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("Buque de carga con ID: " + getIdTransporte() + "\nListo para descarga");
    }

    public void mostrarDatos() {
        System.out.println(
                "ID Transporte: "+getIdTransporte()+"\nCantidad de contenedores: "+cantidadContenedores);
    /*
    * Pendiente: el enunciado solicita calcular el Costo de Viaje en USD,
    * pero no proporciona la fórmula, tarifa o base necesaria para realizar
    * dicho cálculo. Se espera confirmación del profesor.
    */
    }
}