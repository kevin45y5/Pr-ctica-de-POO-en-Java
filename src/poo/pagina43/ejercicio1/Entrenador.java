package poo.pagina43.ejercicio1;

public class Entrenador extends Persona {

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
    }


    public void dirigirPartido() {
        System.out.println("El DT " + getNombre() + " está dando indicaciones estratégicas en el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El DT " + getNombre() + " está coordinando la sesión de entrenamiento.");
    }
}
