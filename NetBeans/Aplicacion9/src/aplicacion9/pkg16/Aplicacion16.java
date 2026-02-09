/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
/*
Un libro de firmas es útil para recoger los nombres de todas las personas que han 
pasado por un determinado lugar. Crea una aplicación que permita mostrar el libro 
de firmas e insertar un nuevo nombre (comprobando que no se encuentre repetido). 
Llamaremos al fichero firmas.txt.
*/
public class Aplicacion16 {
    public static void main(String[] args) {
        mostrarFirmas();//llamar al metodo para mostrar firmas
        Scanner sc = new Scanner(System.in);//solicitar nueva firma
        System.out.println("Introduzca la nueva firma");
        String nuevaFirma = sc.nextLine();
        while (buscar(nuevaFirma.toLowerCase())){//si la firma ya existe pide una distinta
            System.out.println("La firma introducida ya existe. Introduzca una firma distinta.");
            nuevaFirma = sc.nextLine();
        }//guardar la nueva firma
        guardar(nuevaFirma);   
    }//metodo para leer del fichero las firmas ya introducidas
    private static void mostrarFirmas() {
        System.out.println("Libro de Firmas:"); 
        System.out.println();
        try (BufferedReader br = new BufferedReader(new FileReader("firmas.txt"))) { 
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }//metodo que busca si la firma introducida esta en al archivo
    private static boolean buscar(String nuevaFirma) {
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader("firmas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if(nuevaFirma.equals(linea.toLowerCase())){
                    encontrado = true;
                }
            }
        } catch (IOException e) { 
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return encontrado;
    }//metodo para escribir la nueva firma en el archivo
    public static void guardar(String firma){
        try (FileWriter escribir = new FileWriter("firmas.txt", true)){
            escribir.write( firma + "\n");
            System.out.println("Datos guardados correctamente");
        }catch(IOException e){
            System.out.println(e.getMessage());
        } 
    }   
}
