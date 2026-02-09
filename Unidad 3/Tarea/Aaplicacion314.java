/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion3.pkg14;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
/*
Realiza un programa que nos pida un número n, y nos diga cuántos números hay entre 1
y n que sean primos. Un número primo es aquel que solo es divisible por 1 y por él mis-
mo.
*/
public class Aaplicacion314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, n;
        int numPrimos = 0;//variable para contar contar los números primos e inicializar a 0
        boolean esPrimo;//variable para controlar si un número es primo
        //soliciatmos que se introduzca el número
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n = sc.nextInt();
        //bucle para recorrer los números desde 2 hasta n
        for (j = 2; j <= n; j++){
            esPrimo = true;//inicializar
            if (j <= 1){//si es 1 o menor no es primo
                esPrimo = false;
                break;//salimos del bucle
            } else {//si es mayor que 1
                for (i = 2; i <= Math.sqrt(j); i++){//bucle que recorre el divisor hasta su raiz cuadrada
                    if (j % i == 0){//si el resto de la division es 0
                        esPrimo = false;//tine alñgun divisor mas ademas de el propio numero
                        break;//salimos del bucle
                    }    
                }
            }
            //si ha esPrimo continua siendo true
            if (esPrimo == true) {
                numPrimos++;//incrementar la cantidad de números primos
            }
        }
        //Imprimir en pantalla el resultado
        System.out.println("Hay un total de : " + numPrimos + " números primos");
    }
    
}
