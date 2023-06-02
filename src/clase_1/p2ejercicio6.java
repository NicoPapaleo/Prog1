package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio6 {

	public static void main(String[] args) {
		int num=2;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while(num>1 && num<100) {
			try {
				System.out.println("Ingrese un numero entre 1 y 100.");
				num = Integer.valueOf(entrada.readLine());
				if((num<=1) || (num>=100)) {
					System.out.println("El numero ingresado es invalido.");
				}
				else if((num%2==0)&&(num%3==0)) {
					System.out.println("El numero ingresado es multiplo de 2 y de 3.");
				}
				else {
					System.out.println("El numero ingresado no es multiplo de 2 y de 3.");
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}

}
