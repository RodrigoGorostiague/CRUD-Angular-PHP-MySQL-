/*Escribir un programa que llame un método que calcule el promedio de la suma de valores enteres entre 1 y 1000.
Finalmente, el resultado debe mostrarse por pantalla.
*/

public class clase6_ejemplo3 {
    public static void main(String[] args) {
        int promedio;
        promedio = calcular_promedio_1_y_1000();
        System.out.println("El promedio es " + promedio);
        
    }
    public static int calcular_promedio_1_y_1000(){
        final int MAX = 1000;
        final int MIN = 1;
        int promedio;
        int suma = 0;
            for (int numero = MIN; numero<=MAX ; numero++) {
                suma += numero;
                
            }
            promedio = suma/(MAX-MIN+1);
            return promedio;

    }
}