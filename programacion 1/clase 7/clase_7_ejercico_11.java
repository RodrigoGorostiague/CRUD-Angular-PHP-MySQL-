/*Hacer un programa que dado el arreglo definido y precargado permita encontrar la 
posición de inicio de la anteúltima secuencia (considerar comenzar a buscarla a 
partir de la ultima posición del arreglo).*/

import java.util.Random;
public class clase_7_ejercico_11 {
    public static final int MAX = 40;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

public static void main(String[] args) {
    int [] arrenteros = new int[MAX];
    
    cargar_arreglo_aleatorio_secuencias_int(arrenteros);
    imprimir_arreglo_secuencias_int(arrenteros);
    obtener_posicion_de_inicio_penultima_sec(arrenteros);
}


    
        public static void obtener_posicion_de_inicio_penultima_sec(int[]arr){
            int fin = obtener_posicion_de_inicio_ultima_sec(arr);
            int inicio = fin;
            fin--;

            while(arr[fin]==0){
                fin--;
                
            }
            while(arr[fin]!=0){
                fin--;
                inicio=fin+1;
            }
            System.out.println("sera "+inicio );
        }
        public static int obtener_posicion_de_inicio_ultima_sec(int[]arr){
        /*obtener inicio ultim secuencia*/
        int inicio = 0;
        int fin = MAX-1;
        while ((fin >0)&&(arr[fin]==0)){
            
            fin--;
            inicio = obtener_inicio(arr,fin);
            
        }
        return inicio;
            }
            public static int obtener_inicio(int []arr, int fin){
                int inicio = fin;
                while (arr[inicio]!=0) {
                    inicio--;
                    
                }
                return inicio+1;
            }
public static void cargar_arreglo_aleatorio_secuencias_int(int [] 
arr){
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
