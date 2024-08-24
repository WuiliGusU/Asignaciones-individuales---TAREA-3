/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Wuili Sumalé
 */
import java.util.Scanner;

abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract void agregar_cantidad(int cantidad);
    public abstract void vender(int cantidad);

    public void consultar_inventario() {
        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad disponible: " + cantidad);
    }
}

class Electronico extends Producto {
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public void agregar_cantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se han agregado " + cantidad + " unidades. Total en inventario: " + this.cantidad);
        } else {
            System.out.println("Cantidad invalida para agregar.");
        }
    }

    @Override
    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades. Total en inventario: " + this.cantidad);
        } else {
            System.out.println("No se puede realizar la operacion. Cantidad insuficiente en inventario.");
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Electronico telefono = new Electronico("Telefono", 299.99, 50);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Consultar inventario");
            System.out.println("2. Agregar al inventario");
            System.out.println("3. Vender producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    telefono.consultar_inventario();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a agregar: ");
                    int cantidadAgregar = scanner.nextInt();
                    telefono.agregar_cantidad(cantidadAgregar);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadVender = scanner.nextInt();
                    telefono.vender(cantidadVender);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}

