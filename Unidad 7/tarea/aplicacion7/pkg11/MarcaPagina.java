package aplicacion7.pkg11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daldo
 */
/*
Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. 
Deberá disponer de métodos para incrementar la página leída, para obtener información de
la última página que se ha leído y para comenzar desde el principio una nueva lectura del
mismo libro.
*/
class MarcaPagina {
    int pagina;
    MarcaPagina(){
        pagina = 0;//guardamos 0 en el atributo página
    }
    
    void siguientePag() {
        pagina += 1;//incrementar 1 en el atributi pagina
    }

    int ultimaPaginaLeida() {
        return pagina;//debolbemos el valor almacenadoe n el atributo pagina
    }

    void comenzar() {
        pagina = 0;//ponemos el atributo pagina a 0
    }
    
    
}
