/* Se tiene un arreglo de enteros de tamaño 20 de secuencias de números 
entre 1 y 9, separadas por 0. El arreglo esta precargado, y además 
empieza y termina con uno o más separadores 0. Hacer un programa que 
permita obtener a través de métodos la posición de inicio y la posición de 
fin de la secuencia ubicada a partir de una posición entera ingresada por 
el usuario. Finalmente, si existen imprima por pantalla ambas posiciones 
obtenidas */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.Random;
public class clase_7_ejercicio_9 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int arrenteros[] = new int [MAX];
        int pos , inicio, fin;

        /*arr int 20 */
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        try {
            /*ingresar posicion */
            System.out.println("Ingrese una posicion: ");
            pos = Integer.valueOf(entrada.readLine());
            /*obtener posicion de inicio (metodo)*/
            inicio = obtener_posicion_inicio_secuencia(arrenteros, pos);
            /*obtener posicion del final (metodo) */        
                if (inicio !=-1){
                fin = obtener_posicion_final_secuencia(arrenteros, pos);
                /*imprimir posicion final */
                if (fin != -1){
                    System.out.println("su inicio de secuencia es " + inicio + " y el final es " + fin);
                }
                inicio=fin+1;
            }
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }    
    /*obtener posicion de inicio (metodo)*/
    public static int obtener_posicion_inicio_secuencia (int []arr, int pos){
            int inicio = pos;
            while ((arr[inicio] !=0)&&(inicio < MAX)){
                inicio--;}
            while ((inicio < MAX)&&(arr[inicio]==0)) {
                inicio++;
            }
            if (inicio < MAX) {
                return inicio;                
            }
            else{
                System.out.println("no hay secuencia en esa posicion");
                return -1;
            }
    }
    /*obtener posicion del final (metodo) */
    public static int obtener_posicion_final_secuencia(int[]arr, int pos){
        int fin = pos;
        while ((fin < MAX)&&(arr[fin] !=0)) {
            fin++;            
        }
        if (fin < MAX){
            return fin-1;
        }
        else{
            return -1;
        }
    }
    public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
            for (int pos = 1; pos < MAX-1; pos++){
                if (r.nextDouble()>probabilidad_numero){
                    arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR); 
                }
                else{
                arr[pos]=0;
                }
            }
    }
    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
        System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
        }
        
}
