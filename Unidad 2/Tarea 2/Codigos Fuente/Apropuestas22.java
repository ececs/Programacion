/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apropuestas2.pkg2;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
/*
Solicita por teclado un número de tipo int al usuario y escribe un programa 
que muestre true o false, dependiendo de si el número es positivo. 
*/

public class Apropuestas22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        boolean esPositivo;
        //Solicitamos qiue se introduzca un número
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num = sc.nextInt();
        //Guardamos en la variable esPositivo true si es positivo o 0 y false si es negativo 
        esPositivo = num >= 0;
        //imprimimos en pantalla
        System.out.println("El numero es positivo? " + esPositivo);
    }
    
}
