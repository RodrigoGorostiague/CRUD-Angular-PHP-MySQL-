/*Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
vocal minúscula.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase5_practico2 {
    public static void main(String[] args) {
        char ingreso;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter distinto de *");
            ingreso = entrada.readLine().charAt(0);
            while (ingreso != '*') {
                if ((ingreso>='0')&&(ingreso<='9')) {
                    System.out.println(ingreso + " es un digito");
                    
                }
                else{
                    switch (ingreso) {
                        case 'a': case 'e': case 'i': case 'o': case 'u':{
                            System.out.println(ingreso + " es una vocal minuscula");
                        }
                            
                            break;                       
                    }
                }
                System.out.println("Ingrese un caracter distinto de *");
                ingreso = entrada.readLine().charAt(0);
                
            }
            
        } catch (Exception exc) {
           System.out.println(exc);
        }
    }
    
}
