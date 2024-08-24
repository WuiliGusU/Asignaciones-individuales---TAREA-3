/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Wuili Sumalé
 */

public class Ejercicio2 {

    
    static class Libro {
    
        private String titulo;
        private String autor;
        private boolean disponible;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = true; 
        }

        public void prestar() {
            if (disponible) {
                disponible = false;
                System.out.println("El libro '" + titulo + "' ha sido prestado.");
            } else {
                System.out.println("El libro '" + titulo + "' no esta disponible para prestamo.");
            }
        }

        public void devolver() {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto y ahora esta disponible.");
        }

        public void consultar_disponibilidad() {
            if (disponible) {
                System.out.println("El libro '" + titulo + "' esta disponible para prestamo.");
            } else {
                System.out.println("El libro '" + titulo + "' no esta disponible para prestamo.");
            }
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Lujuria", "Eva Munoz");

        libro1.consultar_disponibilidad(); 

        libro1.prestar(); 

        libro1.prestar(); 
        
        libro1.devolver(); 

        libro1.consultar_disponibilidad(); 
    }
}
