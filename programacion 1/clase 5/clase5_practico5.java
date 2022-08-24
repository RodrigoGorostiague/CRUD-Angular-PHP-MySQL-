/*Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase5_practico5 {
    public static void main(String[] args) {
        int numero;
        int nuevo = 0;
        int nuevo2;
        final int max = 10;
        final int min = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("ingrese un numero entero entre " + min + " y " + max);
            numero = Integer.valueOf(entrada.readLine());
            while ((numero<=max)&&(numero>=min)) {
                nuevo=numero+nuevo;

                System.out.println("ingrese un nuevo numero entero entre " + min + " y " + max);
            numero = Integer.valueOf(entrada.readLine());
            }
           

        } catch (Exception exc) {
            System.out.println(exc);
        }
        
            System.out.println("el total es " + nuevo);
        
    }
    
}
