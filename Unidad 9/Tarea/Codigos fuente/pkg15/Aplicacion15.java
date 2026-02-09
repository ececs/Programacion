/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
En el archivo numeros.txt disponemos de una serie de números (uno por cada línea). 
Diseña un programa que procese el fichero y nos muestre el menor y el mayor.
*/
public class Aplicacion15 {
    public static void main(String[] args){
        String archivo = "numeros.txt";
        int[] numeros;
        if(archivo != null){//si el archivo es distinto de null
            numeros = leerNumeros(archivo);//usamos el metodo leerNumeros
            Arrays.sort(numeros);//ordenamos el array
            int menor = numeros[0];//sacamos el menor
            int mayor = numeros[numeros.length-1];//sacamos el mayor
        System.out.println("EL mayor es : " + mayor + " El menor es: " + menor);
        } else {
            System.out.println("Error al leer el archivo");
        }
    }
    //metodo para leer un número por linea del archivo de texto, devuelve un array de los numeros 
    private static int[] leerNumeros(String archivo){
        int aux[] = new int[0];
        try(FileReader leer = new FileReader(archivo); BufferedReader bufferLeer = new BufferedReader(leer)){
            String linea;
            while ((linea = bufferLeer.readLine()) != null){
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length-1] = Integer.parseInt(linea); 
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return aux;
    }
}

