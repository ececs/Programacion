/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Aaplicacion214 {

    /**
     * @param args the command line arguments
     */
    /*
    Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. 
    El programa debe mostrarlo con letras. 
    */
    public static void main(String[] args) {
        int num;
        //Solicitar el numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entre 1 y 99: ");
        num = sc.nextInt();
        //Sie el número esta dentro del rango y si no iprimimos en pantalla que no esta en el rango
        if (num >0 && num <= 99) {
            System.out.print("El numero " + num + " en letras es: ");
            //Si el numero es menor a 30, casos de una sola palabra
            if ( num < 30){
                switch (num) {
                    case 1-> System.out.println("uno"); 
                    case 2-> System.out.println("dos"); 
                    case 3-> System.out.println("tres"); 
                    case 4-> System.out.println("cuatro"); 
                    case 5-> System.out.println("cinco"); 
                    case 6-> System.out.println("seis"); 
                    case 7-> System.out.println("siete"); 
                    case 8-> System.out.println("ocho"); 
                    case 9-> System.out.println("nueve"); 
                    case 10-> System.out.println("diez"); 
                    case 11 -> System.out.println("once"); 
                    case 12 -> System.out.println("doce"); 
                    case 13 -> System.out.println("trece"); 
                    case 14 -> System.out.println("catorce"); 
                    case 15 -> System.out.println("quince"); 
                    case 16 -> System.out.println("dieciséis"); 
                    case 17 -> System.out.println("diecisiete"); 
                    case 18 -> System.out.println("dieciocho"); 
                    case 19 -> System.out.println("diecinueve"); 
                    case 20 -> System.out.println("veinte"); 
                    case 21 -> System.out.println("veintiuno"); 
                    case 22 -> System.out.println("veintidós"); 
                    case 23 -> System.out.println("veintitrés"); 
                    case 24 -> System.out.println("veinticuatro"); 
                    case 25 -> System.out.println("veinticinco"); 
                    case 26 -> System.out.println("veintiséis"); 
                    case 27 -> System.out.println("veintisiete"); 
                    case 28 -> System.out.println("veintiocho"); 
                    case 29 -> System.out.println("veintinueve"); 
                }  
            } else {
                //Casos mayores a treinta donde pueden tener mas de una palabra. Imprimir la primera palabra según las decenas
                if ( num >= 30 && num < 40){
                    System.out.print("treinta ");
                } else if ( num >= 40 && num < 50){
                    System.out.print("cuarenta ");
                } else if ( num >= 50 && num < 60){
                    System.out.print("cincuenta ");
                } else if ( num >= 60 && num < 70){
                    System.out.print("sesenta ");
                } else if ( num >= 70 && num < 80){
                    System.out.print("setenta ");
                } else if ( num >= 80 && num < 90){
                    System.out.print("ochenta ");
                } else if ( num >= 90 & num < 100){
                    System.out.print("noventa ");
                }   
                //Calculamos las unidades
                int u = 0;
                u = num % 10;
                if (u != 0){//Si las unidades son distintas de 0.Escrivir la segunda palabra 
                    switch (u) {
                        case 1-> System.out.println("y uno"); 
                        case 2-> System.out.println("y dos"); 
                        case 3-> System.out.println("y tres"); 
                        case 4-> System.out.println("y cuatro"); 
                        case 5-> System.out.println("y cinco"); 
                        case 6-> System.out.println("y seis"); 
                        case 7-> System.out.println("y siete"); 
                        case 8-> System.out.println("y ocho"); 
                        case 9-> System.out.println("y nueve");
                    }
                }
            }
        } else {//Imprmir si esta fuera de rango
            System.out.println("El número " + num +  " no esta entre 1 y 99.");
        }
    }
    
}
