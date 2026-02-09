/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apropuestas2.pkg13;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
/*
En una granja se compra diariamente una cantidad (comidaDiaria) 
de comida para los amimales. El múmero de animales que alimentar (todos de la misma especie) 
es esAnimales, y sabemos que cada animal come una media de kilosPorAnimal. 
Diseña un programa que solicite al usuario los valores anteriores y determine si 
disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la 
ración que comresponde a cada uno de los animales. 
Nota: Evitar que la aplicación realice divisiones por cero.
*/
public class Apropuestas213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int comidaDiaria, numAnimales, kilosPorAnimal;
        boolean comidaSuficiente;
        //Solicitar comidaDiaria, numAnimales y kilosPorAnimal
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la comida comprada hoy: ");
        comidaDiaria = sc.nextInt();
        System.out.println("Introduzca el número de animales: ");
        numAnimales = sc.nextInt();
        System.out.println("Introduzca cuanto come de media cada animal: ");
        kilosPorAnimal = sc.nextInt();
        //Si el numero de animales es positivo y evitar que se divida por cero
        if ( numAnimales > 0 ){
            //Calculamos si la comida es suficiente y lo guardamos en comidaSuficiente
            comidaSuficiente = kilosPorAnimal <= comidaDiaria  / numAnimales  ;
            //Mostrar en pantalla si la comida es suficiente
            System.out.println("La comida comprada es suficiente para alimentar a los animales? " + comidaSuficiente );
        } else {
            System.out.println("La cantidad de animales no puede ser menor o igual a 0.");
        }
    }
    
}
