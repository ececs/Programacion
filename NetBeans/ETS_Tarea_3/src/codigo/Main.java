/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int t[] = {1, 2, 3, 4, 5, 6};
        int numElementos = 2;
        int aux[] = suma(t, numElementos);
        System.out.println("La sumas de " + Arrays.toString(t));
        System.out.println("Agrupando " + numElementos + " elementos");
        System.out.println(Arrays.toString(aux));
    }
    
    static int[] suma(int t[], int numElementos) {
        int sumas[] = new int[t.length - numElementos + 1];
        for (int i = 0; i < sumas.length; i++) {
            sumas[i] = 0;
            for (int j = 0; j < numElementos; j++) {
            sumas[i] += t[i+j];
            }
        }
        return sumas;
    }
}