package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_1_ejercicio7 {

	public static void main(String[] args) {
		double primero, segundo, tercero, aux, resultado;
		try { BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese tres numeros reales");
			primero = Double.valueOf(entrada.readLine());
			segundo = Double.valueOf(entrada.readLine());
			tercero = Double.valueOf(entrada.readLine());
			aux = primero/segundo;
			resultado = aux-tercero;
			System.out.println("El resultado es: " + resultado);
		}
		catch (Exception exc) {System.out.println(exc);}
	}

}
