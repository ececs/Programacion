/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion7.pkg18;

import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilar-
se y desapilarse, se encolan y desencolan. La diferencia con las pilas es que se desencola
el primer elemento encolado, ya que así es como funcionan las colas del autobús o del
cine. El primero que llega es el primero que sale de la cola (vamos a suponer que nadie
se cuela). Por tanto, los elementos se encolan y desencolan en extremos opuestos de la
estructura, llamados primero (el que esta primero y sera el próximo en abandonar la cola)
y último (el que llegó último). Implementa la clase Cola donde los elementos Integer en-
colados se guardan en una tabla.
*/
class Cola {
    private Integer[] tabla;
    private Integer primero;
    private Integer ultimo;
    
    Cola(){
        tabla = new Integer[0];
        primero = null;
        ultimo = null;
    }
    
    void encola(Integer nuevo) {
        //añade un elemento a el final de la cola
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length-1] = nuevo;
        ultimo = nuevo;
    }

    int primero() { 
        //devuelve el primer elemento de la cola
        return tabla[0]; 
    }

    boolean vacia() {
        //devuelve si la cola esta vacia
        return tabla.length == 0;
    }

    int desencola() {
        //saca el elemento mas antiguo de la cola
        int desencolado;
        desencolado = tabla[0];
        tabla = Arrays.copyOfRange(tabla, 1, tabla.length);
        return desencolado;
    }
    
}
