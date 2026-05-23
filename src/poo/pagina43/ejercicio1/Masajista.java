package poo.pagina43.ejercicio1;

public class Masajista extends Persona {
    private final String titulacion;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
    }


    public void darMasaje() {
        System.out.println("El masajista " + getNombre() + " (Lic. " + titulacion + ") está tratando a un jugador.");
    }
}
