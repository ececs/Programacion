/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg15;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea115 {

    /**
     * @param args the command line arguments
     */
    /*
    Dado un polinomio de grado 2, hacer un programa que pida los coeficientes 
    a, b ,c y el valor de x y calcule y.
    */
    public static void main(String[] args) {
        double a, b, c, x, y;
        //Creamos un objeto Scanner y solicitamos los valores de a, b ,c y x
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el valor del coeficiente a:");
        a = sc.nextDouble();
        System.out.println("introduzca el valor del coeficiente b:");
        b = sc.nextDouble();
        System.out.println("introduzca el valor del coeficiente c:");
        c = sc.nextDouble();
        System.out.println("introduzca el valor del coeficiente x:");
        x = sc.nextDouble();
        
        //Calculamos el valor de y para los coeficientes dados y el valor de x
        y = a* Math.pow(x, 2) + b * x + c;
        
        //Devolvemos por pantalla el valor de y
        System.out.println("Para los valores introducidos el valor de y = " + y );
       
    }
    
}
