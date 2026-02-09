/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg12;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion412 {

    /**
     * @param args the command line arguments
     */
    /*
    Implementa la función
    static double distancia (double x1, double y1, double x2, double y2)
    que calcula y devuelve la distancia euclidea que separa los puntos (x1, y1) y (x2, y2). La
    fórmula para calcular esta distancia es:
    distancia = ((x1 -x2)^2 + (v1 - y2)^2)^(1/2)
    */
    public static void main(String[] args) {
        double x1, y1, x2, y2, dist;
        //Solicitamos se introduzca las coordenadas x1, y1, x2, y2
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduzca x1: ");
        x1 = sc.nextDouble();
        System.out.println("Introduzca y1: ");
        y1 = sc.nextDouble();
        System.out.println("Introduzca x2: ");
        x2 = sc.nextDouble();
        System.out.println("Introduzca y2: ");
        y2 = sc.nextDouble();
        //Mostamos el resultado por pantalla y hacemos la llamada a la funcion para que nos devuelva  la distancia
        System.out.println("La distancia entre los puntos es: " + distancia(x1, y1, x2, y2));
        
    }
    //función que calcula la distancia entre dos puntos
    static double distancia (double x1, double y1, double x2, double y2){
        double dist;
        //formula para calcular la distancia entre dos puntos
        dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return dist;//devolver distancia
        
    }
    
}
