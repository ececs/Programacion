/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaplicacion3.pkg13;

import java.util.Scanner;

/**
 *
 * @author 1dawsemia
 */
/*
Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado la hora,
minutos y segundos, así como cuántos segundos se desea incrementar la hora introducida.
La aplicación mostrará la nueva hora. 
*/
public class Aaplicacion313 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, h, m, s, incremento;
        
        //Solicitamos que se introduzcan los datos: horas, Minutos, segundos y segundos a incrementar
        System.out.println("introduzca hora: ");
        h = sc.nextInt();
        System.out.println("introduzca minutos: ");
        m = sc.nextInt();
        System.out.println("introduzca segundos: ");
        s = sc.nextInt();
        System.out.println("introduzca segundos a incrementar: ");
        incremento = sc.nextInt();
        //Bucle para incrementar la cantidad de segundos introducida
        for (i = 1; i <= incremento; i++){
            s++;//incrementa un segundo
            if (s > 59){//si los segundos son más de 59
                s = 0;//ponemos los segundos a 0
                m++;//incrementamos en una unidad los minutos
                if (m > 59){//si los segundos son mas de 59
                    m = 0;//ponemos los minutos a cero
                    h++;//incrementamos las horas
                    if (h > 23){//si la hora supera 23
                            h=0;//reiniciamos la hora a 0
                    }
                }
            }
        
        }
        //imprimir por pantalla la nueva hora
        System.out.println("Hora + " + incremento + " segundos " + h + ":" + m + ":" + s);
    }
 }
    

