/*Dado un numero entero con valor inicial 1, hacer una iteración que haga
incrementar numero de a uno hasta un valor MAX = 5 (constante). Mientras
itera deberá imprimir si numero es par y el valor del numero
independientemente de si es par o no
*/
public class clase5_ejemplo7 {
    public static void main(String[] args) {
         
        final int MAX = 5;
        for (int inicial = 1; inicial <= MAX; inicial++) {
            if ((inicial % 2)==0) {
                System.out.println(inicial + " es par.");                
            }
            System.out.println("El numero es: " + inicial);   
            
        }
    }
    
}
