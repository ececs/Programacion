/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apropuestas2.pkg3;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
/*
Escribe una aplicación que pida al usuario dos números enteros y muestre: true, si 
ambos números son distintos entre sí o alguno de ellos es cero; y false en caso contrario. 
*/
public class Apropuestas23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        boolean distintosOCero;
        //Soliciatamos que se introduzcan los numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        //Guardamos en la variable distintosOCero true si los numeros son distintos o si alguno de ellos es cero
        distintosOCero = num1 != num2 || num1 == 0 || num2 == 0;
        //Imprimir en pantalla
        System.out.println("Los números son distintos entre si o uno de ellos cero? " + distintosOCero);
        
    }
    
}
