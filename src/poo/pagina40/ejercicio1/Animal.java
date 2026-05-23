package poo.pagina40.ejercicio1;

public class Animal {

        private String nombre;
        private String orden;
        private int extremidades;


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getOrden() {
            return orden;
        }

        public void setOrden(String orden) {
            this.orden = orden;
        }

        public int getExtremidades() {
            return extremidades;
        }

        public void setExtremidades(int extremidades) {
            if (extremidades >= 0) {
                this.extremidades = extremidades;
            } else {
                System.out.println("⚠️ Alerta: Las extremidades no pueden ser negativas. Se asignará 0.");
                this.extremidades = 0;
            }
        }
    }
