package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3ejercicio9 {

	public static void main(String[] args) {
		int num =1;
		char caracter='0';
		while(num>=1 && num<=10) {
			num = pedirNumero(num);
			if(num>=1 && num<=10) {
				caracter = pedirCaracter(caracter);
				detectarCaracter(caracter);
			}
		}
	}
	
	public static int pedirNumero(int num) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("Ingrese un numero entre 1 y 10.");
				num = Integer.valueOf(entrada.readLine());
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		return num;
	}
	public static char pedirCaracter(char caracter) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter.");
			caracter = entrada.readLine().charAt(0);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return caracter;
	}
	public static void detectarCaracter(char caracter) {
		try {
			if((caracter>='a')&&(caracter<='z')) {
				System.out.println("Letra minuscula.");
			}
			else if((caracter>='A')&&(caracter<='Z')) {
				System.out.println("Letra mayuscula.");
			}
			else if((caracter>='0')&&(caracter<='9')) {
				System.out.println("Digito.");
			}
			else {
				System.out.println("Otro.");
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
}
