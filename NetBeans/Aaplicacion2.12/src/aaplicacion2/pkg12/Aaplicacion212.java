/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion2.pkg12;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
public class Aaplicacion212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dni, numLetraDni;
        char letraDni = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su número de DNI. sin letra: ");
        dni = sc.nextInt();
        
        numLetraDni = dni % 23;
        
        switch (numLetraDni) {
            case 0 -> letraDni = 'T';
            case 1 -> letraDni = 'R';
            case 2 -> letraDni = 'W';
            case 3 -> letraDni = 'A';
            case 4 -> letraDni = 'G';
            case 5 -> letraDni = 'M';
            case 6 -> letraDni = 'Y';
            case 7 -> letraDni = 'F';
            case 8 -> letraDni = 'P';
            case 9 -> letraDni = 'D';
            case 10 -> letraDni = 'X';
            case 11 -> letraDni = 'B';
            case 12 -> letraDni = 'N';
            case 13 -> letraDni = 'J';
            case 14 -> letraDni = 'Z';
            case 15 -> letraDni = 'S';
            case 16 -> letraDni = 'Q';
            case 17 -> letraDni = 'V';
            case 18 -> letraDni = 'H';
            case 19 -> letraDni = 'L';
            case 20 -> letraDni = 'C';
            case 21 -> letraDni = 'K';
            case 22 -> letraDni = 'E'; 
        }
        
        System.out.println("La letra que corresponde a su DNI es: " + letraDni);
        
    }
    
}
