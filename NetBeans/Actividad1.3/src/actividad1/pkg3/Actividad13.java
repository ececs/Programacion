/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1.pkg3;
import java.util.Scanner;
/**
 *
 * @author eudal
 */
public class Actividad13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        edad = sc.nextInt();
        edad= edad + 1;
        System.out.println("El proximo año usted tendra: " + edad + " años");
    }
    
}
