package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio6 {

	public static void main(String[] args) {
		int[]arr = new int[10];
		final int MAX=10;
		int cantPares=0;
		cargarArreglo(arr,MAX);
		cantPares = cantidadPares(arr,MAX);
		System.out.println("La cantidad de numeros pares es: " + cantPares);
	}
	
	public static void cargarArreglo(int[]arr, int MAX) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int pos=0;pos<MAX;pos++) {
				System.out.println("Ingrese un numero entero para la posicion "+pos);
				arr[pos] = Integer.valueOf(entrada.readLine());
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static int cantidadPares(int[]arreglo, int MAX) {
		int cantidad=0;
		for(int i=0;i<MAX;i++) {
			if((arreglo[i]%2==0)&&arreglo[i]!=0) {
				cantidad++;
			}
		}
		return cantidad;
	}

}
