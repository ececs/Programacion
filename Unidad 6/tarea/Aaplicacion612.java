/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
public class Aaplicacion612 {

    /**
     * @param args the command line arguments
     */
    /*
    Realiza el juego del ahorcado. Las reglas del juego son:
    a ) El jugador A teclea una palabra, sin que el jugador B la vea.
    b ) Ahora se le muestra tantos guiones como letras tenga la palabra secreta. 
    Por ejemplo, para «hola» será <<_ _ _ _>>.
    c ) El jugador B intentará acertar, letra a letra, la palabra secreta.
    d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán ocultas
    como guiones. Siguiendo con el ejemplo anterior, y suponiendo que se ha introducido:
    la 'o', la 'j' y la 'a', se mostrará: «_o_a».
    e ) El jugador B solo tiene 7 intentos.
    f ) La partida terminará al acertar todas las letras que forman la palabra secreta
    (gana el jugador B) o cuando se agoten todos los intentos (gana el jugador A)
    */
    public static void main(String[] args) {
        boolean acierto;
        //Introducir por pantalla la palabra a adivinar
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra a adivinar el jugador A: ");
        String palabra = sc.nextLine().toLowerCase();//guardamos en palabra la palabra 
        //a adivinar y la convertimos a minusculas
        char[] letrasAdivinadas = new char[palabra.length()];//Creamos un array con las letras adivinadas del tamaño de palabra
        for (int i = 0; i< letrasAdivinadas.length; i++){//Rellenamos con _ el array letrasAdivinadas
            letrasAdivinadas[i] = '_';
        }
        
        int intentos = 0;//guardamos los intentos
        boolean adivinada = false;//guardamos si se ha adivinado la palabra
        
        while ( intentos < 7 && !adivinada){//mientras no se adivina e intentos es menor que 7
            //imprimir en pantalla letrasAdivinadas
            System.out.print("Palabra a adivinar: << ");
            for (int i = 0; i < letrasAdivinadas.length; i++){//
                System.out.print(letrasAdivinadas[i] + " ");
            }
            System.out.print(">>");
            
            //pedimops al jugador B que introduzca una letra
            System.out.println("Introduzca una letra, jugador B: ");
            //Guardamos la letra introducida en letra, la convertimos en minucula
            char letra = Character.toLowerCase(sc.next().charAt(0));
            //guardamos false en acierto
            acierto = false;
            //Buscamos en el array si se ha adivinado alguna letra, si se adivina se guarda la 
            //letra en letrasAdivinadas y acierto es igual a true
            for (int i = 0; i < palabra.length(); i++){
                if (palabra.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    acierto = true;
                }
            }
            //si no hay acierto incrementamos los intentos, e imprimir en pantalla
            if (!acierto){
                intentos++;
                System.out.println("La letra no esta en la palabra. Quedan: " + (7-intentos) + " intentos." );
            }
            //guaradamos si esta adivinada si letrasAdivinadas coincide con palabra 
            adivinada = new String(letrasAdivinadas).equals(palabra);
            
        }
        //imprimir en pantalla si se ha adivinado o no
        if (adivinada){
            System.out.println("¡¡¡Has adivinado la palabra!!! " + palabra);
            
        }else {
            System.out.println("Estas ahoracado. La palabra era: " + palabra);
        }
    }
    
}
