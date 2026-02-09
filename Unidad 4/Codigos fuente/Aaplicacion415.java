/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg15;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion415 {

    /**
     * @param args the command line arguments
     */
    /*
    Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo,
    con el siguiente prototipo:
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
    La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados.
    */
    public static void main(String[] args) {
        //soliciatmos la entrada de los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca hora 1: ");
        int hora1 =sc.nextInt();
        System.out.println("Introduzca minuto 1: ");
        int minuto1 =sc.nextInt();
        System.out.println("Introduzca hora 2: ");
        int hora2 =sc.nextInt();
        System.out.println("Introduzca minuto 2: ");
        int minuto2 =sc.nextInt();
        //imprimir por pantalla y llamada a la funcion que calcula la diferencia entre los instantes
        System.out.println("La diferencia en miutos es : " + diferenciaMin(hora1, minuto1, hora2, minuto2));
    }
    
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        int min1, min2, diferencia;
        min1 = hora1 * 60 + minuto1;//calculamos los minutos totalesdel primer instante
        min2 = hora2 * 60 + minuto2;//calculamos los minutos totalesdel segundo instante
        if (min1 < min2){//si min1 < min2
            diferencia = min2 - min1;//formula que calcula la difrencia
        }else{//si min1 >= min2
            diferencia = min1 - min2;//formula que calcula la difrencia
        }
        return diferencia;//devolver la diferencia
    }
}
