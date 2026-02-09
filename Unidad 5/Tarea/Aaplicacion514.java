/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion5.pkg14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion514 {

    /**
     * @param args the command line arguments
     */
    /*
    El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar 
    encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio.
    Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el
    número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1.
    Una vez terminada la entrada de datos, muestra la siguiente información:
    • Todos los sueldos introducidos ordenados de forma decreciente.
    • El sueldo máximo y minimo.
    • La media de los sueldos.
    */
    public static void main(String[] args) {
        int i = 0;//creamos una variable indice
        Scanner sc = new Scanner(System.in);//introducir datos
        double sueldos[] = new double[0];//creamos el array sueldos con 0 elementos
        System.out.println("Introduzca el sueldo de las personas a analizar (Para finalizar introduzca -1): ");
        double sueldo = sc.nextDouble();
        while (sueldo != -1) {//bucle que guarda los sueldos hasta que se introduzca -1
            sueldos = Arrays.copyOf(sueldos, i + 1);//hacemos una copoia de el array sueldos agregando un elemento
            sueldos[i] = sueldo;//en la posicion i de sueldos guardamos el sueldo introducido
            sueldo = sc.nextDouble();//capturamos el siguiente número introducido
            i++;//incrementamos el indice
        }//imprimir en pantalla los datos que se piden
        System.out.println("Sueldos: " + Arrays.toString(ordenDecreciente(sueldos)));
        System.out.println("Sueldo maximo : " + sueldos[0]);
        System.out.println("Sueldo minimo : " + sueldos[sueldos.length-1]);
        System.out.println("Sueldo medio : " + media(sueldos));
    }
    static double[] ordenDecreciente(double[] t){
        Arrays.sort(t);//ordenar el array sueldos de forma creciente
        for (int i = 0; i < t.length/2; i++){//recorremos el bucle hasta la mitad
            double temp = t[i];//en una variable temporal guardamos t[i]
            t[i] = t[t.length-i-1];//en t[i] guardamos t[elementos-i-1]
            t[t.length-i-1]= temp;//en t[elementos-1-i] guardamos lo que tenemos en temp
        }
        return t;//devolvemos t   
    }
    
    static double media(double t[]){//función que calcula la media de los valores del array
        double med = 0;
        for (int i = 0; i< t.length; i++){//recorremos el array
            med = med + t[i];//sumamos el valor de la posición actual de el array a media
        }
        return med/t.length;//devolver med dividido la cantidad de elementos del array
    }
}
