/*Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días
de ese mes. En el caso de que ingrese 2 como número de mes
(febrero), para imprimir la cantidad de días deberá solicitar
ingresar un número de anio (no usar ñ), para determinar si es
bisiesto o no con la siguiente sentencia:
_si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero,
entonces es bisiesto.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
public class clase4_practico2c {
    public static void main(String[] args) {
        int mes, anio;
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese un numero de mes: ");
        mes = Integer.valueOf(entrada.readLine());
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                //31d
                System.out.println("El mes ingresado tiene 31 dias.");
            }
            case 4: case 6: case 9: case 11: {
                //30d
                System.out.println("El mes ingresado tiene 30 dias.");
            }
            case 2: {
                //febrero
                System.out.println("ingrese año: ");
                anio = Integer.valueOf(entrada.readLine());
                if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
                    //biciesto
                    System.out.println("El mes ingresado tiene 29 dias.");
                }
                else{
                    //28d
                    System.out.println("El mes ingresado tiene 28 dias.");
                }
            }
            break;

        }

        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        
    }
}
