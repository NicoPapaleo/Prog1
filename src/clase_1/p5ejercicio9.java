package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio9 {

	public static void main(String[] args) {
		int[]arr=new int[10];
		final int MAX=10;
		int num=0;
		cargarArreglo(arr,MAX);
		num=pedirNumero(num);
		corrimientoDerecha(arr,MAX);
		agregarNumero(arr,num);
		mostrarArreglo(arr,MAX);
	}
	
	public static void mostrarArreglo(int[]arr, int MAX) {
		for(int i=0;i<MAX;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int pedirNumero(int num) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero.");
			num= Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return num;
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
	public static void corrimientoDerecha(int[]arr, int MAX) {
		for(int i=MAX-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
	}
	
	public static void agregarNumero(int[]arr, int num) {
		arr[0]=num;
	}
}

