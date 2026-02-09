/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion8.pkg17;

import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
 Escribe la clase Cola heredando de Lista (ver Actividad final 7.18).
*/
class Cola extends Lista{
    Cola(){
        super();
    }
    void encolar(Integer nuevo) {
        //añade un elemento a el final de la cola
        insertarFinal(nuevo);
    }

    Integer primero() { 
        //devuelve el primer elemento de la cola
        return get(0); 
    }

    boolean vacia() {
        //devuelve si la cola esta vacia
        return numeroElementos() == 0;
    }

    Integer desencolar() {
        //saca el elemento mas antiguo de la cola
        return eliminar(0);
    }
}
