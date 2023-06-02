package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio11 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		char letra =0;
		int contador =0;
		while (letra!='*') {
			try {
				System.out.println("Ingrese una letra minuscula o '*' para terminar.");
				letra = entrada.readLine().charAt(0);
				if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u')) {
					contador = contador+1;
				}
			}
			catch(Exception exc) {
				System.out.println("Caracter invalido.");
			}
		}
		System.out.println("La cantidad de vocales es: "+contador);
	}
}
