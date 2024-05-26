package com.mycompany.turnero;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    ArrayList<Persona> listaNoPrioridad = new ArrayList<>();
    ArrayList<Persona> listaPrioridad = new ArrayList<>();

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

    public void actualizar() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el indice del usuario a editar");
        Integer indice = leer.nextInt();
        leer.nextLine();

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

    public void eliminar() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el indice del usuario a editar");
        Integer indice = leer.nextInt();

        System.out.println("¿es una prioridad? ingrese true para si y false para No");
        boolean prioridad = leer.nextBoolean();

        if (prioridad == true) {
            this.listaPrioridad.remove(indice);
        } else {
            this.listaNoPrioridad.remove(indice);
        }
    }
}
