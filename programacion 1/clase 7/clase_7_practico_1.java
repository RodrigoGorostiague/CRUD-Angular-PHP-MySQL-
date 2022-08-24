/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que está en 0 se intercambia
con el que está en 9, el que está en 1 con el que está en 8...). Este intercambio no se debe
realizar de manera explícita, hay que hacer un método que incluya una iteración de
intercambio. */
import java.util.Random;
public class clase_7_practico_1 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /*arrenteros max 10 */
        int [] arrenteros = new int [MAX];
        int [] arrinverso = new int [MAX];
        /*carga aleatoria */
        cargar_arreglo_aleatorio_int(arrenteros);
        
        /*imprimir arreglo */
        imprimir_arreglo_int(arrenteros);
        /*invertir orden de pos(arrenteros,pos) */
        invertir_orden_de_pos(arrenteros,arrinverso);
        /*imprimir arreglo */
        imprimir_arreglo_int(arrinverso);
        
    }
    /*invertir orden de pos(arrenteros,pos) */
    public static void invertir_orden_de_pos(int []arrenteros,int [] arrinverso){
            int j = 0;
            for (int i = MAX-1; i >=0;i--) {
                arrinverso[j]=arrenteros[i];
               j++;
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
