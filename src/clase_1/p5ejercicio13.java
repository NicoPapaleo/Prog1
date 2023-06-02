package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Hacer un programa que inserte un elemento en un arreglo (ordenado decrecientemente) de tamaño MAX=10

public class p5ejercicio13 {
		
	public static void main(String[] args) {
		final int MAX=10;
		int[]arr = new int[MAX];
		int pos=0, valor=0;
		cargarArreglo(arr,MAX);
		valor=pedirNumero(valor);
		pos=buscarPosicion(arr,MAX,valor);
		insertarValor(arr,MAX,valor,pos);
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
	
	public static int pedirNumero(int valor) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero para insertar en el arreglo.");
			valor = Integer.valueOf(entrada.readLine());
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return valor;
	}
	
	public static int buscarPosicion(int[]arr, int MAX, int valor) {
		int i=0;
		while((i<MAX)&&(valor<arr[i])) {
			i++;
		}
		return i;
	}
	
	public static void insertarValor(int[]arr, int MAX, int valor, int pos) {
		for(int i=MAX-1;i>pos;i--) {
			arr[i]=arr[i-1];
		}
		if(pos<MAX) {
			arr[pos]=valor;
		}
		else {
			System.out.println("El valor ingresado no se puede insertar en el arreglo por ser el valor mas chico.");
		}
	}
	public static void mostrarArreglo(int[]arr,int MAX) {
		for(int pos =0;pos<MAX;pos++) {
			System.out.println(arr[pos]);
		}
	}

}
