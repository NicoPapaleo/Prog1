package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio7 {

	public static void main(String[] args) {
		int[]arr = new int[10];
		final int MAX=10;
		
		cargarArreglo(arr,MAX);
		corrimientoDerecha(arr,MAX);
		mostrarArreglo(arr,MAX);
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
	
	public static void corrimientoDerecha(int[]arreglo, int MAX) {
		int ultVal=0;
		ultVal= arreglo[MAX-1];
		for(int i=MAX-1;i>0;i--) {
			arreglo[i]=arreglo[i-1];
		}
		arreglo[0]=ultVal;
	}
	
	public static void mostrarArreglo(int[]arreglo,int MAX) {
		for(int pos =0;pos<MAX;pos++) {
			System.out.println(arreglo[pos]);
		}
	}
}
