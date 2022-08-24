/*Escribir un programa que imprima por pantalla la tabla de valores de
verdad para el or y and por separado.*/

public class clase3_prectico2 {
    public static void main(String[]args) {
        System.out.println("La tabla de verdad para OR es la siguiente:");
        System.out.println("False OR False es: " + (false || false));
        System.out.println("False OR True es: " + (false || true));
        System.out.println("True OR False es: " + (true || false));
        System.out.println("True OR True es: " + (true || true));

        System.out.println("La tabla de verdad para AND es la siguiente:");
        System.out.println("False AND False es: " + (false && false));
        System.out.println("False AND True es: " + (false && true));
        System.out.println("True AND False es: " + (true && false));
        System.out.println("True AND True es: " + (true && true));
    }
    
}
