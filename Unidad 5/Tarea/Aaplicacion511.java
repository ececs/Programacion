/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion5.pkg11;

import java.util.Arrays;

/**
 *
 * @author daldo
 */
public class Aaplicacion511 {

    /**
     * @param args the command line arguments
     */
    /*
    Realiza la función: int [] buscarTodos (int t[], int clave), que crea y devuelve una
    tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda. En
    el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
    */
    public static void main(String[] args) {
        int[] t = {6, 5, 1, 13, 5, 3, 23, 18, 11, 5, 4};
        int clave = 5;
        int[] encontrados = buscarTodos(t, clave);
        System.out.println("La tabla con indices de la clave buscada es: " + Arrays.toString(encontrados));
    }
    
    static int [] buscarTodos (int t[], int clave){
        int contador = 0;
        for (int i : t){//bucle para contar cuantas veces aparece clave en la busqueda
            if (i == clave){
                contador++;
            }
        }
        //creamos la tabla indice
        int indice [] = new int[contador];
        int indiceActual = 0;
        for (int i = 0; i < t.length; i++){//bucle para recorrer el array t buscando si coincide con clave
            if (t[i] == clave) {
                indice [indiceActual] = i;//guardamos en la tabla indice el indice del elemento que coincide con clave
                indiceActual++;//incrementar 
            }
        }
        return indice;
    }
    
}
