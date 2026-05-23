package poo.pagina40.ejercicio2;

public class Main {

    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL JUEGO DE PREGUNTAS");


        Juego partida = new Juego();


        partida.jugarNivel1();


        partida.jugarNivel2();


        System.out.println("\n=======================================");
        System.out.println("          FIN DEL JUEGO          ");
        System.out.println("=======================================");
        System.out.println("PUNTUACIÓN TOTAL ACUMULADA: " + partida.getPuntajeAcumulado() + " PUNTOS.");

        if (partida.getPuntajeAcumulado() >= 60) {
            System.out.println("¡Felicidades! Eres un experto en POO. ");
        } else {
            System.out.println("Buen intento, ¡sigue practicando! ");
        }
    }
}
