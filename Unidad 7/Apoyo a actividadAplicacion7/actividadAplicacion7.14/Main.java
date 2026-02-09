import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      Cambio c = new Cambio((float) 12.30);
      c.mostrarCambio();
      c.setImporte((float) 1234.56);
      c.mostrarCambio();
   }
}
