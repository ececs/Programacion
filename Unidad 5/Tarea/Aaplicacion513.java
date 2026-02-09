/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion5.pkg13;

import java.util.Arrays;

/**
 *
 * @author daldo
 */
public class Aaplicacion513 {

    /**
     * @param args the command line arguments
     */
    /*
    Modifica la Actividad de aplicación 5.12 para que la función no modifique la tabla que se
    pasa como parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han
    desordenado los valores d e los elementos.
    */
    public static void main(String[] args) {
        int[] t = {1, 3, 7, 10, 13, 17, 25, 33, 54, 59, 68};//declaramos el array
        int copia[] = desordenar(t);//creamos una nueva tabla y la rellenamos con los elementos que devuelve la función desordenar
        System.out.print("La tabla original:        ");
        System.out.println(Arrays.toString(t));//imprimir en pantalla la tabla t
        System.out.print("La copia desordenada:     ");
        System.out.println(Arrays.toString(copia));//imprimior en pantalla la copia de t
    }
    static int[] desordenar (int t []){
        int copia[] = Arrays.copyOf(t, t.length);//hacemos una copia del array t 
            for (int j = 0; j <= copia.length-1; j++){//bucle para recorrer el array
            int a = (int) (Math.random() * (copia.length));//guardamos en a un número aleatorio entre 0 y los elementos de copia -1
                int aux = copia[j];//guardamos en una variable auxiliar el elemento copia[j]
                copia[j] = copia[a];//guardamos en copia[j] el elemenmto de copia[a]
                copia[a] = aux;//guardamos en copia[a] el elemento que tenemos en la variable auxiliar
        }
        return copia;// devolvemos el array copia
    }
}
