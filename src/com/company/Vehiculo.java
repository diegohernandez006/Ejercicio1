package com.company;

public class Vehiculo {

    String marca;
    String color;
    double precio;


    public Vehiculo(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
