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
            System.out.println("Turno n° " + turno + " Asignado a una persona PRIORITARIA");
            System.out.println("Atencion al cliente " + this.listaPrioridad.peek().toString() + " Sera atendido");
            this.listaPrioridad.remove(this.listaPrioridad.peek());
        } else {
            System.out.println("Turno n° " + turno + " Asignado a una persona NO PRIORITARIA");
            System.out.println("Atencion al cliente " + this.listaNoPrioridad.peek().toString() + " Sera atendido");
            this.listaNoPrioridad.remove(this.listaNoPrioridad.peek());
        }

        System.out.println("El paciente ha sido atendido correctamente");
    }

}
