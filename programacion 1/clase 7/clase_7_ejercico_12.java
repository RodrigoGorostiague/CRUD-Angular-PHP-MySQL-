/* Hacer un programa que dado el arreglo definido y precargado, y un número entero 
ingresado por el usuario, elimine las secuencias de tamaño igual al número ingresado. */

import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_ejercico_12 {
    public static final int MAX = 40;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;
    
    public static void main(String[] args) {
        int numero;

        int [] arrenteros = new int [MAX];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        /*eliminar*/
        try {
            System.out.println("ingresar un numero entero:");
            numero= Integer.valueOf(entrada.readLine());
            eliminar_secuencias_del_mismo_tamaño(arrenteros,numero);
            /*eliminar secuncias del mismo tamaño que numero(arr) */
            /*inicio 0 y fin -1*/
                /*mientras avanza en secuencia */
                    /* inicio=obtener inicio secuencia (arr,fin+1)*/
                    /*si inicio < MAX */
                    /*fin=obtener fin de secuencia (arr,inicio)*/
                    /*obtener tamaño (arr,inicio,fin)*/
                    /*si tamaño es == numero */
                    /*eliminarn secuencia de ese tamaño(arr,inicio,fin) */
                    imprimir_arreglo_secuencias_int(arrenteros);
                   
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
        
    }
    /*eliminar secuncias del mismo tamaño que numero(arr) */
    public static void eliminar_secuencias_del_mismo_tamaño(int[]arr,int numero){
            /*inicio 0 y fin -1*/
            int inicio = 0;
            int fin = 0;
            int tamaño;
            int i = numero;
                /*mientras avanza en secuencia */
                while(inicio<MAX){
                    /* inicio=obtener inicio secuencia (arr,fin+1)*/
                    inicio=obtener_inicio(arr, fin+1);
                    /*si inicio < MAX */
                    if(inicio<MAX){
                        /*fin=obtener fin de secuencia (arr,inicio)*/
                        fin=obtener_fin(arr, inicio);
                        /*obtener tamaño (arr,inicio,fin)*/
                        tamaño=tamaño_de_secuencia(arr, inicio, fin);
                        System.out.println(tamaño);
                      if(tamaño==i){
                          for(int j=inicio;j<fin;j++){
                              arr[inicio]=0;
                          }
                      }
                    }
                }
                
                    /*si tamaño es == numero */
                    /*eliminarn secuencia de ese tamaño(arr,inicio,fin) */
    }
    
    /*eliminar secuncias del mismo tamaño que numero */
        /*tamaño de secuencias */
        /*si tamaño es == numero eliminar secuencia */
        public static void elimina_secuencia(int[]arr,int inicio,int fin){
            for (int i = inicio; i <=fin; i++) {
                arr[i]=0;
                
            }
        }
        public static int tamaño_de_secuencia(int[]arr,int inicio,int fin){
            int tamaño =0;
            while(inicio<=fin){
                tamaño++;
                inicio++;
            }
            return tamaño;
        }
        public static int obtener_inicio(int[]arr,int pos){
            int i = pos;
            while (arr[i]==0) {
                i++;
                
            }
            return i;
        }
        public static int obtener_fin(int[]arr,int pos){
            int i = pos;
            while (arr[i]!=0) {
                i++;
                
            }
            return i-1;
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
