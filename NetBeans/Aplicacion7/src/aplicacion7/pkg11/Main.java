package aplicacion7.pkg11;


public class Main {

   public static void main(String[] args) {
      MarcaPagina marca;
      marca = new MarcaPagina();
      marca.siguientePag();
      marca.siguientePag();
      marca.siguientePag();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
      marca.comenzar();
      System.out.println("Última página: " + marca.ultimaPaginaLeida());
   }
}
