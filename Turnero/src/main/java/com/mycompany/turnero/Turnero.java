package com.mycompany.turnero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Turnero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Metodos metodos = new Metodos();
        int turno = 0;

        int menu = 0;

        do {
            try {
                System.out.println("-----------------MENU AGREGAR TURNO----------------");
                System.out.println("1. Agregar nuevo turno");
                System.out.println("2. Mostrar el turno que sera atendido");
                System.out.println("3. Atender Paciente");
                System.out.println("4. Salir");
                System.out.println("--------------------------------------------------\n");

                System.out.println("Ingrese la opcion a seleccionar");
                menu = leer.nextInt();

                switch (menu) {
                    case 1:
                        metodos.crear();
                        break;
                    case 2:
                        turno += 1;
                        metodos.mostrarTurnos(turno);
                        break;
                    case 3:
                        metodos.atenderPaciente();
                        break;
                    case 4:
                        System.out.println("Gracias por utilizar nuestro programa");
                        break;
                    default:
                        System.out.println("Esta opcion no es valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Esta opción no es válida. Por favor, ingrese un número.");
                leer.next();
            }
        } while (menu != 4);
    }
}
