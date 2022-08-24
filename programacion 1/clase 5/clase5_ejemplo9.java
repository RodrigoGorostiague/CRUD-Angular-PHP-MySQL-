/*Hacer un programa que mientras que el usuario cargue un numero entero entre 1 y 3, imprima el numero y la tabla de multiplicar del numero ingresado
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase5_ejemplo9 {
    public static void main(String[] args) {
        int numero;
        final int MIN = 1;
        final int MAX = 3;
        final int MAXMULTIPLICADOR = 10;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero entre " + MIN + " y " + MAX);
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN <= numero)||(numero<=MAX)){
                System.out.println("Tabla de multiplicar de: " + numero);
                for (int MULTIPLICADOR = 1 ; MULTIPLICADOR <= MAXMULTIPLICADOR; MULTIPLICADOR++) {
                    
                    System.out.println(numero * MULTIPLICADOR);
                }
                System.out.println("ingrese un numero entre " + MIN + " y " + MAX);
                numero = Integer.valueOf(entrada.readLine());
            }
         
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
 
}
