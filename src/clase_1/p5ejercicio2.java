package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class p5ejercicio2 {

	public static void main(String[] args) {
		final int MAX=10;
		int numSobreProm=0;
		double resultado=0;
		int[]arr = new int[10];
		cargarArreglo(arr,MAX);
		resultado = calcularPromedioArreglo(arr,MAX,resultado);
		System.out.println("El resultado del promedio es: "+resultado);
		numSobreProm = sobreElPromedio(arr,resultado,MAX);
		System.out.println("La cantidad de valores sobre el promedio es: "+numSobreProm);
	}
	
	public static double calcularPromedioArreglo(int[]arr,int MAX, double resultado) {
		for(int pos=0;pos<MAX;pos++) {
			resultado = resultado + arr[pos];
		}
		resultado= resultado/MAX;
		return resultado;
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
	public static int sobreElPromedio(int[]arr, double resultado,int MAX) {
		int contador=0;
		for(int pos=0;pos<MAX;pos++) {
			if(arr[pos]>resultado) {
				contador++;
			}
		}
		return contador;
	}
	
}
