/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
/*
En Linux disponemos del comando more, al que se le pasa un fichero y lo muestra poco
a poco: cada 24 líneas. Implementa un programa que funcione de forma similar.
*/
public class Aplciacion17 {
    private static final int LIMITE_LINEAS = 24;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//solicitamos el nombre del archivo
        System.out.println("Introduzca el nombre del archivo a abrir");
        String archivo = sc.nextLine();
        int contador = 0;//contador de lineas ya mostradas
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) { 
            String linea; //leemos cada linea la mostramos e inrementamos el contador
            while ((linea = br.readLine()) != null) { 
                System.out.println(linea); 
                contador++;
                if (contador %  LIMITE_LINEAS == 0){//si el contador llega al limite se para hasta que se precione enter
                    System.out.println("Presione Enter para continuar");
                    sc.nextLine();
                }
            } 
        } catch (IOException e) { 
            System.err.println("Error al leer el archivo: " + e.getMessage()); 
        } 
    }
}
