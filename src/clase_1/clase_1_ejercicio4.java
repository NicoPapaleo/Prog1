package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_1_ejercicio4 {

	public static void main(String[] args) {
		int primero, segundo, tercero, cuarto, quinto;
		try { BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el primer valor entero");
			primero = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo valor entero");
			segundo = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el tercero valor entero");
			tercero = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el cuarto valor entero");
			cuarto = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el quinto valor entero");
			quinto = Integer.valueOf(entrada.readLine());
			
			System.out.println("Los numeros ingresados son: " + primero+segundo+tercero+cuarto+quinto);
		}
		
		catch (Exception exc) { 
			System.out.println(exc);
		}

	}

}
