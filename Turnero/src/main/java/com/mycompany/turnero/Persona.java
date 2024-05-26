package com.mycompany.turnero;

public class Persona {

    private String nombreCompleto;
    private int cedula;
    private boolean prioridad;

    public Persona(String nombreCompleto, int cedula, boolean prioridad) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.prioridad = prioridad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", cedula=" + cedula + ", prioridad=" + prioridad + '}';
    }

}
