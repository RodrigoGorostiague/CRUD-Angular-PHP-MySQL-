/*Dado un numero entero con valor inicial 1, hacer una iteración que haga
incrementar numero de a uno hasta un valor MAX = 5 (constante). Mientras
itera deberá imprimir si numero es par
*/

public class clase5_ejemplo4 {
    public static void main(String[] args) {
        int numero = 1;
        final int MAX = 5;
        do {
            numero++;
            System.out.println(numero + " es par");
        } while (numero<=MAX);
        
    }
    
}
