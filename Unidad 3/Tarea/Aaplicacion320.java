/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion3.pkg20;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
/*
Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que
dispone. Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en un
cajón y en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone
el usuario .
La manera de especificar que no se desea introducir más cantidades es mediante el cero.
*/
public class Aaplicacion320 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total, dinero ;
        //crear sc de la clase Scanner
        Scanner sc = new Scanner(System.in);
        total = 0;//inicializar total a 0
        do {//bucle para introducir distintas cantidades de dinero hasta que se introduzca 0
            System.out.println("Introduza la cantidad de dinero: ");
            dinero = sc.nextDouble();
            total = total + dinero;//sumamos dinero al total
        } while (dinero!=0);
        //imprimir total en pantalla
        System.out.println("La cantidad total de dinero es: " + total);
    }
    
}
