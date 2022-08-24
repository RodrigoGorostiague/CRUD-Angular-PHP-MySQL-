import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1clase_2_parte3_segmento1 {

	public static void main(String[] args)
	{
		/*circulo*/
		
		final double pi = 3.14;
		double perimetro;
		double radio ;
		double diametro;
		
		/*triangulo*/

		


		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			System.out.println ("Ingrese el el valor del RADIO del circulo que decea dinujar :");
			radio = Double.valueOf(entrada.readLine());
			diametro = radio * 2;
			perimetro = diametro * pi;
			System.out.println("Los datos necesarios para dibujar su circulo son:\n" + "Perimetro: " + perimetro + "cm.");
			System.out.println("Radio= " + radio + "cm. /n");
			System.out.println("Diametro= " + diametro + "cm.");
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}

}
