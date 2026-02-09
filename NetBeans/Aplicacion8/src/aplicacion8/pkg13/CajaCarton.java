/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion8.pkg13;




/**
 *
 * @author daldo
 */
/*
La empresa de mensajeria BiciExpress, que reparte en bicicleta, para disminuir el peso
que transportan sus empleados solo utiliza cajas de cartón. El volumen de estas se calcu-
la como el 80% del volumen real, con el fin de evitar que se deformen y se rompan. Otra
característica de las cajas de cartón es que sus medidas siempre están en centimetros.
Por último, la empresa, para controlar costes, necesita saber cuál es la superficie total de
cartón utilizado para construir todas las cajas.
Escribe la clase CajaCarton heredando de la clase Caja.
*/
public class CajaCarton extends Caja{
    
    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, Unidad.CM);
    }
    
    @Override
    double getVolumen(){//calcula el volumen de la caja reduciendo al volumen real
        return super.getVolumen() * 0.8;
    }
    
    double getSuperficie(){//calcula la superficie de caja que se necesita
        double anchoM = super.ANCHO * 0.01;
        double altoM = super.ALTO * 0.01;
        double fondoM = super.FONDO * 0.01;
        double superficie = (anchoM * altoM + anchoM * fondoM + altoM * fondoM) * 2;
        return superficie;
    }
}
