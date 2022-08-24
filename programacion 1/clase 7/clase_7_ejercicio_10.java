/* Hacer un programa que 
permita obtener a través de métodos la posición de inicio y la posición de 
fin de la secuencia ubicada a partir de una posición entera ingresada por 
el usuario. Finalmente, si existen imprima por pantalla ambas posiciones 
obtenidas.  */
import java.security.KeyStore.Entry;
import java.util.Random;
public class clase_7_ejercicio_10 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        
        int arrenteros[] = new int [MAX];
        
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        imprima_suma(arrenteros);
           
    }
        public static void imprima_suma(int[]arr){
            int inicio =0;
            int fin=0;
            int suma;
            while(inicio< MAX){
                inicio=obtener_posicion_inicio_secuencia(arr, fin+1);
                if(inicio<MAX){
                    fin=obtener_posicion_final_secuencia(arr, inicio);
                    suma=obtener_suma(arr, inicio, fin);
                    System.out.println("la suma de la secuencia entre "+inicio+" y "+fin+" es " +suma);
                }
            }
        }
        /*arr int 20 */
        
        /*obtener posicion de inicio cuya suma sea mayor */
        /*obtener sumas */

                    
    
    public static int obtener_suma(int []arr, int inicio, int fin){
        int suma = 0;
        while (inicio <= fin) {
            suma += arr[inicio];
            inicio++;            
        }
        return suma;
    }    
    /*obtener posicion de inicio (metodo)*/
    public static int obtener_posicion_inicio_secuencia (int []arr, int inicio){
            int i = inicio;
            
            while ((i < MAX)&&(arr[i]==0)) {
                i++;
            }
            
                return i;                
            

    }
    /*obtener posicion del final (metodo) */
    public static int obtener_posicion_final_secuencia(int[]arr, int fin){
        int i=fin;
        while ((i < MAX)&&(arr[i] !=0)) {
            i++;            
        }
        
            return i-1;
    
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
