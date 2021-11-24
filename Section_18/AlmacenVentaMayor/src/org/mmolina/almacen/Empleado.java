package org.mmolina.almacen;

public class Empleado extends Persona {
    private int idEmpleado;

    public Empleado(String nombre, String apellido, int idEmpleado) {
        super(nombre, apellido);
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + " , idEmpleado: " + idEmpleado;
    }
}
