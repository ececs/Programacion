/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion8.pkg16;

import aplicacion8.pkg16.Lista;
import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
Diseña la clase Pila heredando de Lista (ver Actividad resuelta 7.13).
*/
class Pila extends Lista{
    public Pila(){
      super();  
    }

    void apilar(int nuevo) {
        //añade un elemento al final de la pila
        insertarFinal(nuevo);
    }

    boolean vacia() {//devuelve si la pila esta vacia
        return numeroElementos() == 0;
    }

    Integer desapilar() {
        //saca un elemento del final de la pila
        return eliminar(buscar(numeroElementos()-1));
    }

    Integer cima() {
        //devuleve el elemento de la cima de la pila
        return get(numeroElementos()-1);
    }
}
