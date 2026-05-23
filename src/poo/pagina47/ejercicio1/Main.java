package poo.pagina47.ejercicio1;

public class Main {

    public static void main(String[] args) {

        Vehiculo auto = new Automovil();
        Vehiculo barco = new Barco();
        Vehiculo avion = new Avion();

        auto.mover();
        barco.mover();
        avion.mover();
    }
}