/*Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase5_practico3 {
    public static void main(String[] args) {
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero distinto de 0");
            numero = Integer.valueOf(entrada.readLine());
            while (numero!=0) {
                System.out.println("ingrese un nuevo numero distinto de 0");
                numero = Integer.valueOf(entrada.readLine());
                System.out.println("El nuevo nuero es: " + numero);

                
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}
