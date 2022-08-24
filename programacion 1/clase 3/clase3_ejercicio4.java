/*Escribir un programa que ingrese un número entero por teclado e
imprima los resultados de determinar:
_ el número es múltiplo de 6 y de 7,
_ el número es mayor a 30 y múltiplo de 2, o es menor igual a 30,
_ el cociente de la división de dicho número con 5 es mayor a 10.*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase3_ejercicio4 {
    public static void main (String[] args) {
        int numero1;
        boolean resultado;

        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
            System.out.println("Ingrese un numero entero: ");
            numero1 = Integer.valueOf(entrada.readLine());
            resultado = (((numero1 % 6)==0)&&((numero1 % 7)==0));
            System.out.println("El numero es ultiplo de 6 y de 7: " + resultado);
            resultado = (((numero1 > 30)&&((numero1 % 2)==0))||(numero1 <= 30));
            System.out.println("El número es mayor a 30 y múltiplo de 2, o es menor igual a 30: "+ resultado);
            resultado = ((numero1 / 5)>10);
            System.out.println ("El cociente de la división de dicho número con 5 es mayor a 10: " + resultado);
        }
        catch(Exception exc){
            System.out.println( exc );
        }
        
    }
}
