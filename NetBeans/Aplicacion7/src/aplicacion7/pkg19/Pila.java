/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion7.pkg19;

import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
Implementa la clase Pila para números Integer, usando directamente una 
tabla para guardar los elementos apilados.
*/
class Pila {
    private Integer[] tabla;
    private Integer primero;
    private Integer ultimo;
    
    public Pila(){
        tabla = new Integer[0];
        primero = null;
        ultimo = null;
    }

    void apila(int nuevo) {
        //añade un elemento al final de la pila
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length-1] = nuevo;
        ultimo = nuevo;
    }

    boolean vacia() {
        //devuelve si la pila esta vacia
        return tabla.length == 0;
    }

    Integer desapila() {
        //saca un elemento del final de la pila
        Integer desapilado = cima();
        tabla = Arrays.copyOfRange(tabla, 0, tabla.length - 1);
        return desapilado;
    }

    Integer cima() {
        //devuleve el elemento de la cima de la pila
        return tabla[tabla.length-1];
    }
    
}
