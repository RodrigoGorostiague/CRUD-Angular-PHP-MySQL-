/*Dado un numero entero con valor inicial 1, hacer una iteración que haga
incrementar numero de a uno hasta un valor MAX = 4 (constante). Mientras
itera deberá imprimir numero
*/
public class clase5_ejemplo1 {
  public static void main(String[] args) {
      int inicial = 1;
      final int MAX = 4;
      try {
          while (inicial <= MAX) {
              System.out.println("El numero es " + inicial);
              inicial++;
              
          }
          
      } catch (Exception exc) {
          System.out.println(exc);
      }
  }  
}
