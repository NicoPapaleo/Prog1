package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio3 {

	public static void main(String[] args) {
		int num=0;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero mayor a 50.");
			num = Integer.valueOf(entrada.readLine());
			if((num>50) && ((num%2==0) ||(num%3==0))) {
				System.out.println("El numero es " + num);
			}
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
