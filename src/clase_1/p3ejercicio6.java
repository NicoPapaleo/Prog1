package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class p3ejercicio6 {

	public static void main(String[] args) {
		char letra='a';
		while((letra>='a')&&(letra<='z')) {
			try {
				letra = pedirCaracter(letra);
				if ((letra>='a')&&(letra<='z')) {
					tablaDel9();
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}
	public static void tablaDel9() {
		final int MAX=10;
		for(int i=0;i<=MAX;i++) {
			System.out.println("9 * " +i+ " = " + 9*i);
		}
	}
	public static char pedirCaracter(char letra) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
				System.out.println("Ingrese una letra minuscula.");
				letra = entrada.readLine().charAt(0);
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
			return letra;
	}
}
