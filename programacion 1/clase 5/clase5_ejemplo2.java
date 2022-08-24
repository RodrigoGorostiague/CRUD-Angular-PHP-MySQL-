/*Hacer un programa que mientras que el usuario cargue un numero entero distinto de 0 lo imprima
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase5_ejemplo2 {
    public static void main (String[] args) {
        int numero;
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
               
        try {
            System.out.println("ingrese un nuero entero (ingresar 0 para salir)");                
            numero = Integer.valueOf(entrada.readLine());

            while (numero != 0) {                
                System.out.println("El nmuemro es " + numero);
                System.out.println("ingrese un nuero entero (ingresar 0 para salir)");
                numero = Integer.valueOf(entrada.readLine());
                
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
