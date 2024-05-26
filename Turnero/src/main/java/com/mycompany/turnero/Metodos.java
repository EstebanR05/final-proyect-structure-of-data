package com.mycompany.turnero;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Metodos {

    private Queue<Persona> listaNoPrioridad = new LinkedList<>();
    private Queue<Persona> listaPrioridad = new LinkedList<>();

    public void crear() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre completo");
        String nombreCompleto = leer.nextLine();

        System.out.println("Ingrese el numero de cedula");
        int cedula = leer.nextInt();

        System.out.println("¿Es una prioridad? ingrese true para SI y false para NO");
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
            System.out.println("Turno n°" + turno + " Asignado a una persona PRIORITARIA");
            System.out.println("El paciente " + listaPrioridad.peek() + "\nEn espera de ser atendido");
        } else if (!this.listaNoPrioridad.isEmpty()) {
            System.out.println("Turno n°" + turno + " Asignado a una persona NO PRIORITARIA");
            System.out.println("El paciente " + listaNoPrioridad.peek() + "\nEn espera de ser atendido");
        } else {
            System.out.println("Error no hay paciente por atender");
        }
    }

    public void atenderPaciente() {
        if (!this.listaPrioridad.isEmpty()) {
            System.out.println("El paciente " + this.listaPrioridad.peek().toString());
            this.listaPrioridad.remove(this.listaPrioridad.peek());
            System.out.println("Ha sido atendido correctamente");
        } else if (!this.listaNoPrioridad.isEmpty()) {
            System.out.println("El paciente" + this.listaNoPrioridad.peek().toString());
            this.listaNoPrioridad.remove(this.listaNoPrioridad.peek());
            System.out.println("Ha sido atendido correctamente");
        } else {
            System.out.println("Error no hay paciente por atender");
        }
    }
}
