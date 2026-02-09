/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg11;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion411 {

    /**
     * @param args the command line arguments
     */
    /*
    Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
    */
    public static void main(String[] args) {
        double radio;
        //Solicitamos que se introduzca el radio
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio de la esfera: ");
        radio = sc.nextDouble();
        supVol(radio);//llamada a la funcion supVol con el radio como argumento
    }
    
    static void supVol (double radio){
        double superficie, volumen;
        superficie = 4 * Math.PI * Math.pow(radio, 2);//formula para calcular la superficie
        volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);//forula para calcular el volumen
        System.out.println("La superficie de la esferea es: " + superficie);//mostramos la superficie por pantalla
        System.out.println("El volumen de la esferea es: " + volumen);//mostramos el volumen por pantalla
    }


}

