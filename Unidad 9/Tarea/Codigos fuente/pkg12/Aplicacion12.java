/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion9.pkg12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author daldo
 */
/*
Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben 
guardarse en el fichero datos.txt. Si este fichero existe, deben añadirse al 
final en una nueva linea, y en caso de no existir, debe crearse.
*/
public class Aplicacion12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        borrar("/Users/daldo/Drive/FP DAW/Programacion/NetBeans/Aplicacion9/datos.txt");
        escribir ("Eudaldo", 40);
        escribir ("Alvaro", 30);
        escribir("Damian", 18);
        leer();
    }
    
    public static void leer(){
        try(FileReader leer = new FileReader("datos.txt"); BufferedReader bufferLeer = new BufferedReader(leer)){
            String linea;
            while ((linea = bufferLeer.readLine()) != null){
                String aux[] = linea.split(" ");
                System.out.println("Nombre: " + aux[0] + ", Edad: " + aux[1]);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void escribir(String nombre, int edad){
        try (FileWriter escribir = new FileWriter("datos.txt", true)){
            escribir.write( nombre + " " + edad + "\n");
            System.out.println("Datos guardados correctamente");
        }catch(IOException e){
            System.out.println(e.getMessage());
        } 
    }
    public static boolean borrar(String ruta){
        File archivo = new File(ruta);
        boolean borrado;
        if (archivo.exists()){
            borrado = archivo.delete();
        } else{
            borrado = false;
        }
        return borrado;
    }
    
    
    
}
