package aplicacion7.pkg14;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daldo
 */
/*

/*
Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al realizar
una compra, con el menor número de monedas y billetes posibles.
*/
class Cambio {
    private float importe;

    public Cambio(float importe) {
        this.importe = importe;
    }

    void mostrarCambio() {
        float devolver = this.importe;
        //hacemos una variable para cada billete o moneda disponible
        int doscientos = 0;
        int cien = 0;
        int cincuenta = 0;
        int veinte = 0;
        int diez = 0;
        int cinco= 0 ;
        int dos = 0;
        int uno = 0;
        int cincuentaCentimos = 0;
        int veinteCentimos = 0;
        int diezCentimos = 0;
        int cincoCentimos = 0;
        int dosCentimos = 0;
        int unCentimo = 0;
        //mientras tengamos billetes o monedas disponibles para devolver 
        //incrementamos la mayor variable con la que se puede devolver
        while (devolver >= 0.01) {
            if (devolver >= 200){
                doscientos++;
                devolver -= 200;
            } else if (devolver >= 100){
                cien++;
                devolver -= 100;
            } else if (devolver >= 50){
                cincuenta++;
                devolver -= 50;
            } else if (devolver >= 20){
                veinte++;
                devolver -= 20;    
            } else if (devolver >= 10){
                diez++;
                devolver -= 10;    
            } else if (devolver >= 5){
                cinco++;
                devolver -= 5;
            } else if (devolver >= 2) {
                dos++;
                devolver -= 2;
            }else if (devolver >= 1) {
                uno++;
                devolver -= 1;
            }else if (devolver >= 0.5) {
                cincuentaCentimos++;
                devolver -= 0.5;
            }else if (devolver >= 0.2) {
                veinteCentimos++;
                devolver -= 0.2;
            }else if (devolver >= 0.1) {
                diezCentimos++;
                devolver -= 0.1;
            }else if (devolver >= 0.05) {
                cincoCentimos++;
                devolver -= 0.05;
            }else if (devolver >= 0.02) {
                dosCentimos++;
                devolver -= 0.02;
            }else if (devolver >= 0.01) {
                unCentimo++;
                devolver -= 0.01;
            } 
        }
        //imprimir en pantalla la cantidad de cada billete y moneda para hacer el cambio
        System.out.println("Devolver: ");
        if (doscientos != 0) System.out.println(doscientos + " billetes de doscientos €. ");
        if (cien != 0) System.out.println(cien + " billetes de cien €. ");
        if (cincuenta != 0) System.out.println(cincuenta + " billetes de cincuenta €. ");
        if (veinte != 0) System.out.println(veinte + " billetes de veinte €. ");
        if (diez != 0) System.out.println(diez + " billetes de diez €. ");
        if (cinco != 0) System.out.println(cinco + " billetes de cinco €. ");
        if (dos != 0) System.out.println(dos + " moneda de dos €. ");
        if (uno != 0) System.out.println(uno + " monedas de un €. ");
        if (cincuentaCentimos != 0) System.out.println(cincuentaCentimos + " monedas de cincuenta centimos de €. ");
        if (veinteCentimos != 0) System.out.println(veinteCentimos + " monedas de veinte centimos de €. ");
        if (diezCentimos != 0) System.out.println(diezCentimos + " monedas de diez centimos de €. ");
        if (cincoCentimos != 0) System.out.println(cincoCentimos + " monedas de cinco centimos de €. ");
        if (dosCentimos != 0) System.out.println(dosCentimos + " monedas de dos centimos de €. ");
        if (unCentimo != 0) System.out.println(unCentimo + " monedas de un centimo de €. ");
    }

    void setImporte(float importe) {
        this.importe = importe;
    }
    
}
