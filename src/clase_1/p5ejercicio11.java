package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio11 {

	public static void main(String[] args) {
		final int MAX=10;
		int[]arr = new int[MAX];
		int numero = 0;
		int posicion =0;
		cargarArreglo(arr,MAX);
		numero = pedirNumero(numero);
		while(posicion!=MAX) {
			posicion = buscarPosicion(arr, MAX, numero, posicion);
			BorrarCaracter(arr,MAX,posicion);
		}
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
	
	public static int pedirNumero(int num) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero para borrar del arreglo.");
			num = Integer.valueOf(entrada.readLine());
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return num;
	}
	
	public static int buscarPosicion(int[]arr, int MAX, int numero, int posicion) {
		while((posicion<MAX)&&(arr[posicion]!=numero)) {
			posicion++;
		}
		return posicion;
	}
	
	public static void BorrarCaracter(int[]arr, int MAX, int posicion) {
		for(int i=posicion;i<MAX-1;i++) {
			arr[i]=arr[i+1];
		}
	}
	
	public static void mostrarArreglo(int[]arreglo,int MAX) {
		for(int pos =0;pos<MAX;pos++) {
			System.out.println(arreglo[pos]);
		}
	}
}
