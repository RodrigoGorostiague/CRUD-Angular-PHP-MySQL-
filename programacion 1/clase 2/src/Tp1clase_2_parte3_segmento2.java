import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tp1clase_2_parte3_segmento2 {

	public static void main(String[] args)
	{
		String nombre;
		String apellido;
		String ocupacion;
		String calle;
		int edad;
		double altura;

		try{
			//pedir datos
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println ( "Ingrese su Nombre: ");
			nombre = entrada.readLine();

			System.out.println ( "Ingrese su Apellido: ");
			apellido = entrada.readLine();

			System.out.println ( "Ingrese su Ocupacion: ");
			ocupacion = entrada.readLine();

			System.out.println ( "Ingrese su direccion: ");
			calle = entrada.readLine();

			System.out.println ( "Ingrese su Edad: ");
			edad = Integer.valueOf(entrada.readLine());

			System.out.println ( "Ingrese su Altura: ");
			altura = Double.valueOf(entrada.readLine());
			//mostrar en pantall
			System.out.println ("Nobre: " + nombre );
			System.out.println ("Apellido: " + apellido);
			System.out.println ("Edad: " + edad);
			System.out.println ("Altura: "+ altura );
			System.out.println ("Domicilio: " + calle);
			System.out.println ("Ocupacion: " + ocupacion);
			System.out.println ("quedo bien");
			

		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
