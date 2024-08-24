/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asign.ind.t3;

/**
 *
 * @author Wuili Sumalé
 */

import java.util.Scanner;
        
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese anio de nacimiento de la primera persona: ");
        int anionac1 = scanner.nextInt();
        
        System.out.print("Ingrese anio de nacimiento de la segunda persona: ");
        int anionac2 = scanner.nextInt();
        
        int difedad = Math.abs(anionac1 - anionac2);
        
        if (anionac1 < anionac2){
            System.out.println("La primera persona es mayor por " + difedad + " anios ");
        } else if (anionac1 > anionac2){
            System.out.println("La segunda persona es mayor por " + difedad + " anios ");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }
        
        scanner.close();
    }
    
}
