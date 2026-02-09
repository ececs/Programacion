/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1.pkg4;
import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Actividad14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nacimiento, año;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su año de nacimiento: ");
        nacimiento = sc.nextInt();
        System.out.println("Escriba el año actual: ");
        año = sc.nextInt();
        System.out.println("Usted tiene " + (año-nacimiento) + " años.");   
    }
    
}
