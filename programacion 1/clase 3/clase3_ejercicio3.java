/*Escribir un programa que permita el ingreso de dos números enteros por
teclado e imprima los resultados de comparar:
_ el primero mayor al segundo.
_ ambos son múltiplos de 2.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase3_ejercicio3 {
    public static void main (String[] args) {
        int numero1, numero2;
        boolean resultado;

        try{
            BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
            System.out.println ("ingrese un valor: ");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println ("ingrese un nuevo valor: ");
            numero2 = Integer.valueOf(entrada.readLine());
            resultado = (numero1 > numero2);
            System.out.println ("El primer valor es mayor que el segundo: " + resultado);
            resultado = (((numero1 % 2)==0)&&((numero2 % 2)==0));
            System.out.println ("Ambos numeros ingresados son múltiplos de 2: " + resultado);
        }

        catch (Exception exc){
            System.out.println(exc);
        }

        
    }

    
}
