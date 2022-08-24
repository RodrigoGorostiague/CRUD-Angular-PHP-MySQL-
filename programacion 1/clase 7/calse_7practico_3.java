/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
menor posición del arreglo. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class calse_7practico_3 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        /*arr max 10 */
        int [] arrenteros = new int [MAX];
        try{
            /*cargar arr */
            cargar_arreglo_aleatorio_int(arrenteros);
            /*impriir arr */
            imprimir_arreglo_int(arrenteros);
            /*obtener pos */
            System.out.println("ingrese una posicion: ");
            pos = Integer.valueOf(entrada.readLine());
            /*corriiento izq (metodo) */
            corriiento_izq(arrenteros,pos);
            /*imprimir arr */
            imprimir_arreglo_int(arrenteros);

        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
        /*corriiento izq (metodo) */
        public static void corriiento_izq(int []arrenteros, int pos){
            int i = 0;
            while (i < pos){
                arrenteros[i] = arrenteros[i+1];
                i++;
            }
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
