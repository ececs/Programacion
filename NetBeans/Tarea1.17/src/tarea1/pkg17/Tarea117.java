/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg17;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
/*
Programa que solicita tres distancias, la primera en milimetros, la segunda en 
centimetros y la tercera en metros. Sumamos las tres longitudes y devolvemos la suma en centimetros
*/
public class Tarea117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int medidaTotal, medidaMm, medidaCm, medidaM;
        //Solicita la entrada de las tres longitudes.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primer medida en milimetros: ");
        medidaMm = sc.nextInt();
        System.out.println("Introduzca la segunda medida en centimetros: ");
        medidaCm = sc.nextInt();
        System.out.println("Introduzca la tercera medida en metros: ");
        medidaM = sc.nextInt();
        //Calcula la suma haciendo la conversión a centimetros en cada caso.
        medidaTotal = (medidaMm/10) + medidaCm + (medidaM*100);
        //Devolvemos por pantalla la medida total en centimetros.
        System.out.println("La medida totatl es : " + medidaTotal + " centimetros.");
    }
    
}
