package poo.pagina47.ejercicio2;

public class Empleado extends Personal {

    public Empleado(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Sueldo: $" + sueldo);
    }
}