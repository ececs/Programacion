/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion9.pkg12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedimos el nombre al usuario
        System.out.print("Introdduzca su nombre: ");
        String nombre = scanner.nextLine();
        // Pedimos la edad al usuario
        System.out.print("Introduzca su edad: ");
        int edad = scanner.nextInt();
        // Creaamos el archivo datos.txt o añadidomas al final de él
        File archivo = new File("datos.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write("Nombre: " + nombre + ", Edad: " + edad);
            bw.newLine(); // Añadimos una nueva línea
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
