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
public class Caja {
    final double ANCHO;
    final double ALTO;
    final double FONDO;
    public String etiqueta;
    
    
    public Caja(double ancho, double alto, double fondo, Unidad unidad){
        if(unidad == Unidad.CM){
            this.ANCHO = ancho / 100;
            this.ALTO = alto / 100;
            this.FONDO = fondo /100;
        } else{ 
            this.ANCHO = ancho; 
            this.ALTO = alto; 
            this.FONDO = fondo; }
    }
    
    double getVolumen(){
        return ANCHO * ALTO * FONDO * 0.8;
    }
    
    void setEtiqueta(String etiqueta){
        if(etiqueta.length() <= 30){
            this.etiqueta = etiqueta;
        } else{
            System.out.println("La etiqueta no puede superar los 30 caracteres");
        }
    }
    
    
    @Override
    public String toString(){
        return "Caja [ancho " + ANCHO + "m, alto " + ALTO + "m, fondo " + FONDO + "m, etiqueta " + etiqueta + "]";
    }
}
