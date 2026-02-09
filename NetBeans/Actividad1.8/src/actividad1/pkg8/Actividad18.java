/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1.pkg8;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Actividad18 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayoría de edad: " + mayorEdad);
    }
    
}
