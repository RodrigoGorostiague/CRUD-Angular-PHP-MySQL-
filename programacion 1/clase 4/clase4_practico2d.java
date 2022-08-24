/*Se pide: hacer un programa completo en el cual se solicite de teclado el
ingreso de un día, un número de mes, y un año; luego calcule la cantidad
de días desde la última luna nueva (edad lunar), e informe por pantalla en
cual de las 4 fases se corresponde para esa fecha*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase4_practico2d {
    public static void main(String[] args) {
        int dia, mes, anio, numero_aureo, epacta, edad_lunar;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un dia: ");
            dia = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese un mes: ");
            mes = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese un año: ");
            anio = Integer.valueOf(entrada.readLine());

            numero_aureo = ((anio+1)%19);
            epacta = (((numero_aureo-1)*11)%30);
                //edad lunar
                if(mes >=3){
                    mes = mes - 2;
                }
                else{
                    mes= mes+10;
                }
                edad_lunar = (epacta + mes+dia);
                //edad lunar corregida
                if (edad_lunar > 28);{
                edad_lunar = (edad_lunar%30);
                }
                switch(edad_lunar){
                    //llena
                    case 1 :case 2 : case 3 : case 4 : case 5 : case 6 : case 7 : {
                        System.out.println("La fase lunar es Luna Llena");
                        break;
                    } 
                    //4men
                    case 8 : case 9 : case 10 : case 11 : case 12 : case 13 : case 14 : {
                        System.out.println("La fase lunar es Cuarto Menguante");
                        break;
                    }
                    //ln
                    case 15 : case 16 :case 17 : case 18 : case 19 : case 20 : case 21 :  {
                        System.out.println("la fase lunar es Luna Nueva");
                        break;
                    }
                    //4cre
                    case 22 : case 23 : case 24 : case 25 : case 26 : case 27 : case 28 : {
                        System.out.println("la fase lunar es Cuarto Creciente");
                        break;
                    }
                }
                
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
