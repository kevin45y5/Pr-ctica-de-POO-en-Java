package poo.pagina43.ejercicio1;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Demostración del Pilar de Herencia --- \n");


        Futbolista jugador = new Futbolista(1, "Lionel", "Messi", 38, 10, "Delantero");
        Entrenador tecnico = new Entrenador(2, "Lionel", "Scaloni", 48, "AFA-9921");
        Masajista kinesiologo = new Masajista(3, "Juan", "Pérez", 50, "Fisioterapia", 15);


        jugador.viajar();
        tecnico.concentrarse();
        kinesiologo.viajar();

        System.out.println();


        jugador.jugarPartido();
        tecnico.dirigirPartido();
        kinesiologo.darMasaje();
    }
}
