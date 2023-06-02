package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class p2ejercicio14 {

	public static void main(String[] args) {
		int num=0, par=0;
		final int MAX=10;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<=MAX;i++) {
			System.out.println("Ingerese un numero entero.");
			num = Integer.valueOf(entrada.readLine());
			if (num%2==0) {
				par=par+1;
			}
		}
		System.out.println("Se ingresaron "+par+" numeros pares.");	
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}
}
