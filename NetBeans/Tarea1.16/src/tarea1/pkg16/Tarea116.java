/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg16;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
/*
Aplicacion que solicite una cantidad de segundos y muestre a cuantas 
horas, minutos y segundos equivale.
*/
public class Tarea116 {

    
    public static void main(String[] args) {
        int entradaSegundos, horas, minutos, segundos;
            
        //Solicitamos la cantidad de segundos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de segundos a convertir: ");
        entradaSegundos = sc.nextInt();
        
        //Hacemos el calculo de las horas, minutos y segundos
        horas = entradaSegundos / 3600;
        minutos = (entradaSegundos % 3600) / 60;
        segundos = entradaSegundos % 60;
        
        //Mostrar en salida estandar el resultado
        System.out.println("Equivale a : " + horas + " Horas, " + minutos + " Minutos, " + segundos + " Segundos. ");
            
    }
    
}
