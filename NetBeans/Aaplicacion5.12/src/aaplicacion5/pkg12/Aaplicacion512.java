/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion5.pkg12;

import java.util.Arrays;

/**
 *
 * @author daldo
 */
public class Aaplicacion512 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribe la función void desordenar (int t []), que cambia de forma aleatoria los 
    elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaria de estarlo.
    */
    public static void main(String[] args) {
        int[] t = {1, 3, 7, 10, 13, 17, 25, 33, 54, 59, 68};//declaración del array
        desordenar(t);//llamada a la función desordenar, le pasamos como parametro la tabla t
        System.out.println(Arrays.toString(t));//imprimir en pantalla el array
       
    }
    static void desordenar (int t []){
        for (int j = 0; j <= t.length-1; j++){//bucle para recorrer el array
            int a = (int) (Math.random() * (t.length));//generamos un número aleatorio entre 0 y la cantidad de elementos del array -1
                int aux = t[j];//guardamos en una variable auxiliar el elemento t[j]
                t[j] = t[a];//guardamos t[a] en t[j]
                t[a] = aux; //guardamos en t[a] el elemento que tenemos en la variable auxiliar
        }
    }
    
}
