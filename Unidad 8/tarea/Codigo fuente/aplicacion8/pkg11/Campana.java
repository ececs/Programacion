/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion8.pkg11;

/**
 *
 * @author daldo
 */
public class Campana extends Instrumento {
    public Campana(){
        super();
    }
    @Override //implementamos el metodo abstracto
    //recorremos las notas y las interpretamos de la forma especifica de la campana
    void interpretar() {
        for(Nota nota: melodia){
            switch (nota){
                case DO ->
                    System.out.println("dong dong ");
                case RE ->
                    System.out.println("reng reng ");
                case MI ->
                    System.out.println("ming ming ");
                case FA ->
                    System.out.println("fang fang ");
                case SOL ->
                    System.out.println("solng solng "); 
                case LA ->
                    System.out.println("lang lang ");
                case SI ->
                    System.out.println("sing sing ");
            }
        }
        System.out.println();
    }
    
}
