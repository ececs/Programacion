/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1.pkg7;
import java.util.*;
/**
 *
 * @author eudal
 */
public class Actividad17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        double area, longitud;
        Scanner sc= new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Escriba el radio: ");
        radio = sc.nextDouble();
        longitud = 2 * Math.pow(radio, 2);
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del circulo es " + area);
    }
    
}
