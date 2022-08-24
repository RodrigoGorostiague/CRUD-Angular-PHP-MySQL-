/*Dado un caracter ingresado por el usuario hacer: _ imprimir si es caracter minuscula, _ o imprimir si es caracter mayuscula,
*_ o imprimir no es caracter letra
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase4_ejercicio6 {
    public static void main() {
    char caracter;

    try {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.prinln("ingrese un caracter: ");
        caracter = entrada.reaLine() .charAt(0);

        if ((caracter>='a')&&(caracter<='z')){
            System.out.println(caracter + " es una letra minuscula");
        }
        else if ((caracter>='A')&&(caracter<='Z')){
            System.out.println(caracter + "es una letra mayuscula");
        }
        else{
            System.out.println(caracter + " no es una letra");
        }
    } 
    catch (Exception exc) {
        System.out.println( exc);
    }
        
    }
    
}
