/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg20;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion620 {

    /**
     * @param args the command line arguments
     */
    /*
    Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de
    forma alfabética. Suponemos que cada palabra de la frase se separa de otra por un 
    único espacio.
    */
    public static void main(String[] args) {
        //pedimos se introduzca la frase
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        System.out.println();
        //Guardamos las palabras de la frase en un array que se separan por un espacio en blanco
        String[] palabras = frase.split(" ");
        //ordenamos las palabras del array
        Arrays.sort(palabras, String.CASE_INSENSITIVE_ORDER);
        //Imprimir la frase ordenada alfabeticamente
        System.out.println("Frase ordenada alfabeticamente: ");
        for (String palabra : palabras){
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
    
}
