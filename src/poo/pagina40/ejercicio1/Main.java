package poo.pagina40.ejercicio1;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Registro de Animales (Paquete Ejercicio 1) ---");

            // Instanciar el objeto Animal (ya lo reconoce automáticamente por estar en el mismo paquete)
            Animal miAnimal = new Animal();

            System.out.print("Ingresa el nombre del animal (ej. León): ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa el orden taxonómico (ej. Carnívoro): ");
            String orden = scanner.nextLine();

            System.out.print("Ingresa la cantidad de extremidades: ");
            int extremidades = scanner.nextInt();


            miAnimal.setNombre(nombre);
            miAnimal.setOrden(orden);
            miAnimal.setExtremidades(extremidades);


            System.out.println("\n--- Ficha Técnica del Animal ---");
            System.out.println("Nombre:       " + miAnimal.getNombre());
            System.out.println("Orden:        " + miAnimal.getOrden());
            System.out.println("Extremidades: " + miAnimal.getExtremidades());

            scanner.close();
        }
    }
