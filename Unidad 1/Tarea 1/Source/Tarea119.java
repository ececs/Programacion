/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg19;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea119 {

    /**
     * @param args the command line arguments
     */
    /*
    Aplicacion para la gestion de el precio de las entradas. Solicita la 
    cantidad de adultos y de niños y devuelve el total a pagar aplicando un 
    descuento del 5% por encima de 100€.
    */
    public static void main(String[] args) {
        //Constantes con los precios de las entradas.
        final double ENTRADA_INFANTIL = 15.5;
        final double ENTRADA_ADULTO = 20.0;
        
        int cantidadAdultos, cantidadNiños;
        double total;
        
        //Pide por pantalla la entrada de la cantidad de adultos y de niños.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cantidad de adultos: ");
        cantidadAdultos = sc.nextInt();
        System.out.println("Introduzca cantidad de niños: ");
        cantidadNiños = sc.nextInt();
        
        //Calcula el precio total de las entradas
        total = cantidadAdultos * ENTRADA_ADULTO + cantidadNiños * ENTRADA_INFANTIL;
        
        //En caso de ser mas de 100€ aplica un descuento del 5%.
        total = total < 100 ? total : total * 0.95 ;
        
        //Mostrar por pantalla el total a pagar.
        System.out.println("Total a pagar: " + total + " €.");
    }
    
}
