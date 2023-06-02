package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio5 {

	public static void main(String[] args) {
		char[]arr = new char[10];
		char[]inverArr = new char[10];
		final int MAX=10;
		cargarArreglo(arr,MAX);
		invertirArreglo(arr,inverArr,MAX);
		mostrarArreglo(inverArr,MAX);
}
	
	public static void cargarArreglo(char[]arr,int MAX) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int pos=0;pos<MAX;pos++) {
				System.out.println("Ingrese un numero entero para la posicion "+pos);
				arr[pos] = entrada.readLine().charAt(0);
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void invertirArreglo(char[]arreglo, char[]inverArr, int MAX) {
		int j =MAX-1;
		for(int i=0;i<MAX;i++) {
			if(j>=0) {
				inverArr[i]=arreglo[j];
				j--;
			}
		}
	}
	
	public static void mostrarArreglo(char[]arreglo,int MAX) {
		for(int pos =0;pos<MAX;pos++) {
			System.out.println(arreglo[pos]);
		}
	}

}
