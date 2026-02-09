/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion2.pkg18;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Aaplicacion218 {

    /**
     * @param args the command line arguments
     */
    /*
    Modifica la actividad de aplicación 2.17 para que, además de los dos númenos aleatorios, 
    también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación. 
    */
    public static void main(String[] args) {
        int a, b, c, op;
        boolean esCorrecto = false;
        //Calcular tres números aleatorios a,  b y el operador
        a = (int) ((Math.random() * 99) + 1);
        b = (int) ((Math.random() * 99) + 1);
        op = (int) ((Math.random() * 3) + 1);
        //Creamos el objeto sc de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Segun el número aleatorio op seleccionamos la operación suma resta o multiplicacion
        switch (op){
            case 1 -> {
                //Solicitar el resultado de a + b y amacenar en esCorrecto si el resultado de la operacion es correcto
                System.out.println("Cuanto es " + a + " + " + b );
                c = sc.nextInt();
                esCorrecto = c == a + b;
            }
            case 2 -> {
                //Solicitar el resultado de a - b y amacenar en esCorrecto si el resultado de la operacion es correcto
                System.out.println("Cuanto es " + a + " - " + b );
                c = sc.nextInt();
                esCorrecto = c == a - b;
            }
            case 3 -> {
                //Solicitar el resultado de a * b y amacenar en esCorrecto si el resultado de la operacion es correcto
                System.out.println("Cuanto es " + a + " x " + b );
                c = sc.nextInt();
                esCorrecto = c == a * b;
            }
        }//Imprimir en pantalla si es correcto o incorrecto
        if (esCorrecto){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto"); 
        }
    }
}
    
    

