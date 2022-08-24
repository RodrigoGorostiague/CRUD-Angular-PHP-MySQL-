/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, obtenga la cantidad de números pares que tiene y la imprima. */
import java.util.Random;
public class clase_7_practico_2 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /*arr max10 */
        int [] arrenteros = new int[MAX];
        /*cargar arr */
        cargar_arreglo_aleatorio_int(arrenteros);
        imprimir_arreglo_int(arrenteros);
        /*obtener cantidad de numeros pares (metodo) */
        obtener_cantidad_de_numeros_pares(arrenteros);
        /*impriir cantidad */
        
    }
    /*obtener cantidad de numeros pares */
    public static void obtener_cantidad_de_numeros_pares(int []arrenteros){
        int i = MAX-1;
        int j = 0;
        while (i>0) {
            if ((arrenteros[i]%2)==0) {
                j++;
            }
            i--;
           
        }
        System.out.println("hay "+j+" numeros pares");

    }

    public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
        }

    public static void imprimir_arreglo_int(int [] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
        }
        }
}
