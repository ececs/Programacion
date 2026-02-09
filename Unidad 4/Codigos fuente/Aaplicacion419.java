/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg19;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion419 {

    /**
     * @param args the command line arguments
     */
    /*
    Sobrecarga la función realizada en la Actividad de aplicación 4.18 para que el único
    parámetro sea la cantidad de números aleatorios que se muestra por consola. Los números
    aleatorios serán reales y estarán comprendidos entre 0 y 1.
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
        if ( min < 0 || max < 0){//si min o max son menores que 0 llama a la funcion solo con el parametro cant
            aleatorios(cant);
        } else {//si min y max son mayores que 0 llama a la función teniendo en cuenta el rango
            aleatorios(cant, min ,max);
        }
        
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
    static void aleatorios(double cant){
        double a;//variable a real
        for (int i =1; i<=cant; i++){//bucle desde 1 hasta cant
            //formula que genera números aleatorios entre 0 y 1
            a = Math.random();
            System.out.print(a + " ");//imprimir el número
        }
        System.out.println();
    }
    
}
