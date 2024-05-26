package com.mycompany.turnero;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    private ArrayList<Persona> listaNoPrioridad = new ArrayList<>();
    private ArrayList<Persona> listaPrioridad = new ArrayList<>();

    public void crear() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre completo");
        String nombreCompleto = leer.nextLine();

        System.out.println("Ingrese el numero de cedula");
        int cedula = leer.nextInt();

        System.out.println("¿es una prioridad? ingrese true para si y false para No");
        boolean prioridad = leer.nextBoolean();

        Persona persona = new Persona(nombreCompleto, cedula, prioridad);

        if (prioridad == true) {
            this.listaPrioridad.add(persona);
        } else {
            this.listaNoPrioridad.add(persona);
        }
    }

    public void mostrarTurnos(int turno) {
        if (!this.listaPrioridad.isEmpty()) {
            System.out.println("Turno n° " + turno + " Asignado a una persona con prioridad");
            System.out.println("el parciente: " + this.listaPrioridad.get(0).toString());
            eliminar(0);
        } else {
            System.out.println("Turno n° " + turno + " Asignado a una persona No prioritaria");
            System.out.println("el parciente: " + this.listaNoPrioridad.get(0).toString());
            eliminar(0);
        }
    }

    private void eliminar(int indice) {
        if (!this.listaPrioridad.isEmpty()) {
            this.listaPrioridad.remove(indice);
        } else {
            this.listaNoPrioridad.remove(indice);
        }

        System.out.println("El paciente ha sido atendido correctamente");
    }
}
