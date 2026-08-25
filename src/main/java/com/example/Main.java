package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un CamionDeReparto con refrigeración activa
        CamionDeReparto camion = new CamionDeReparto(
                "CAM-001",
                100,
                5000,
                true);

        // Crear un BuqueCarga con 50 contenedores
        BuqueCarga buque = new BuqueCarga(
                "BUQ-001",
                100,
                20000,
                50);

        // Probar la validación del combustible
        camion.setCombustible(-20);

        System.out.println("Combustible del camion: "
                + camion.getCombustible());

        // Mostrar información del buque
        buque.atracarEnPuerto();

        // Crear la flota utilizando polimorfismo
        ArrayList<Transporte> flota = new ArrayList<>();

        flota.add(camion);
        flota.add(buque);

        // Hacer que todos los transportes recorran 100 km
        for (Transporte transporte : flota) {
            transporte.viajar(100);
        }
    }
}
