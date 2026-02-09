/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author daldo
 */
/*
Escribe un programa que lea un fichero de texto llamado carta.txt. Tenemos que contar
los caracteres, las lineas y las palabras. Para simplificar supondremos que cada palabra
está separada de otra por un único espacio en blanco o por un cambio de línea.
*/
public class Aplicacion14 {
    
    public static void main(String[] args){
        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;
        String archivo = "carta.txt";
        //leer el archivo usando un buffer
        try(FileReader leer = new FileReader(archivo); BufferedReader br = new BufferedReader(leer)){
            String linea;
            //mientaras cada linea leida se distinta de null
            while ((linea = br.readLine()) != null){
                lineas++;//incrementar lineas
                caracteres += linea.length();//incrementar caracteres
                //dividir la linea por espacios en blanco
                palabras += linea.split("\\s").length;
            }
        } catch (IOException e){
        System.out.println(e.getMessage());
        }
        //imprimir cuantas lineas palabras y caracteres tiene el archivo
        System.out.println("Lineas: "+ lineas + " palabras: " + palabras + " caracteres: " + caracteres);
    }
}
