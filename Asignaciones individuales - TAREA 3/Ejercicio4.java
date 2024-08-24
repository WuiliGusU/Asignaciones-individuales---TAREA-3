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

abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double salario_base;

    public Empleado(String nombre, int id, double salario_base) {
        this.nombre = nombre;
        this.id = id;
        this.salario_base = salario_base;
    }

    public abstract double calcularSalario();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: " + salario_base);
    }
}

class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, int id, double salario_base) {
        super(nombre, id, salario_base);
    }

    @Override
    public double calcularSalario() {
        return salario_base;
    }
}

class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    // Constructor
    public EmpleadoPorHoras(String nombre, int id, double salario_base, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, salario_base);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Crear Empleado Asalariado");
            System.out.println("2. Crear Empleado por Horas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Crear Empleado Asalariado
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreAsalariado = scanner.nextLine();
                    System.out.print("Ingrese el ID del empleado: ");
                    int idAsalariado = scanner.nextInt();
                    System.out.print("Ingrese el salario base: ");
                    double salarioBaseAsalariado = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer

                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(nombreAsalariado, idAsalariado, salarioBaseAsalariado);
                    empleadoAsalariado.mostrarInformacion();
                    System.out.println("Salario Calculado: " + empleadoAsalariado.calcularSalario());
                    break;

                case 2:
                    // Crear Empleado por Horas
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombrePorHoras = scanner.nextLine();
                    System.out.print("Ingrese el ID del empleado: ");
                    int idPorHoras = scanner.nextInt();
                    System.out.print("Ingrese el salario base (no usado en calculo para empleados por horas): ");
                    double salarioBasePorHoras = scanner.nextDouble();
                    System.out.print("Ingrese las horas trabajadas: ");
                    int horasTrabajadas = scanner.nextInt();
                    System.out.print("Ingrese la tarifa por hora: ");
                    double tarifaPorHora = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer

                    EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(nombrePorHoras, idPorHoras, salarioBasePorHoras, horasTrabajadas, tarifaPorHora);
                    empleadoPorHoras.mostrarInformacion();
                    System.out.println("Salario Calculado: " + empleadoPorHoras.calcularSalario());
                    break;

                case 3:
                    // Salir del programa
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no válida.");
            }
        }
        scanner.close();
    }
}

