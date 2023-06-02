package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {

	public static void main(String[] args) {
		int i, j;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero.");
			i = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro numero entero.");
			j = Integer.valueOf(entrada.readLine());
			System.out.println("El primer valor es " + i + " e incrementa a "+ ++i);
			System.out.println("El segundo valor es " + j + " y decrementa a "+ --j);
		}
		catch(Exception exc) {System.out.println(exc);}
	}
}
