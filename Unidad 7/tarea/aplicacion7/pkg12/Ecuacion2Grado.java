/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion7.pkg12;

/**
 *
 * @author daldo
 */
/*
Implementa una clase que permita resolver ecuaciones de segundo grado. Los coeficientes
pueden indicarse en el constructor y modificarse a posteriori. Es fundamental que la
clase disponga de un método que devuelva las distintas soluciones y de un método que
nos informe si el discriminante es positivo.
*/
class Ecuacion2Grado {
    
    private double a;
    private double b;
    private double c;
   
    
    public Ecuacion2Grado(int i, int i0, int i1) {
        this.a = i;
        this.b = i0;
        this.c = i1;
    }

    
    boolean esPositivoDiscriminante() {
        return (getDisc() > 0);//devolver si el discriminante es mayor que cero
    }
    
    double getDisc(){
        double disc;
        disc = Math.pow(b, 2)- 4 * a * c;
        return disc;//devolver el discriminante
    }
    
    double[] solucion() {
        double disc = getDisc();
        double sol[];
        //resolver la ecuación de segundo grado si el discriminante es mayor 
        //que cero, cero, o menor que cero
        if (disc < 0){
            System.out.println("No hay soluciones reales");
            sol = new double[1];
            sol[0] = 0; //devolvemos 0 para evitar el error
        } else if(disc == 0){
            sol = new double[1];
            sol[0] = -b / (2 * a);
        } else {
            sol = new double[2];
            sol[0] = ((-b + Math.sqrt(disc)) / (2 * a));
            sol[1] = ((-b - Math.sqrt(disc)) / (2 * a));
        }
        return sol;
    }

    void setA(int i) {
       this.a = i;//guardar en el atributo a un nuevo valor
    }
    void setB(int i0) {
       this.b = i0;//guardar en el atributo b un nuevo valor
    }
    void setC(int i1) {
       this.c = i1;//guardar en el atributo c un nuevo valor
    }
    
    
}
