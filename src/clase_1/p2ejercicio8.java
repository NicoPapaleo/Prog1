package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio8 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num=1,num2=0;
		while(num!=0) {
			try {
			System.out.println("Ingrese un numero entero distinto de 0.");
			num = Integer.valueOf(entrada.readLine());
			if(num!=0) {
				System.out.println("Ingrese otro numero.");
				num2 = Integer.valueOf(entrada.readLine());
				System.out.println("El numero ingresado es: "+num2);
			}
			else{ 
				System.out.println("Salio del programa.");
			}
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
		
	}
}
