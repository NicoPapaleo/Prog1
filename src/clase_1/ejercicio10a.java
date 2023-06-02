package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10a {

	public static void main(String[] args) {
		int a, b;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese un numero entero.");
		a = Integer.valueOf(entrada.readLine());
		System.out.println("Ingrese otro numero entero.");
		b = Integer.valueOf(entrada.readLine());
		if(a>b) {
			System.out.println(a + " es mayor que " + b);
		}
			else {
				System.out.println(a+" no es mayor que "+b);
		}
		if ((a%2)==0){
			System.out.println(a +" es multiplo de 2");
		}
		if ((b%2)==0){
			System.out.println(a +" es multiplo de 2");
		}
			
		}
		catch (Exception exc) {System.out.println(exc);}
	}

}
