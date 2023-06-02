package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio1e {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el primer numero:");
			num1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo numero:");
			num2 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el tercer numero:");
			num3 = Integer.valueOf(entrada.readLine());
			if (num1<num2 && num2<num3) {
				System.out.println("El orden de los numeros es creciente.");
			}
			else if(num1>num2 && num2>num3) {
				System.out.println("El orden de los numeros es decreciente.");
			}
			else {
				System.out.println("Error, los numeros no tienen orden.");
			}		
		}
		catch (Exception exc) {
			System.out.println("Ocurrio un error"+exc);
		}

	}
}
