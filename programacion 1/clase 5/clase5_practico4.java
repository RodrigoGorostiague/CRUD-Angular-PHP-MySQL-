/*Escribir un programa que mientras que el usuario ingrese un caracter dígito
o caracter letra minúscula, imprima si es caracter dígito o caracter letra
minúscula, y si es letra minúscula imprimir si es vocal o consonante.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase5_practico4 {
    public static void main(String[] args) {
        char ingreso;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter digito o letra minuscula");
            ingreso = entrada.readLine().charAt(0);
            while (((ingreso>='a')&&(ingreso<='z'))||((ingreso>='0')&&(ingreso<='9'))) {
                if ((ingreso>='0')&&(ingreso<='9')) {
                    System.out.println(ingreso + " es un digito");                    
                }
                else{
                    switch (ingreso) {
                        case 'a': case 'e': case 'i': case 'o': case 'u':{
                            System.out.println(ingreso + " es una vocal minuscula");
                        }
                            
                            break;                       
                    
                    
                        default:{
                            System.out.println(ingreso + " es una consonante minuscula");
                        }
                            break;
                    }
                }
                System.out.println("Ingrese un caracter digito o letra minuscula");
            ingreso = entrada.readLine().charAt(0);
            }


            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}
