package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11 {

	public static void main(String[] args) {
		int entero;
		boolean resto6, resto7, resto2, resultado;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			//item a
			System.out.println("Ingrese un numero entero.");
			entero = Integer.valueOf(entrada.readLine());
			resto6 =((entero%6)==0);
			resto7 = ((entero%7)==0);
			resultado = resto6 && resto7;
			System.out.println("El numero tipeado es divisible por 6 y 7 si el resultado es true y no es divisible por 6 y 7 si es false");
			System.out.println("Resto de "+entero+" dividido 6 es "+resto6);
			System.out.println("Resto de "+entero+" dividido 7 es "+resto7);
			System.out.println("El resultado de la divisibilidad por 6 y 7 es "+resultado);
			//item b
			if (resto2 = ((entero%2)==0) && entero>30) {
				System.out.println("El numero ingresado es mayor a 30 y multiplo de 2.");
			}
			else if (entero<=30) {
				System.out.println("El numero ingresado es menor o igual a 30");
			}
			//item c
			if ((entero/5)>10) {
				System.out.println("El cociente del numero tipeado es mayor a 10.");
			}
		}
		
		catch (Exception exc) {System.out.println(exc);}

	}

}
