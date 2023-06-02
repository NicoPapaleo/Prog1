package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio9 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		char carac=0;
		while(carac!='*'){
			try {
				System.out.println("Ingrese un caracter digito o letra minuscula (ingrese '*' para terinar).");
				carac = entrada.readLine().charAt(0);
				if((carac>='0')&&(carac<='9')) {
					System.out.println("El caracter "+carac+" es un digito.");
				}
				else if((carac>='a')&&(carac<='z')) {
					switch(carac) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u': System.out.println("La letra "+carac+" es una vocal.");break;
					default : System.out.println("La letra "+carac+" es una consonante.");
					}	
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}	
	}
}
