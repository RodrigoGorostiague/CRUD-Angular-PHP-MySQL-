/*Hacer un programa que dado un arreglo de enteros de tamano 8 que se encuentra precargado, solicite al usuario una posicion y
realice un corrimiento a derecha o hacia la mayor posicion del arreglo. Ademas imprima el arreglo antes y despues del
corrimiento
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class calse7_ejemplo_5 {
    public static final int MAX = 8;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /*arrenteros max 8
        precargar */
        int [] arrenteros = new int [MAX];
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            /*obtener posicion */
            cargar_arreglo_aleatorio_int(arrenteros);
            /*imprimir arreglo */
            imprimir_arreglo_int(arrenteros);
            System.out.println("Ingresar una posicion: ");
            pos = Integer.valueOf(entrada.readLine());
            /*correr hacia mayor posicion (metodo) */
            correr_mmayor_posicion(arrenteros,pos);
            /*imprimir arreglo */
            imprimir_arreglo_int(arrenteros);
            
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
    /*correr hacia mayor posicion (metodo) */
    public static void correr_mmayor_posicion(int [] arrenteros, int pos){
        int indice = MAX-1;
        while (indice>pos){
            arrenteros[indice]=arrenteros[indice-1];
            indice--;
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
