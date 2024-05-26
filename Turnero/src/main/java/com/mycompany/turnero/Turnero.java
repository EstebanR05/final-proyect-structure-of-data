package com.mycompany.turnero;

import java.util.Scanner;

public class Turnero {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        menuMetodos(metodos);
    }

    public static void menuMetodos(Metodos metodos) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("-----------------MENU AGREGAR TURNO----------------");
            System.out.println("1. Agregar");
            System.out.println("2. Actualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. salir");

        } while (menu != 4);

        mostrarTurnos(metodos);
    }

    public static void mostrarTurnos(Metodos metodo) {

    }
}
