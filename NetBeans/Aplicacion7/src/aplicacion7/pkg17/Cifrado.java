/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion7.pkg17;

import java.util.Arrays;

/**
 *
 * @author daldo
 */
/*
El cifrado César es una forma sencilla de modificar un texto para que no sea entendible
a quienes no conocen el código. Este cifrado consiste en modificar cada letra de un tex-
to por otra que se encuentra en el alfabeto n posiciones detrás.
Por ejemplo, para un valor de n igual a 3, la letra a se codifica con la d, y la letra q se co-
difica con la x. En el caso de que una letra exceda a la z, seguiremos de forma circular
utilizando la a. Solo se cifrarán las letras, mayúsculas o minúsculas.
Realiza una clase que, mediante un método estático, devuelva cifrado el texto que se le
pasa con un paso de n letras.
*/
class Cifrado {
    static String cesar(String texto, int n) {
        //creamos el array tablaCesar del mismo tamaño que los caracteres del texto 
        char textoCesar[] = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            //para cada elemento del texto
            char aux = texto.charAt(i);//guardamo en aux
            if (Character.isLetter(aux)){
                //si aux es letra creamos base para calcular aux
                char base = Character.isUpperCase(aux) ? 'A' : 'a';
                //si base es un caracter en ayuscula base es A y si no es a
                aux = (char)((aux - base + n) % 26 + base);//calculamos aux
            }
            textoCesar[i] = aux;//asignamos al elemento con inidice i -> aux
        }
        return new String(textoCesar);//devolvemos un String de textoCesar
    }
    
}
