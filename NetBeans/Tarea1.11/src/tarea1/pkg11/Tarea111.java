/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg11;

import java.util.Scanner;
/**
 *
 * @author eudal
 */
public class Tarea111 {

    /**
     * @param args the command line arguments
     */
    /*
    Aplicación que solicite la base imponible y el IVA a aplicar.
    Muestre el importe de IVA y el total.
    */
    public static void main(String[] args) {
        double baseImponible, porcentajeIva, importeIva, total;
        
        Scanner sc =new Scanner(System.in);
        
        //Solicitamos la base imponible.
        System.out.println("Introducir base imponible: ");
        baseImponible = sc.nextDouble();
        
        //Solicitamos el IVA a aplicar.
        System.out.println("Introducir IVA a aplicar: ");
        porcentajeIva = sc.nextDouble();
        
        //Calculamos el importe de IVA
        importeIva = baseImponible * porcentajeIva/100;
        
        //Calculamos el importe total.
        total = baseImponible + importeIva;
        
        //Mostramos por pantalla el importe de IVA y el total.
        System.out.println("El importe de IVA es: " + importeIva);
        System.out.println("El importe de total es: " + total);
        
    }
    
}
