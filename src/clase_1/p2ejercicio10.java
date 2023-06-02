package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio10 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num=1,aux=0;
		while((num>0) && (num<=10)) {
			try {
				System.out.println("Ingrese un numero entre 1 y 10 inclusive. Ingrese '0' para dejar de sumar.");
				num = Integer.valueOf(entrada.readLine());
				aux = (aux+num);
			}
			catch(Exception exc) {
				System.out.println("Ingreso un valor invalido.");
			}
		}
		System.out.println("La suma total de los digitos es: "+aux);
	}
}
