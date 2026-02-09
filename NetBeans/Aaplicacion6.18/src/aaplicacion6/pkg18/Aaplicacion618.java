/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion618 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier
    combinación de mayúsculas y minúsculas) en el nombre de una variable que utilice la no-
    menclatura Camel. Por ejemplo, la frase «Me GUsta merenDAR gaLLEtas», se convertirá
    en «meGustaMerendar Galletas».
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        //guardamos en frase convirtiendo la primera letra a minuscula
        frase = Character.toLowerCase(frase.charAt(0)) + frase.substring(1);
        String palabras[] = frase.split(" ");//pasamos la frase a un array separando 
        //las palabras por el espacio en blanco
        for (int i = 1; i < palabras.length; i++){//Recorremos cada palabra menos la primera y 
            //ponemos la primera letra en mayusculas
            palabras[i] = Character.toUpperCase(palabras[i].charAt(0)) +  palabras[i].substring(1);
        }
        //imprimir la nueva palabra
        for (int i = 0; i < palabras.length; i++){
            System.out.print(palabras[i]);
        }
        System.out.println();
            
    }
    
}
