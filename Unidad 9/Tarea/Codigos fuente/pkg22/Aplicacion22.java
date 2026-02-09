/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion9.pkg22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daldo
 */
/*
Crea con un editor de texto el fichero deportistas.txt, donde se recogen los datos de un
grupo de deportistas, uno en cada línea. Aparecerá el nombre completo, seguido de la
edad, el peso y la estatura. La primera línea será el encabezamiento con los nombres
de los campos. El documento tendrá la siguiente forma:
Nombre Edad Peso Estatura
Juan Pedro Pérez Gómez 25 70,5 1,80
Ana Ruiz del Val 23 60 1,75
...
Implementa un programa donde se cree un flujo de texto de entrada, a partir del cual,
usando un objeto Scanner, se leerán los datos de los deportistas, que se mostrarán por
pantalla. Al final aparecerán los valores medios de la edad, el peso y la estatura.
*/
public class Aplicacion22 {
    public static void main(String[] args) {
        String archivo = "deportistas.txt";
        int deportistas = 0;
        int edades = 0;
        double pesos = 0;
        double estaturas = 0;
        //creamos un buffer para leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            br.readLine();//saltamos la primera linea que contiene el encabezado
            while ((linea = br.readLine()) != null ){
                Scanner sc = new Scanner(linea);
                sc.useDelimiter(" ");
                //leer el nombre
                String nombre = "";
                while (!sc.hasNextInt()){
                    nombre += sc.next() + " ";
                }
                //leer datos
                int edad = sc.nextInt();
                double peso = sc.nextDouble();
                double estatura = sc.nextDouble();
                System.out.printf("Nombre: %s, Edad: %d, Peso: %.1f, Estatura: %.2f\n", nombre.trim(), edad, peso, estatura);
                //sumar valores para calcular los valores medios
                deportistas++;
                edades += edad;
                pesos += peso;
                estaturas += estatura;
            }
        }catch (IOException e){
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        //calcular los valores medios
        if (deportistas > 0){
            double edadMedia = edades / deportistas;
            double pesoMedio = pesos / deportistas;
            double estaturaMedia = estaturas / deportistas;
            System.out.println("Valores medios");
            System.out.printf("Edad: %2f, Peso: %.2f, Estatura: %.2f\n", edadMedia, pesoMedio, estaturaMedia);
        } else {
            System.out.println("No hay datos de deportistas para mostrar");
        }
    }
}
