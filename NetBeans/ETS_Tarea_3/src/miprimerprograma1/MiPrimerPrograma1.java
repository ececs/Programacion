/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerprograma1;

public class MiPrimerPrograma1 {

    public static void main(String[] args) {
        for (int operacion = 1; operacion <= 4; operacion++) {
        double resultado = calculadora(5.0, 4.0, operacion);
    }
}
static double calculadora(double a, double b, int operacion) {
    double result;
    result = switch (operacion) {
        case 1 ->
        a + b;
        case 2 ->
        a - b;
        case 3 ->
        a * b;
        case 4 ->
        (double)a / b;
        default -> {
        System.out.println("Operación no válida");
        yield 0;
        }
    };
    System.out.println(result);
    return (result);
    }
}