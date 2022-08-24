import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tp1clase_2_parte3_segmento3 {

	public static void main(String[] args) {
		char facturatipo;
		int facturanumero;
		String cliente;
		String producto1;
		String producto2;
		double importe1;
		double importe2;
		double importetotal;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println ("ingrese tipo de factura: ");
			facturatipo = entrada.readLine().charAt(0);
			System.out.println ("Ingrese el numero de factura: ");
			facturanumero = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese Nombre y Apallido del cliente: ");
			cliente = entrada.readLine();
			System.out.println ("Ingresese Producto 1: ");
			producto1 = entrada.readLine();
			System.out.println ("ingreses importe del Producto 1: ");
			importe1 = Double.valueOf(entrada.readLine());
			System.out.println ("Ingresese Producto 2: ");
			producto2 = entrada.readLine();
			System.out.println ("ingreses importe del Producto 2: ");
			importe2 = Double.valueOf(entrada.readLine());
			importetotal = importe1 + importe2;
			System.out.println("Factura \t" + facturatipo + "\tN°" + facturanumero + "\nNombre y Apellido \t"
					+ cliente + "\nProducto \t \t Importe \n" + producto1 + "\t\t\t " + importe1 + "\n" + producto2 + "\t\t\t"
					+ importe2 + "\nImporte Total: \t\t\t\t" + importetotal );
			
		}
		catch (Exception exc)
		{
		System.out.println (exc);
	}
	}
}
