/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg22;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea122 {

    /**
     * @param args the command line arguments
     */
    /*
    Se pide que introduzca una longitud en decimales con tantos decimales como 
    se desee y se devuelve la parte entera en centimetros.
    */
    public static void main(String[] args) {
        double dist;
        int distCentimetros;
        
        //solicitammos por pantalla la entrada de la longitud en metros con 
        //tantos decimales como se desee
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduzca la longitud del lanzamiento en metros con decimales: ");
        dist = sc.nextDouble();
        
        //Convertimos a centimetros y nois quedamos con la parte entera.
        distCentimetros = (int) (dist * 100);
        
        //Devolvemos por pantalla la distancia en centimetros sin decimales.
        System.out.println("La distancia es de : " + distCentimetros + " centimetros.");
    }
    
}
