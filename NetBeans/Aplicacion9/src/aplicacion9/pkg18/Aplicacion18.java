/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
Escribe la función Integer [] leerEnteros (String texto), al que se le pasa una 
cadena y devuelve una tabla con todos los enteros que aparecen en ella.
*/
public class Aplicacion18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leerEnteros("enteros.txt")));
    }//lamamos a el metodo leerEnteros y lo imprimimos en pantalla
    private static Integer[] leerEnteros(String texto){
        //metodo que le pasmos una cadena y devuelve un array con todos los enteros de el archivo
        String cadena[] = new String[0];
        Integer enteros[] = null;
        try(FileReader leer = new FileReader(texto); BufferedReader br = new BufferedReader(leer)){
            String linea;
            while ((linea = br.readLine()) != null){//mientras es distinto de null
                cadena = linea.split("\\s+");//separamos en un array por un espacio o mas
            }
            enteros = new Integer[cadena.length];
            for (int i = 0; i < cadena.length; i++ ){//recoremos el array y pasamos cada elemento a enteros
                if (!cadena[i].isEmpty()){
                    enteros[i] = Integer.parseInt(cadena[i]);
                }
            }
            linea = br.readLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        return enteros;
    }
}
