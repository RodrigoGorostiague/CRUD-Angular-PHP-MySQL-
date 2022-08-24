/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo
(posición 0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor
del arreglo) y colocar el numero en el arreglo en la posición indicada. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class clase_7_ejercicio_4 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /*arr max 10 */
        int [] arrenteros = new int [MAX];
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{

            /*cargar arr */
            cargar_arreglo_aleatorio_int(arrenteros);
            /*imprimir arr */
            imprimir_arreglo_int(arrenteros);
            /*solicitar pos0+corrimiento der */
            System.out.println("ingresar posicion 0: ");
            pos = Integer.valueOf(entrada.readLine());
            pos_0_corrimiento_der(arrenteros, pos);
            /*imprimir arr */
            imprimir_arreglo_int(arrenteros);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
    /*solicitar pos0+corrimiento der */
    public static void pos_0_corrimiento_der(int []arrenteros, int pos){
        int i = MAX-1;
            while (i > 0){
                arrenteros[i] = arrenteros[i-1];
                i--;
            }
            arrenteros[0]=pos;
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
