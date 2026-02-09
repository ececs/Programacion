/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion2.pkg15;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
/*
Escribe una aplicación que solicite por consola dos números reales que comesponden a 
la base y la altura de un triángulo. Debará mostrarse su área, comprobando que lo 
múmeros introducidos por el usuario no son negativos.
*/
public class Aaplicacion215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura, area;
        
        //Creamos un objetos Scanner y solicitamos que la base del triángulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo: ");
        base = sc.nextInt();
        
        //Solicitar altura del triángulo
        System.out.println("Introduzca la altura del triangulo: ");
        altura = sc.nextInt();
        
        if (base > 0 && altura > 0) {
        //Calcular el área
        area = base * altura / 2;
        
        //Devolver el área del triángulo
        System.out.println("El área del triangulo es = " + area);
        } else {
            System.out.println("La base y la altura del triangulo deben ser mayores que 0.");
        }
    }
    
}
