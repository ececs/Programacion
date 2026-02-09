/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg17;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion417 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribe una función que decida si dos números enteros positivos son amigos. 
    Dos números a y b son amigos si la suma de los divisores propios (distintos de él mismo) de a
    es igual a b. Y viceversa.
    */
    public static void main(String[] args) {
        int a, b;
        //Solicitamos que se introduzcan los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir el número a: ");
        a = sc.nextInt();
        System.out.println("Introducir el número b: ");
        b = sc.nextInt();
        System.out.println("Los números a y b son amigos? " + sonAmigos(a, b));
        
    }
    static boolean sonAmigos(int a, int b){
        int sumDivA = 0;
        int sumDivB = 0;
        for (int i = 1; i < a; i++){//bucle que recorre desde 1 hasta a-1
            if (a % i == 0){//si a es disvisibles por i 
                sumDivA = sumDivA + i;//sumamos i
            } 
        }
        for (int i = 1; i < b; i++){//bucle que recorre desde 1 hasta b-1
            if (b % i == 0){//si b es disvisibles por i 
                sumDivB = sumDivB + i;//sumamos i
            } 
        }        
        //si la suma de los divisores de a es igual a b y la suma de los divisores de b es igual a a
        return (sumDivA == b &&  sumDivB == a);
    }
    
}
