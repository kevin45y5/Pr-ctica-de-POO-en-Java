package poo.pagina40.ejercicio2;

import java.util.Scanner;

    class Juego {

        private int puntajeAcumulado;
        private final Scanner scanner;


        public Juego() {
            this.puntajeAcumulado = 0;
            this.scanner = new Scanner(System.in);
        }


        public void jugarNivel1() {
            System.out.println("\n=======================================");
            System.out.println("          INICIANDO NIVEL 1        ");
            System.out.println("=======================================");
            System.out.println("Reglas: +10 puntos por acierto, 0 por error.\n");


            System.out.println("1. ¿Qué significa POO en programación?");
            System.out.println("A) Programación Orientada a Objetos\nB) Procesos de Optimización Operativa");
            System.out.print("Tu respuesta (A/B): ");
            String r1 = scanner.nextLine().toUpperCase().trim();
            if (r1.equals("A")) {
                System.out.println("¡Correcto! +10 puntos.");
                puntajeAcumulado += 10;
            } else {
                System.out.println("Incorrecto. Era la opción A.");
            }


            System.out.println("\n2. ¿Cuál es el archivo principal de ejecución en Java?");
            System.out.println("A) El método class\nB) El método main");
            System.out.print("Tu respuesta (A/B): ");
            String r2 = scanner.nextLine().toUpperCase().trim();
            if (r2.equals("B")) {
                System.out.println("¡Correcto! +10 puntos.");
                puntajeAcumulado += 10;
            } else {
                System.out.println("Incorrecto. Era la opción B.");
            }

            System.out.println("\n ¡Fin del Nivel 1! Puntos actuales: " + puntajeAcumulado);
        }


        public void jugarNivel2() {
            System.out.println("\n=======================================");
            System.out.println("          INICIANDO NIVEL 2         ");
            System.out.println("=======================================");
            System.out.println("Reglas: +20 puntos por acierto, -10 por error.\n");


            System.out.println("1. ¿Cuál de estos pilares de POO oculta las propiedades de una clase?");
            System.out.println("A) Herencia\nB) Encapsulamiento\nC) Polimorfismo");
            System.out.print("Tu respuesta (A/B/C): ");
            if (scanner.nextLine().toUpperCase().trim().equals("B")) {
                System.out.println("¡Excelente! +20 puntos.");
                puntajeAcumulado += 20;
            } else {
                System.out.println(" Incorrecto. Pierdes 10 puntos.");
                puntajeAcumulado -= 10;
            }


            System.out.println("\n2. Para comparar el contenido de dos String en Java de forma segura se usa:");
            System.out.println("A) El operador ==\nB) El método .equals()\nC) El método .compare()");
            System.out.print("Tu respuesta (A/B/C): ");
            if (scanner.nextLine().toUpperCase().trim().equals("B")) {
                System.out.println("¡Excelente! +20 puntos.");
                puntajeAcumulado += 20;
            } else {
                System.out.println(" Incorrecto. Pierdes 10 puntos.");
                puntajeAcumulado -= 10;
            }


            System.out.println("\n3. ¿Qué palabra clave se usa para definir una constante en Java?");
            System.out.println("A) static\nB) const\nC) final");
            System.out.print("Tu respuesta (A/B/C): ");
            if (scanner.nextLine().toUpperCase().trim().equals("C")) {
                System.out.println("¡Excelente! +20 puntos.");
                puntajeAcumulado += 20;
            } else {
                System.out.println("Incorrecto. Pierdes 10 puntos.");
                puntajeAcumulado -= 10;
            }


            System.out.println("\n4. Si declaras un vector como 'int[] v = new int[5]', ¿cuál es el último índice válido?");
            System.out.println("A) 4\nB) 5\nC) 6");
            System.out.print("Tu respuesta (A/B/C): ");
            if (scanner.nextLine().toUpperCase().trim().equals("A")) {
                System.out.println("¡Excelente! +20 puntos.");
                puntajeAcumulado += 20;
            } else {
                System.out.println("Incorrecto. Pierdes 10 puntos.");
                puntajeAcumulado -= 10;
            }
        }


        public int getPuntajeAcumulado() {
            return puntajeAcumulado;
        }
    }
