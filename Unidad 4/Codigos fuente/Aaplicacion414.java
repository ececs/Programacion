/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg14;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion414 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribe una función a la que se pase como parámetros de entrada una cantidad de dias, horas y minutos.
    La función calculará y devolverá el número de segundos que existe en los datos de entrada
    */
    public static void main(String[] args) {
        int dias, horas, minutos;
        //solicitamos la entrada de dias, horas y minutos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dias: ");
        dias = sc.nextInt();
        System.out.println("Introduzca la cantidad de horas: ");
        horas = sc.nextInt();
        System.out.println("Introduzca la cantidad de minutos: ");
        minutos = sc.nextInt();
        //imprimir en pantalla y llamada a la funcion para que nos devuleva los segundos
        System.out.println("En segundos son: " + segundos(dias, horas, minutos));
    }
    //funcion que calcula cuantos segundos hay en la entrada de dias horas y minutos
    static int segundos(int dias, int horas, int minutos){
        int segundos;
        //formula para calcular los segundos
        segundos = dias * 24 * 60 * 60 + horas * 60 * 60 + minutos * 60;  
        return segundos;
        
    }
    
}
