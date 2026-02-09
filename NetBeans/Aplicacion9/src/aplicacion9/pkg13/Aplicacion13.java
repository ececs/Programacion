/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion8.pkg13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
Implementa un programa que lea dos listas de números enteros no ordenados de sendos
archivos con un número por línea, los reúna en una lista única y los guarde en orden
creciente en un tercer archivo, de nuevo uno por línea.
*/
public class Aplicacion13 {
    public static void main(String[] args){
        String archivo1 = "lista1.txt";
        String archivo2 = "lista2.txt";
        String archivoOrdenado = "listaOrdenada.txt";
        int[] lista1 = new int[0];//Creamos dos Arrays para guardar los elementos de cada lista
        int[] lista2 = new int [0];
        //Si ambas listas son distintas de null llamamos a la funcion leerNumeros
        //guardamso acada lista en un array los fusionamos y lo ordenamos
        if(lista1 != null && lista2 != null){
            lista1 = leerNumeros(archivo1);
            lista2 = leerNumeros(archivo2);
            int[] listaOrdenada = ordenarListas(lista1, lista2);
            guardar(archivoOrdenado, listaOrdenada);
        }else {
            System.out.println("Error al leer los archivos");
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
    }//guarda las dos listas de entrada en un array ordenado
    private static int[] ordenarListas(int[] lista1, int[] lista2){
        int[] listaOrdenada = new int[lista1.length + lista2.length];
        System.arraycopy(lista1, 0, listaOrdenada, 0, lista1.length);
        System.arraycopy(lista2, 0, listaOrdenada, lista1.length, lista2.length);
        Arrays.sort(listaOrdenada);
        return listaOrdenada;
    }
    //guardamos un array en un archivo de texto
    public static void guardar(String archivo, int[] numeros){
        try (FileWriter escribir = new FileWriter(archivo)){
            for (int num : numeros){
                escribir.write(num + "\n");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        } 
        System.out.println("Listas guardadas correctamente");
    }
}
