/*Escribir un programa que permita el ingreso de un carácter y realice:
_ imprima es carácter dígito si el carácter ingresado es carácter
dígito,
_ o imprima no es carácter dígito */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase4_practico1 {
    public static void main(String[]args) {
        char caracter;

        try {
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese cuLquier caracter: ");
            caracter = entrada.readLine() .charAt(0);
            if (('0'<=caracter)&&(caracter<='9')){
                System.out.println(caracter + " es carácter dígito.");
            }
            else{
                System.out.println(caracter + " no es caracter digito.");
            }
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
        
    }
    
}
