package aplicacion8.pkg14;

/*
 Implementamos las listas de tipo Integer con tablas, que iremos redimensionando 
 según vaya haciendo falta. Los elementos de la lista se insertan desde el 
 principio de la tabla hacia el final. El número de elementos insertados se 
 refleja en el atributo numeroElementos, que son los elementos válidos de la 
 tabla. El índice de un elemento en la lista coincide con el índice del lugar que
 ocupa en la tabla.
 */
/*
Reimplementa la clase Lista de la Actividad resuelta 7.11, sustituyendo el método 
mostrar() por el método toString ().
*/
import java.util.Arrays;

public class Lista {
   Integer[] tabla;

   public Lista() {
      tabla = new Integer[0];
   }

   void insertarPrincipio(Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
      tabla[0] = nuevo;
   }

   void insertarFinal(Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      tabla[tabla.length - 1] = nuevo;
   }

   void insertarFinal(Lista otraLista) {
      int tamIni = tabla.length;
      tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
      System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
   }

   void insertar(int posicion, Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      System.arraycopy(tabla, posicion, tabla, posicion + 1,
         tabla.length - posicion - 1);
      tabla[posicion] = nuevo;
   }

   Integer eliminar(int indice) {
      Integer eliminado = null;
      if (indice >= 0 && indice < tabla.length) {
         eliminado = tabla[indice];
         for (int i = indice + 1; i < tabla.length; i++) {
            tabla[i - 1] = tabla[i];
         }
         tabla = Arrays.copyOf(tabla, tabla.length - 1);
      }
      return eliminado;
   }

   Integer get(int indice) {
      Integer resultado = null;
      if (indice >= 0 && indice < tabla.length) {
         resultado = tabla[indice];
      }
      return resultado;
   }

   int buscar(Integer claveBusqueda) {
      int indice = -1;
      for (int i = 0; i < tabla.length && indice == -1; i++) {
         if (tabla[i].equals(claveBusqueda)) {
            indice = i;
         } else {
         }
      }
      return indice;
   }

   public int numeroElementos() {
      return tabla.length;
   }

   public void mostrar() {
      System.out.println("Lista: " + Arrays.toString(tabla));
   }
   
   @Override// sustituye el metodo mostrar() y hacemos overide en toString para 
            //que imprima los elemetos del array
    public String toString() {
      return Arrays.toString(tabla);
    }
}

    

