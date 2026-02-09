/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion5.pkg18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion518 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La aplica-
    ción debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella
    donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int [4][4];//creamos la matriz de 4x4
        for(int i = 0; i < 4; i++){//recorremos la matriz para introducir cada valor
            for (int j = 0; j < 4; j++){
                System.out.println("Introducir valor para fila:  " + (i+1) + " Columna: "+ (j+1));
                matriz [i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matriz));//imprimir la matriz
        System.out.println("La matriz es magica: " + esMagica(matriz));//llamada a la funcion esMagica
   
    }
    static boolean esMagica(int matriz[][]){//funcion que decide si la matriz es magica
        int sumaFila0 = 0;//variable que almacena la suma de los elementos de la fila 0
        int sumaFila, sumaColumna;
        boolean magica = true;
        for (int k = 0; k < 4; k++){//recorremos la matriz
            sumaFila0 += matriz[0][k];//almacenamos la suma de los elementos de la fila 0
        }
        for ( int l = 1; l < 4; l++){//recorremos la matriz a partir de la fila 1
            sumaFila = 0;
            for ( int m = 0; m < 4; m++){
                sumaFila += matriz[l][m];//almacenamos la suma de la fila l
            }
            if (sumaFila0 != sumaFila){
                //si la suma de elementos de la fila 0 es distinta a las de las demas filas no es magica
                magica = false;
            }
        }
        for ( int m = 0; m < 4; m++){//recorremos la matriz por columnas
            sumaColumna = 0;
            for ( int l = 0; l < 4; l++){
                sumaColumna += matriz[l][m];//guardamos la suma de los elementos de la columna m
            }
            if (sumaFila0 != sumaColumna){
                //si la suma de los elementos de la fila 0 es distintade la suma de cada columna no es magica
                magica = false;
            }
        }
        return magica;//devolver si es magica
    }
}
