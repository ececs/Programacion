/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion2.pkg11;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
public class Aaplicacion211 {
    /**
     * @param args the command line arguments
     */
    /*
    Escribe una aplicación que solicite al usuario un número comprendido entra 0 y 9999.
    La aplicación tendrá que indicar si el número introducido es capicúa. 
    */
    public static void main(String[] args) {
        int num, u, d, c, m;
        boolean esCapicua = false;
        //solicitar el número
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entre 0 y 9999: ");
        num = sc.nextInt();
        //Si el numero esta fuera de rango lo muestra en pantalla si es menor que 10 es capicúa, 
        if ( num < 0 || num > 9999 ){
            System.out.println("el número esta fuera de rango");
        } else if ( num < 10){//los números menores a 10 son capicúas
            esCapicua = true;
        } else if ( num > 10 && num < 100){
            //Si el número esta entre 10 y 100 calculamos unidades, decenas y si son iguales es capicua
            u = num % 10;
            d = num / 10;
            esCapicua = u == d;
        }  else if ( num > 100 && num < 1000) {
            //Si num esta entre 100 y 1000  calculamos unidades, centenas y comparamos. Si son iguales es capicúa
            u = num % 10;
            c = num / 100;
            esCapicua = u == c;
        } else {
            //Si el número esta entre 1000 y 9999 calculamos unidades, decenas, 
            //centenas y miles y compramos unidades con miles y decenas con centenas. Si son iguales es capicúa
            u = num % 10;
            d = ( num / 10) %10 ;
            c = ( num / 100 ) % 10;
            m = num / 1000;
            esCapicua = u == m && d == c;
        }
        //imprimir en pantalla
        if (esCapicua){
            System.out.println("El número " + num + " es capicúa.");
        } else{
            System.out.println("El número " + num + " no es capicúa.");
        }
        
    }    
    
}
