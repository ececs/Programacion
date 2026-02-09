/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion5.pkg15;

import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion515 {

    /**
     * @param args the command line arguments
     */
    /*
    Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
    Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (núme-
    ros enteros) del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la
    nota media del grupo en cada trimestre y la media del alumno que se encuentra en una
    posición dada (que el usuario introduce por teclado).
    */
    public static void main(String[] args) {
        int alumno;
        int notas[][] = new int[3][5];//matriz que guarda los trimestres y los alumnos
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 3; j++){//bucle que recorre los trimestres
            System.out.println("Introduzca las notas del trimestre " + (j+1) + ": ");
            for(int i = 0; i < 5; i++){//bucle que recorre los alumnos
                System.out.println("Alumno: " + (i + 1));
                notas[j][i] = sc.nextInt();//guardamos en notas[trimestre][alumno] la nota introducida
                while (notas[j][i] < 0 || notas[j][i]>10){//mientras la nota sea mayor que 10 o menor que 0 devuelve error y puede vover a introducir el valor
                    System.out.println("La nota introducida esta fuera de rango, vuelva a introducir un valor de 0 a 10");
                    notas[j][i] = sc.nextInt();//guardamos el valor en notas[trimestre][alumno]
                }
            }
            System.out.println();
        }
        System.out.println("La media del grupo es: " + mediaGrupo(notas));//imprimir y llamar a la función mediaGrupo pasandole la matriz notas
        System.out.println("Introduzca el número de alumno: ");//se pide el númeor de alumno
        alumno = sc.nextInt();//guardamos en alumno el valor introducido
        while (alumno < 1 || alumno > 5){
        //mientras el valor introducido en alumno sea menor que 1 o mayor que 5, devolvemos error y se pude volver a introducir el valor
            System.out.println("No existe el alumno requerido, vuelva a introducir un valor de 1 a 5");
            alumno = sc.nextInt();
        }
        System.out.println("La media del alumno es: " + mediaAlumno(notas, alumno - 1));//imprimir y llamar a la función mediaAlumno pasando la matriz alumno y alumno-1
    }
    static int mediaAlumno(int notas[][], int alumno){
        int media = 0;
        for (int i = 0; i < 3; i++){//recorremos los trimestres
            media += notas[i][alumno];//sumamos las notas de alumno de cada trimestre
        }    
        return media/3;//dividr media entre los trimestres
    }
    static int mediaGrupo(int notas[][]){
        int media = 0; 
        for (int i = 0; i < 5; i++){//recorre la matriz
            for (int j = 0; i < 3; i++){
                media  += notas[j][i];//sumar todas las notas de la matriz
            }
        }
        return (media/(notas.length));//dividir media por la cantidad de elementos de la matriz
    }
    
}
