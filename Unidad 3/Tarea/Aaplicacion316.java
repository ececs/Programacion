/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion3.pkg16;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
/*
Solicita al usuario un número n y dibuja un triángulo de base y altura n,
*/
public class Aaplicacion316 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //solicitamos se introduzca el número n
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){//bucle que recorre i desade 0 hasta n-1
            for (int j = 0; j < n-i-1; j++){//bucle quer recorre j desde 0 hasta n-i-2
                System.out.print(" ");//imprimir un espacio
            }
            for(int k=0; k <= i; k++){//bucle que recorre k desde 0 hasta i
                System.out.print("* ");//imprimir un asterizco y un espacio
            }
            System.out.println();//pasa a la siguiente linea
        }
    }
    
}
