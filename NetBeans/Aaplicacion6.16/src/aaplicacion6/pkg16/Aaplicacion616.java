/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg16;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion616 {

    /**
     * @param args the command line arguments
     */
    /*
    Lee una palabra o frase y muestra el proceso en el que cada letra se sustituye por otro
    simbolo no alfabético. Por ejemplo el carácter 'a' se podría sustituir por el carácter '@', la
    'e' por '€', la 'i' por '1', etcétera.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        final char conjunto1[] = {'a', 'e', 'i', 'o', 'u'};
        final char conjunto2[] = {'@', '€', '1', '0', '#'};
        char codificado[]; //tabla que contendrá la codificación del texto introducido
        String texto;
        System.out .print("Introduzca un texto a codificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase(); //convertimos el texto a minúscula, para poder
        //codificar las mayúsculas y las minúsculas con el mismo conjunto.
        codificado = new char[texto.length()];//creanos una tabla de igual tamaño
        for (int i = 0; i < texto.length(); i++) {// recorremos el texto a codificar
            //codificamos el i-ésimo carácter del texto
            codificado[i] = codifica(conjunto1, conjunto2, texto.charAt(i));
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
            //imprimir el proceso por el que mantenemos la letra
            System.out.println("Mantenemos  '" + c + "'");
        } else{
            codificado = conjunto2[pos]; //pos marca la posicion de c en conjunto1
            //entonces elejimos el correspondiente conjunto2
            //imprimir el proceso por el que sustituimos una letra por su letra codificada
            System.out.println("Sustituimos '" + c + "' por '" + conjunto2[pos] + "'");
        }
        return codificado;
    }
    
}
