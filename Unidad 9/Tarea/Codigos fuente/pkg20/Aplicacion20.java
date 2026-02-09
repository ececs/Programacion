/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author daldo
 */
/*
Algunos sistemas operativos disponen de la orden comp, que compara dos archivos y
nos dice si son iguales o distintos. Diseña esta orden de forma que, además, nos diga
en qué línea y carácter se encuentra la primera diferencia. Utiliza los ficheros texto1.txt
y texto2.txt.
*/
public class Aplicacion20 {
    public static void main(String[] args) {
        String archivo1 = "texto1.txt";
        String archivo2 = "texto2.txt";
        //creamos un buffer para leer cada archivo
        try (BufferedReader br1 = new BufferedReader(new FileReader(archivo1)); BufferedReader br2 = new BufferedReader(new FileReader(archivo2))){
            String linea1, linea2 = null;
            int contadorLineas = 0;//contamos las lineas
            boolean iguales = true;
            while (((linea1 = br1.readLine()) != null && (linea2 =br2.readLine()) != null) || iguales ){//mientras sean distintas de null o sean iguales
                contadorLineas++;//incrementamos
                if (!linea1.equals(linea2)){//comparamos linea1 y lina2 con equals 
                    iguales = false;//si son distintas
                    int posDiferencia = encontrarDiferencia(linea1, linea2); //buscamos la posicion de la diferencia
                    System.out.println("Diferencia en la línea " + contadorLineas + ", carácter " + (posDiferencia + 1)); 
                    System.out.println("Texto1: " + linea1); 
                    System.out.println("Texto2: " + linea2);
                }
            }
        } catch (IOException e){
            
        }
    }
//metodo que busca la primer diferencia entre dos String y devuelve el indice del caracter distinto
    private static int encontrarDiferencia(String linea1, String linea2) { 
        int IndiceCaracter = Math.min(linea1.length(), linea2.length());
        for (int i = 0; i < IndiceCaracter; i++) { 
            if (linea1.charAt(i) != linea2.charAt(i)) { 
                IndiceCaracter = i;
            } 
        } 
        return IndiceCaracter;
    }
}
