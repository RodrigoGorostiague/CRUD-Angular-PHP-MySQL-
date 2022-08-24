/*Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados en el
enunciado deberían ser constantes?. De a poco habría que definirlos
como constantes).*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;

public class clase5_practico1{
    public static void main(String[] args) {
        int numero;
        final int MAX = 10;
        final int MIN = 1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingresar un numero menor que "+ MAX + " y mayor que " + MIN);
            numero = Integer.valueOf(entrada.readLine());
            while ((MIN<=numero)&&(numero<=MAX)) {
                if (((numero % 2)==0)&&((numero % 3)==0)) {
                    System.out.println(numero + " es multiplo de 2 y de 3");
                }
                System.out.println("ingresar un numero menor que "+ MAX + " y mayor que " + MIN);
                numero = Integer.valueOf(entrada.readLine());
                
            }
        } catch (Exception exc) {
           System.out.println(exc);
        }
    }
}