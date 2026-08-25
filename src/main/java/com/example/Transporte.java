package com.example;

public class Transporte {

    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }

    /*
     * Getters implementados para permitir la consulta de los atributos
     * privados desde otras clases, respetando el encapsulamiento.
     * El enunciado utiliza getCombustible() en Main y requiere consultar
     * el idTransporte desde BuqueCarga, aunque no especifica estos getters
     * explícitamente en la sección de métodos.
     */

    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else if (nivel > 100) {
            this.combustible = 100;
        } else {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Valor no valido para capacidad de carga");
        } else {
            this.capacidadCarga = carga;
        }
    }

    /*
     * El enunciado indica que se debe restar 1 unidad de combustible
     * por cada 10 km recorridos.
     *
     * Fórmula implementada:
     * combustible = combustible - (distancia / 10)
     *
     * La sección "Fórmula sugerida" del enunciado aparece sin la
     * fórmula correspondiente, por lo que esta implementación fue
     * deducida a partir de la regla de consumo indicada.
     */

    public void viajar(int distancia) {
        this.combustible = this.combustible - (distancia / 10);
    }

}
