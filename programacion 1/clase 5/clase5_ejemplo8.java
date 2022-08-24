/*Dado un numero entero con valor inicial 3, imprimir la tabla de multiplicar de numero
*/
public class clase5_ejemplo8 {
    public static void main(String[] args) {
        final int MAX = 10;
        int numero = 3;
        for (int MULTIPLICADOR = 1 ; MULTIPLICADOR <= MAX; MULTIPLICADOR++) {
            System.out.println(MULTIPLICADOR*numero);
            
        }
    }
    
}
