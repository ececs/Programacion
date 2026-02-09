/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1.pkg6;
import java.util.Scanner;
/**
 *
 * @author eudal
 */
public class Actividad16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Nota 2: ");
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2.0;
        System.out.println("La media es: " + media);
    }
    
}
