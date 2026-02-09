/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion7.pkg15;

/**
 *
 * @author daldo
 */
/*
Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La cla-
se debe disponer de los métodos:
• Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados
como parámetros, siempre y cuando, la fecha que representen sea correcta.
• void incrementarDia (): que incrementa en un día la fecha del calendario.
• void incrementarMes (): que incrementa en un mes la fecha del calendario.
• void incrementarAño (int cantidad): que incrementa la fecha del calendario en el
número de años especificados. Ten en cuenta que el año 0 no existió.
• void mostrar (): muestra la fecha por consola.
• boolean iguales (Calendario otraFecha): que determina si la fecha invocante y la
que se pasa como parámetro son iguales o distintas.
Por simplicidad, solo tendremos en consideración que existen meses con distinto núme-
ro de días, pero no tendremos en cuenta los años bisiestos.
*/
class Calendario {
    //creamos los atributos y almacenamos 1
    private int dia = 1;
    private int mes = 1;
    private int ano = 1;
    Calendario(int i, int i0, int i1) {
        dia = i;
        mes = i0;
        ano = i1;
    }

    void mostrar() {
        switch (mes){
            case 1 -> System.out.println(dia + " de enero de " + ano );
            case 2 -> System.out.println(dia + " de febrero de " + ano );
            case 3 -> System.out.println(dia + " de marzo de " + ano );
            case 4 -> System.out.println(dia + " de abril de " + ano );
            case 5 -> System.out.println(dia + " de mayo de " + ano );
            case 6 -> System.out.println(dia + " de junio de " + ano );
            case 7 -> System.out.println(dia + " de julio de " + ano );
            case 8 -> System.out.println(dia + " de agosto de " + ano );
            case 9 -> System.out.println(dia + " de septiembre de " + ano );
            case 10 -> System.out.println(dia + " de octubre de " + ano );
            case 11 -> System.out.println(dia + " de noviembre de " + ano );
            case 12 -> System.out.println(dia + " de diciembre de " + ano );
        }
    }

    void incrementarDia() {
        dia++;//incrementar dia
        //si el mes tiene 31 dias
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia == 32){
                incrementaMes();
                dia = 1;
            }
        }else if (mes == 2){//si el mes es febrero
            if (dia == 29){
                incrementaMes();
                dia = 1;
            }
        }else {//si el mes tiene 30 dias
            if (dia == 31){
                incrementaMes();
                dia = 1;
            }
        }
    }

    void incrementaMes() {
        mes++;
        if (mes > 12){//si el mes es mayor que 12 incrementar año
            incrementarAno(1);
            mes = 1; //ponemos mes a 1
        }
    }
    void incrementarAno(int cantidad) {
        ano += cantidad;//incrementar año una catidad
    }
    boolean iguales(Calendario otraFecha) {
        boolean igual;
        //debolbemos igual si dia mes y año coinciden
        igual = otraFecha.dia == this.dia && otraFecha.mes == this.mes && otraFecha.ano == this.ano;
        return igual;
    }
    
}
