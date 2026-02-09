/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion4.pkg16;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion416 {

    /**
     * @param args the command line arguments
     */
    /*
    Implementa la función divisoresPrimos () que muestra, por consola, todos los divisores
    primos del número que se le pasa como parámetro.
    */
    public static void main(String[] args) {
        int num;
        //solicitamos que se introduzca el número del cual se quieren calcular sus divisores primos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        System.out.print("Los divisores primos de n son: ");
        divisoresPrimos(num);//llamada a la funcion que calcula los divisores primos de num
    }
    
    public static void divisoresPrimos(int num) {
        for (int i = 2; i <= num; i++) {//bucle de 2 hasta num para calcular los divisores primos
            if (num % i == 0 && esPrimo(i)) {//si i es divisor y es primo.
                System.out.print(i + " ");//imprimir en pantalla los numeros divisores y primos
            }
        }
        System.out.println();
    }

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num <= 1) {//si num es menor o igual a 1 no es primo
            esPrimo = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {//recorremos desde 2 hasta la raiz cuadrada de num
            if (num % i == 0) {//si num es divisible por i con resto cero
                esPrimo = false;//no es primo
            }
        }
        return esPrimo;//devolvemos esPrimo
    }
    
}
