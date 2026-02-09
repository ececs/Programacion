/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion3.pkg19;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
/*
Calcula la raíz cuadrada de un número natural mediante aproximaciones. En el caso de
que no sea exacta, muestra el resto.
*/
public class Aaplicacion319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, r;
        int raiz = 0;
        //introducir el número
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número: ");
        n = sc.nextInt();
        
        while ( raiz * raiz  <= n ){//mientras raiz al cuadrado sea menor o igual que n
            raiz++;//incrementar aprox
        }
        raiz--;//restamos el incremento final que se hace en el bucle
        
        r = n  - raiz * raiz;//resto es n menos raiz al cuadrado
        //imprimir en pantalla el resultado
        
        //imprimir el resultado si el resto existe se imprime la raiz cuadrada aproximada y el resto
        if ( r > 0 ){
            System.out.println("La raiz cuadrada aproximada a " + n + " es " + raiz + " Con un resto de " + r);
        } else {
            System.out.println("La raiz cuadrada de " + n + " es " + raiz);
        }
    }
    
}
