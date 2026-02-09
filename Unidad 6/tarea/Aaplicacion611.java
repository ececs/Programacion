/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg11;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion611 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribe un programa descodificador que muestre un texto codificado con el programa
    realizado en la Actividad resuelta 6.11.
    Intercambiar las constantes
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char codificado[]; //tabla que contendrá la codificación del texto introducido
        String texto;
        System.out .print("Introduzca un texto a decodificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase(); //convertimos el texto a minúscula, para poder
        //codificar las mayúsculas y las minúsculas con el mismo conjunto.
        codificado = new char[texto.length()];//creanos una tabla de igual tamaño
        for (int i = 0; i < texto.length(); i++) {// recorremos el texto a codificar
            //codificamos el i-ésimo carácter del texto
            codificado[i] = codifica(conjunto2, conjunto1, texto.charAt(i));
            //modificamos el programa haciendo la llamada a la función codifica 
            //intercambiando conjunto1 y conjunto2 para que decodifique
        }
        texto = String. valueOf(codificado); //convertinos la tabla con la codificación
        //en una cadena
        System.out.println(texto);
    }
    
    static char codifica(char conjunto1[], char conjunto2[], char c){
        final String conj1 = String.valueOf(conjunto1);//conj1 es un String con los 
        //elementos de la tabla conjunto1. Facilita la busqueda
        char codificado; //carácter codificado correspondiente a c
        int pos = conj1.indexOf(c); //buscamos c en el conjunto 1. Al ser conj1 una
        //cadena, indexOf() busca pòr nosotros. En otro caso, tendriamos que buscar
        //medianteun bucle un elemento en la tabla
        if (pos == -1) {//si no hemos encontrado c en comj1
            codificado = c; //no podemos codificar, devolvemos c
        } else{
            codificado = conjunto2[pos]; //pos marca la posicion de c en conjunto1
            //entonces elejimos el correspondiente conjunto2
        }
        return codificado;
    }
}
