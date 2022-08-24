/*Escribir un programa que mientras el usuario cargue desde teclado un numero distinto de 0, llame a un método que imprima por pantalla los numeros
entre 1 y 4 de forma creciente
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase6_ejemplo4 {
    public static void main(String[] args) {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero distinto a 0: ");
            numero = Integer.valueOf(entrada.readLine());
            while(numero !=0){
                //imprimir entre 1 y 4
                imprimir_1_a_4();
                System.out.println("Ingrese un numero distinto a 0: ");
                numero = Integer.valueOf(entrada.readLine());
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void imprimir_1_a_4(){
        final int max = 4;
        final int min =1;
        for (int i = min; i <= max; i++) {
            System.out.println("El numero es: "+ i);
            
        }
    }
}
