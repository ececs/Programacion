/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg18;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion418 {

    /**
     * @param args the command line arguments
     */
    /*
    Crea una función que muestre por consola una serie de números aleatorios enteros. Los
    parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los
    valores mínimos y máximos que estos pueden tomar.
    */
    public static void main(String[] args) {
        int cant, min, max;
        //solicitamos los datos de netrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números aleatoreos a generar: ");
        cant = sc.nextInt();
        System.out.println("Introduzca el número minimo: ");
        min = sc.nextInt();
        System.out.println("Introduzca el número maximo: ");
        max = sc.nextInt();
        //llamada a la funcion que genera los números aleatorios
        aleatorios(cant, min ,max);
    }
    
    static void aleatorios(int cant, int min, int max){
        int a;
        for (int i =1; i<=cant; i++){//bucle desde 1 hasta cant
            //formula que genera números aleatorios entre max y min
            a = (int) (min + (Math.random() * (max-min+1)));
            System.out.print(a + " ");//imprimir el número
        }
        System.out.println();
    }
    
}
