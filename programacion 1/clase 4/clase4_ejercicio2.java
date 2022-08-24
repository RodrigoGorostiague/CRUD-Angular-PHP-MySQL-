/*Escribir un programa que permita el ingreso de dos números enteros
por teclado y realice:
_ imprima A si el primero mayor al segundo,
_ o imprima B si ambos son múltiplos de 2,
_ o imprima C para ninguna de las opciones anteriores */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase4_ejercicio2 {
    public static void main(String[] args) {
        int numero1, numero2;
        
    
    try {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese cuLquier numero: ");
        numero1 = Integer.valueOf (entrada.readLine());
        System.out.println("ingrese cualquier numero: ");
        numero2 = Integer.valueOf (entrada.readLine());
        if (numero1>numero2){
            System.out.println("A");
        }
        else if (((numero1 % 2)==0)&&((numero2 % 2)==0)){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    } 
    catch (Exception exc) {
        System.out.println(exc);
    }
    
}
}
    
