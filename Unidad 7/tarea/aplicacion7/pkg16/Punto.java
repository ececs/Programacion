/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion7.pkg16;

/**
 *
 * @author daldo
 */
/*
Escribe la clase Punto que representa un punto en el plano (con un componente x y un
componente y), con los métodos:
• Punto(double x, double y): construye un objeto con los datos pasados como pa-
rámetros.
• void desplazaX (double dx): incrementa el componente x en la cantidad dx.
• void desplazaY (double dy): incrementa el componente y en la cantidad dy.
• void desplaza (double dx, double dy): desplaza ambos componentes según las
cantidades dx (en el eje x) y dy (en el componente y).
• double distanciaBuclidea (Punto otro): calcula y devuelve la distancia euclidea
entre el punto invocante y el punto otro.
• void muestra (): muestra por consola la información relativa al punto.
*/
class Punto {
    private double x;
    private double y;
    
    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void desplazaX(double dx) {
        //incrementa el componente x en la cantidad dx
        x += dx;
    }

    void desplazaY(double dy) {
        //incrementa el componente y en la cantidad dy
        y += dy;
    }
    
    void desplaza(double dx, double dy){
        //desplaza ambos componentes según las cantidades dx y dy
        x += dx;
        y += dy;
    }
   
    double distanciaEuclidea(Punto otro) {
        //calcula y devuelve la distancia euclidea entre el punto invocante y el punto otro
        return Math.sqrt(Math.pow(x - otro.x, 2) + Math.pow(y - otro.y, 2));
    }
    void muestra(){
        //muestra por consola la información relativa al punto
        System.out.println("x: " + x + " y: " + y);
    }
}
