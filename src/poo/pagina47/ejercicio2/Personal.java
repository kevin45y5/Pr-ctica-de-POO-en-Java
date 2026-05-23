package poo.pagina47.ejercicio2;

public abstract class Personal {

    protected String nombre;
    protected double sueldo;

    public Personal(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void registrar() {
        System.out.println("Empleado registrado: " + nombre);
    }

    public abstract void calcularSueldo();
}