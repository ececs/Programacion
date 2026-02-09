/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apropuestas2.pkg5;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
/*
Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación 
solicitará el aforo máximo del local, el precio por entrada (suponemos que todas las 
entradas tienen el mismo precio) y el número de entradas vendidas. Hay que tener 
en cuenta que si el número de entradas vendidas no supera 
el 20% del aforo del lo- 
cal, 50 cancela el concierto. Si el núumero de entradas vendidas no supera el 50% 
del aforo del local, se realiza una rebaja del 25% del precio de la entrada. 
*/
public class Apropuestas25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double recaudacion;
        //Solicitar  Aforo maximo, precio de la entrada y entradas vendidas
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el aforo maximo del local: ");
        final int AFORO_MAXIMO = sc.nextInt();
        System.out.println("Introduzca el precio de la entrada: ");
        final int PRECIO_ENTRADA = sc.nextInt();
        System.out.println("Introduzca la cantidad de entradas vendidas: ");
        final int ENTRADAS_VENDIDAS = sc.nextInt();
        /*
        Si las entradas vendidas es menor o igual que 20% del aforo maximo se cancela el concierto,
        si es menor al 50% se calcula la recaudación con el decuento 
        y en otro caso se calcula la recaudación sin descuento
        */
        if ( ENTRADAS_VENDIDAS <= AFORO_MAXIMO * 0.2 ) {
            System.out.println("Concierto cancelado");
        } else if ( ENTRADAS_VENDIDAS <= AFORO_MAXIMO * 0.5 ){
            recaudacion = ENTRADAS_VENDIDAS * 0.75 * PRECIO_ENTRADA;
            System.out.println("Se han recaudado: " + recaudacion + "€");
        } else {
            recaudacion = ENTRADAS_VENDIDAS * PRECIO_ENTRADA;
            System.out.println("Se han recaudado: " + recaudacion + "€");
        }
        
    }
    
}
