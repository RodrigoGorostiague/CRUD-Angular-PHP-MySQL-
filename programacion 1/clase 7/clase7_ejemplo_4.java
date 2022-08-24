/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posicion de un numero entero
ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class clase7_ejemplo_4 {
    public static final int max = 10;
    public static final int maxvalor = 10;
    public static final int minvalor = 1;
    public static void main(String[] args) {
        int [] arrenteros = new int [max];
        int pos, numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            /*cargar arreglo arrenteros */
            cargar_arreglo_aleatorio_int(arrenteros);
            /*imprimir arrenteros */
            imprimir_arreglo_int(arrenteros);
            /*cargar numero por teclado */
            System.out.println("Ingrese un numero entero: ");
            numero = Integer.valueOf(entrada.readLine());
            /*obtener_pos_de_arreglo (numero, arrentero) (metodo)*/
            pos = obtener_pos_de_arreglo(arrenteros, numero);
            /*si existe pos*/
            if (pos < max){
                /*imprimir pos*/
                System.out.println(numero+" esta en " +pos);

            }
            else{
                /*sino imprimir no existe */
                System.out.println("No existe " + numero);
            }
            
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static int obtener_pos_de_arreglo (int [] arr,int numero){
        int posicion = 0;
        while ((posicion<max)&&(arr[posicion]!=numero)){
            posicion++;

            
        }
        return posicion;
    }
    /*obtener posicion de (numero, arrentero) (metodo)*/
    /*posicion = 0
    mientras posicion < mmaximo y arrenteros[pos]*/
    public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < max; pos++){
        arr[pos]=(r.nextInt(maxvalor-minvalor+1) + minvalor);
        }
        }
        public static void imprimir_arreglo_int(int [] arr){
            for (int pos = 0; pos < max; pos++){
            System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
            }
            }
}

