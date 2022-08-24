
import java.util.Random;
public class clase_7_ejercicio_17 {
    public static final int MAX = 40;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
   
    public static void main(String[] args) {
        char []arrA=new char[MAX];
        char []arrB=new char[MAX];
        cargar_arreglo_aleatorio_secuencias_char(arrA);
        cargar_arreglo_aleatorio_secuencias_char(arrB);
        imprimir_arreglo_secuencias_char(arrA);
        imprimir_arreglo_secuencias_char(arrB);
        intercabiar_en_A_sec_de_B(arrA, arrB);
        imprimir_arreglo_secuencias_char(arrA);
        /*metodo a indice de secuencia que mas caracteres se repiten */
        /*metodo b indice inicial de la secuencia que tiene mas caracteres repetido*/
        /*reemplazar en arrA la secuencia que mas se repite por la secuencia con mas caracteres repetidos en arrB */

    }
    public static void intercabiar_en_A_sec_de_B(char[]arrA,char[]arrB){
        int inicialA=0;
        int inicialB=0;
        int finA=0;
        int finB=0;
        while((inicialA<MAX)||(inicialB<MAX)){
            inicialA=obtener_inici_de_secuencia_que_mas_se_repite(arrA,finA+1);
            inicialB=obtener_inicio_secuencia_con_mas_caracteres(arrB, finB+1);
            if((inicialA<MAX)&&(inicialB<MAX)){
                finA=obtener_fin_de_secuencia_que_mas_se_repite(arrA, inicialA);
                finB=obtener_fin_secuencia_con_mas_caracteres(arrB, inicialB);
            }
            int tamañoA = finA-inicialA+1;
            int tamañoB = finB-inicialB+1;
            if(tamañoA<tamañoB){
                for(int j =0;j<(tamañoA-tamañoB);j++){
                    corrimiento_derecha(arrA,inicialA);
                }
            }
            copiar_secuencia_B_en_A(arrA,arrB,inicialA,inicialB,finA,finB)
        }


    }
    public static void copiar_secuencia_B_en_A(char[]arrA,char[]arrB,int inicialA,int inicialB, int finA, int finB){
        while(inicialB<=finB){
            arrA[inicialA]=arrB[inicialB];
            inicialA++;
            inicialB++;
        }
    }
    public static void corrimiento_derecha(char[]arrA,int inicialA){
        for(int i=MAX-1; i<inicialA;i--){
            arrA[i]=arrA[i-1];
        }
    }
    public static void corrimiento_izquierda(char[]arrA, int inicialA){
        for(int i=inicialA; i<MAX;i++){
            arrA[i]=arrA[i+1];
        }
    }
    public static int obtener_fin_secuencia_con_mas_caracteres(char[]arrB,int inicialB){
        int i = inicialB;
        while(inicialB!=' '){
            inicialB++;
        }
        return i-1;
    }
    public static int obtener_fin_de_secuencia_que_mas_se_repite(char[]arrA, int inicialA){
        i = inicialA;
        while(inicialA!=' '){
            inicialA++;
        }
        return i-1;
    }
    public static void cargar_arreglo_aleatorio_secuencias_char(char
[] arr){
Random r = new Random();
arr[0] = ' ';
arr[MAX-1] = ' ';
for (int pos = 1; pos < MAX-1; pos++){
if (r.nextDouble()>probabilidad_letra){
arr[pos]=(char)(r.nextInt(26) + 'a');
}
else{
arr[pos]=' ';
}
}
}
public static void imprimir_arreglo_secuencias_char(char [] arr){
System.out.print("Arreglo de secuencias char\n|");
for (int pos = 0; pos < MAX; pos++){
System.out.print(arr[pos]+"|");
}
System.out.print("\n");
}
}
