package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio1d {

	public static void main(String[] args) {
		char letra = 0;
		
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter para saber si es vocal o no.");
			letra = entrada.readLine().charAt(0);
			switch(letra) {
			case 'a': case 'e': case 'i': case 'o': case 'u': System.out.println("Es una vocal."); break;
			default : System.out.println("Es una consonante.");
			}
		}
		catch (Exception exc) {
			System.out.println("Ocurrion un error." + exc);
		}
		
	}
}
