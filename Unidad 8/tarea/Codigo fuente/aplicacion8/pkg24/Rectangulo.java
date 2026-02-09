/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion8.pkg24;

/**
 *
 * @author daldo
 */
/*
 Heredando de Poligono, implementa las clases no abstractas Triangulo y Rectangulo.
*/
class Rectangulo extends Poligono{

    @Override
    double area() {//calcula el area para un rectángulo
        return base * altura;
    }
    
}
