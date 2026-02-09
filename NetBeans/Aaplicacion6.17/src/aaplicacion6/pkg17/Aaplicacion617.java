/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg17;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion617 {

    /**
     * @param args the command line arguments
     */
    /*
    Construir un programa que convierta una palabra en secuencias de n letras. Por ejemplo,
    la palabra «destornillador», dividida en secuencias de 4 letras, se mostrará de la siguien-
    te forma:
    dest
    orni
    1lad
    or
    */
    public static void main(String[] args) {
        //Introducir la palabra y el tamaño de las secuencias
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra");
        String palabra = sc.nextLine();
        
        System.out.println("Introduzca el tamaño n de las secuncias en la que se quiere dividir la palabra");
        int n = sc.nextInt();
        //llamamos a el procedimiento divPalabra pasandole la palabra y el tamaño de las secuencias
        divPalabra(palabra, n);
        
        
    }
    
    static void divPalabra(String palabra, int n){
        int l = palabra.length();//guardamos en l la cantidad de caracteres de la palabra
        for (int i = 0; i < l; i += n){//recorremos la palabra hasta l-1
            if (i + n <= l){//si el indice + el largo de la secuencia es menor o igual que l 
                //hacemos un substring desde i hasta i+n
                System.out.println(palabra.substring(i, i+ n));
            } else{//hacemos un substring desde i
                System.out.println(palabra.substring(i));
            }
        }  
    }
    
}
