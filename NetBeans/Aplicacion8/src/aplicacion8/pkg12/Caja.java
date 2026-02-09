/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion8.pkg12;

/**
 *
 * @author daldo
 */
/*
Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mer-
cancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho,
un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada una
etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del des-
tinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos:
• Caja (int ancho, int alto, int fondo, Unidad unidad): que construye una caja
con las dimensiones especificadas, que pueden encontrarse en «cm» (centímetros) o
«m» (metros).
• double getVolumen (): que devuelve el volumen de la caja en metros cúbicos.
• void setEtiqueta (String etiqueta): que modifica el valor de la etiqueta de la caja.
• String toString (): que devuelve una cadena con la representación de la caja.
*/
public class Caja {
    private final double ANCHO;
    private final double ALTO;
    private final double FONDO;
    public String etiqueta;
    
    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        if(unidad == Unidad.CM){
            ANCHO = (double)ancho / 100;
            ALTO = (double)alto / 100;
            FONDO = (double)fondo /100;
            System.out.println(ANCHO + " " + ALTO + " " + FONDO);
        } else{
            ANCHO = ancho;
            ALTO = alto;
            FONDO = fondo;
        }
        
    }
    
    double getVolumen(){
        return ANCHO * ALTO * FONDO;
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
