/*Hacer un programa que mientras que el usuario cargue un numero entero distinto de 0 lo
imprima
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase5_ejemplo5 {
    public static void main(String[] args) {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            do{
                System.out.println("Ingresar un nuero entero (0 para salir)");
                numero = Integer.valueOf(entrada.readLine());
                System.out.println("El numero ingresado es: " + numero);
        }
            while (numero !=0); {
                
                               
            }
        } catch (Exception exc) {
            System.out.println(exc);
        } 
    }
}
