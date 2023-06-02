package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_1_ejercicio6 {

	public static void main(String[] args) {
		int numeroFact;
		char tipoFact;
		String nombreCli, produc1, produc2;
		double import1, import2, importFinal;
		try { BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese tipo de factura.");
		tipoFact = entrada.readLine().charAt(0);
		System.out.println("Ingrese numero de factura.");
		numeroFact = Integer.valueOf(entrada.readLine());
		System.out.println("Ingrese nombre del cliente.");
		nombreCli = entrada.readLine();
		System.out.println("Ingrese el primer producto");
		produc1 = entrada.readLine();
		System.out.println("Ingrese el importe del primer producto.");
		import1 = Double.valueOf(entrada.readLine());
		System.out.println("Ingrese el segundo producto");
		produc2 = entrada.readLine();
		System.out.println("Ingrese importe del segundo producto.");
		import2 = Double.valueOf(entrada.readLine());
		importFinal = import1+import2;
		
		System.out.println("Factura " + tipoFact + "\t\tNº " + numeroFact + "\nNombre: " + nombreCli + "\nProducto \t\t Importe\n" + produc1 + "\t\t\t" + import1 + "\n" + produc2 + "\t\t\t" + import2 + "\nImporte total \t\t" + importFinal);
			
		}
		catch (Exception exc) {System.out.println(exc);
		}
	}

}
