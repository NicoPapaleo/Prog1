package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio1b {

	public static void main(String[] args) {
		double valor = 100;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un valor a evaluar menor o mayor que 100.");
			valor = Double.valueOf(entrada.readLine());
			if(valor>100) {
				System.out.println("El valor ingresado es mayor que 100.");
			}
			else if (valor<100) {
				System.out.println("El valor ingresado es menor que 100.");
			}
			else {
				System.out.println("El valor ingresado es 100.");
			}
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
