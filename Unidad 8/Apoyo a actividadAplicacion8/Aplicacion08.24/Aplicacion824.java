
package aplicacion8.pkg24;


public class Aplicacion824 {

    public static void main(String[] args) {
         // TODO code application logic here
        
        Triangulo t = new Triangulo();
        t.base = 10;
        t.altura = 10;
        
        System.out.println("Area Triangulo: "+ t.area());
        
        Rectangulo r = new Rectangulo();
        r.base = 10;
        r.altura = 10;
        
        System.out.println("Area Rentangulo: "+ r.area());

    }
    
}
