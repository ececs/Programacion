package aplicacion7.pkg13;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daldo
 */
/*
En el momento de decorar una casa, una habitación o cualquier objeto, se plantea el pro-
blema de elegir la paleta de colores que vamos a utilizar en nuestra decoración. Existe
una solución, algo atrevida, que consiste en utilizar colores al azar.
Diseña la clase Colores, que alberga por defecto una serie de colores (mediante una ca-
dena), aunque es posible añadir tantos como necesitemos. La clase tendrá un método que
devuelve una tabla con los n colores que necesitemos elegidos al azar sin repeticiones.
*/
class Colores {
    String paleta[];
    Colores(){
        paleta = new String[0];
    }
    void addColor(String color) {
        //creamos una copia de paleta en auxPaleta con un elemento mas
        String auxPaleta[] = Arrays.copyOf(paleta, paleta.length + 1);
        paleta = auxPaleta;//paleta referencia a lo mismo que auxPaleta
        paleta[paleta.length-1] = color;//agregamos el color al final
    }

    String[] seleccionColores(int i) {
        //creamos paletaRandom
        String paletaRandom[] = new String[i];
        //Guardamos un color aleatorio para cada j hasta i-1
        for (int j = 0; j < i; j++){
            int aleatorio = (int)(Math.random() * paleta.length);
            paletaRandom[j] = paleta[aleatorio]; 
        }
        return paletaRandom;
    }
    
}
