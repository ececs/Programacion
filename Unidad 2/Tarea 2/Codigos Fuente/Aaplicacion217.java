/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Aaplicacion217 {

    /**
     * @param args the command line arguments
     */
    /*
    Realiza el «juego de la suma», que consiste en que aparezcan dos números aleatorios 
    (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación 
    debe indicar si el resultado de la operación es correcto o incorrecto.
    */
    public static void main(String[] args) {
        int a, b, c;
        //Calcular dos numeros aleatorios
        a = (int) ((Math.random() * 99) + 1);
        b = (int) ((Math.random() * 99) + 1);
        //Solicitar el resultado de a + b
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto es " + a + " + " + b );
        c = sc.nextInt();
        //Imprmir en pantalla si el numero introducido es igual a a + b o si es incorrecto
        if (c == a + b){
            System.out.println("Correcto " + a + " + " + b + " es igual a " + c);
        } else{
            System.out.println("Incorrecto " + a + " + " + b + " es distinto a " + c);
        }
    }
    
}
