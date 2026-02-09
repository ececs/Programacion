/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author daldo
 */
/*
Con el fichero deportistas.txt de la Actividad de aplicación 10.22, implementa una apli-
cación que lea los datos de los deportistas y los guarde en otros tres ficheros, uno con
los nombres y las edades, otro con los nombres y los pesos y el tercero con los nom-
bres y las estaturas.
*/
public class Aplicacion23 {
     public static void main(String[] args) {
        String archivo = "deportistas.txt";
//creamos buffers para leer el archivo y para escribir los archivos de salida
        try (BufferedReader br = new BufferedReader(new FileReader(archivo)); 
            BufferedWriter bwEdades = new BufferedWriter(new FileWriter("edades.txt"));
            BufferedWriter bwPesos = new BufferedWriter(new FileWriter("pesos.txt"));
            BufferedWriter bwEstaturas = new BufferedWriter(new FileWriter("estaturas.txt"))){
            String linea;
            br.readLine();//saltamos la primera linea que contiene el encabezado
            while ((linea = br.readLine()) != null ){
                //leer linea y separar por espacio en blanco en datos
                String[] datos = linea.split(" ");
                String nombre = datos[0];
                int i = 1;
                while (!datos[i].matches("\\d+")) { 
                    nombre += " " + datos[i]; 
                    i++;//incrementar
                }
                //separar los datos
                String edad = datos [i];
                String peso = datos [i+1].replace(',', '.');
                String estatura = datos [i+2].replace(',', '.');
                //escribir en los ficheros
                bwEdades.write(nombre + " " + edad);
                bwEdades.newLine();
                bwPesos.write(nombre + " " + peso);
                bwPesos.newLine();
                bwEstaturas.write(nombre + " " + estatura);
                bwEstaturas.newLine();
            }
            System.out.println("Datos guardados correctamente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
