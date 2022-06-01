package com.company;

import java.util.Scanner;

public class Main {

    public static int indiceCocheMBarato(Vehiculo coches[]) {
        double precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String marca, color;
        double precio;
        int numeroVehiculos, indiceCocheBarato;

        System.out.println("Digite la cantidad de Vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del coche " + (i + 1) + ":");
            System.out.print("Introduzca la Marca: ");
            marca = entrada.next();
            System.out.print("Introduzca el Color: ");
            color = entrada.next();
            System.out.print("Introduzca el Precio: ");
            precio = entrada.nextDouble();

            coches[i] = new Vehiculo(marca, color, precio);
        }
        indiceCocheBarato = indiceCocheMBarato(coches);
        System.out.println("\n El coche mas barato es: ");
        System.out.println(coches[indiceCocheBarato].toString());
    }
}

