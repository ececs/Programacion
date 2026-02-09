/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg19;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion619 {

    /**
     * @param args the command line arguments
     */
    /*
    Implementa un sencillo editor de texto que, una vez que se ha introducido el texto, 
    permita reemplazar todas las ocurrencias de una palabra por otra.
    */
    public static void main(String[] args) {
        //pedimos que se introduzca el texto
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un texto: ");
        String texto = sc.nextLine();
        //pedimos que se intraduzca la palabra a buscar
        System.out.println("Introduzca la palabra a buscar: ");
        String palabra = sc.nextLine();
        //pedimos que se introduzca la palabra que va a reemplazar
        System.out.println("Introduzca la palabra con la que quiere reemplazar");
        String palabraNueva = sc.nextLine();
        //dentro del texto reemplazamos todas las ocurrencias de palabra por palabraNueva
        texto = texto.replaceAll(palabra, palabraNueva);
        //imprimir el nuevo texto
        System.out.println(texto);
        
    }
    
}
