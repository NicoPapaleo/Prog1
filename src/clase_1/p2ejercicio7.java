package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio7 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		char carac=0;
		while(carac!='*') {
			try {
				System.out.println("Ingrese un caracter distinto de '*' (o este mismo para salir).");
				carac = entrada.readLine().charAt(0);
							//(Character.isDigit(caracter))Pregunta especificamente si el caracter es un digito
					if((carac>='0')&&(carac<='9')) {
					System.out.println("El caracter "+carac+" es un digito.");
				}
				else {
					switch(carac){
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u': System.out.println("El caracter "+carac+" una vocal minuscula.");break;
					default: System.out.println("El caracter "+carac+" no es digito ni vocal minuscula.");
					}
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}
}
