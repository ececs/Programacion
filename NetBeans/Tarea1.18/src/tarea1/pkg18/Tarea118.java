/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.pkg18;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Tarea118 {

    /**
     * @param args the command line arguments
     */
    /*
    aplicacion que suma el numero de patas total correspondiente a la cantidad 
    de los 3 insectos que se necesita. 
    */
    public static void main(String[] args) {
        
        //Declaramos las constantes con las distintas cantidades de patas 
        //para cada insecto
        final byte PATAS_HORMIGA = 6;
        final byte PATAS_ARAÑA = 8 ;
        final byte PATAS_COCHINILLA = 12;
        
        int hormigas, arañas, cochinillas, patas;
        
        //Se pide introducir la cantidad de cada uno de los insectos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de hormigas capturadas: ");
        hormigas = sc.nextInt();
        System.out.println("Introduzca la cantidad de arañas capturadas: ");
        arañas = sc.nextInt();
        System.out.println("Introduzca la cantidad de cochinillas capturadas: ");
        cochinillas = sc.nextInt();
        
        //Calcular la cantidad de patas total
        patas = hormigas * PATAS_HORMIGA + arañas * PATAS_ARAÑA + cochinillas * PATAS_COCHINILLA;
        
        //Muestra por pantalla la cantidad de patas totales
        System.out.println("Número total de patas: " + patas + ".");
    }
}
