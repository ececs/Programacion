/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion6.pkg13;

/**
 *
 * @author daldo
 */
public class Aaplicacion613 {

    /**
     * @param args the command line arguments
     */
    /*
    El preprocesador del lenguaje C elimina los comentarios (/* .*//*) del código fuente antes
    de compilar. Diseña un programa que lea por teclado una sentencia en C, y elimine los
    comentarios.
    Sentencia: if (a==3) /* igual a tres *//* a++: /* incrementamos a *//*
    Salida: if (a==3) a++:
    */
    public static void main(String[] args) {
        //texto para quitar comentarios
        String cadena1 = "if (a==3) /* igual a tres */ a++: /* incrementamos a */";
        int i1 = cadena1.indexOf("/*");//guardamos en i1 la posición de el inicio del comentario
        while(i1 != -1){//mientras i1 sea distinto de -1
            int i2 = cadena1.indexOf("*/");//guardamos en i2 el indice del fin de comentario
            //a cadena 1  le quitamos la parte del comentario
            cadena1 = cadena1.substring(0, i1-1) + cadena1.substring(i2+2);
            //guardamos en i1 el inicio de otro comentario
            i1 = cadena1.indexOf("/*");
        }
        //imprimir cadena1
        System.out.println(cadena1);  
    }
    
}
