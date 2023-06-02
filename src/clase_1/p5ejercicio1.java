package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio1 {

	public static void main(String[] args) {
		int[]arr = new int [15];
		cargarArreglo(arr);
		mostrarArreglo(arr);
	}
	
	public static void cargarArreglo(int[]arr) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		final int MAX=15;
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
	public static void mostrarArreglo(int[]arr) {
		for(int pos =0;pos<15;pos++) {
			System.out.println(arr[pos]);
		}
	}
}
