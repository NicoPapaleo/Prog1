package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_1_ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		try { BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un valor entero: ");
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("Entero ingresado: " + numero);	
		}
		catch (Exception exc) { System.out.println(exc);
		}
	}

}
