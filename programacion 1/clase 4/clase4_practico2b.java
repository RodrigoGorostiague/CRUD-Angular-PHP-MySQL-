/*Hacer un programa que solicite la carga desde consola de
un carácter y realice: imprima si es dígito, o letra minúscula, o
es cualquier otro carácter. Si es letra minúscula indicar si es
vocal o consonante.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase4_practico2b {
    public static void main(String[] args) {
        char caracter;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
            if((caracter>='0') && (caracter<='9')) {
                //...d
                System.out.println(caracter + " es digito");
            }
            else if ((caracter>='a') && (caracter<='z')) {
                //...minuscula
                System.out.println(" es minuscula");
                switch (caracter){
                    case 'a': case 'e': case 'i': case 'o': case 'u':{
                        System.out.println(caracter + " es vocal");
                        break;
                    } 
                    default:{
                        // cons
                        System.out.println(caracter + " es consinante.");
                    }
                }
            }
            else{
                //...otro caracter
                System.out.println("es otro caracter");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}