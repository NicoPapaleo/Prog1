package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio19 {

	public static void main(String[] args) {
		int []arr = {0,1,2,0,3,4,5,0,6,0};
		final int MAX=10;
		int inicio=0, fin=-1, contador=0, numero=0;
		
		numero=pedirNumero(numero);
		while((inicio<MAX)&&(fin<MAX)) {
			inicio=buscarInicio(arr,MAX,fin+1);
			fin=buscarFin(arr,MAX,inicio);
			contador=contarSecuencia(arr,inicio,fin);
			if(numero==contador) {
				eliminarSecuencia(arr,MAX,inicio,numero);
			}
		}
		mostrarArreglo(arr,MAX);
	}
	
	public static void mostrarArreglo(int[]arr, int MAX) {
		for(int i=0;i<MAX;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int pedirNumero(int numero) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Ingrese el largo de secuencia que desea borrar: ");
		numero = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return numero;
	}
		
	public static void eliminarSecuencia(int[]arr, int MAX, int inicio, int num) {
		while(num>0) {
			for(int i=inicio;i<MAX-1;i++) {
			arr[i]=arr[i+1];	
			}
			num--;
		}
	}
	
	public static int contarSecuencia(int[]arr, int inicio, int fin) {
		int contador=0;
		for(int i=inicio;i<=fin;i++) {
			contador++;
		}
		return contador;
	}
	
	public static int buscarInicio(int[]arr,int MAX,int inicio) {
		while((inicio<MAX)&&(arr[inicio]==0)) {
			inicio++;
		}
		return inicio;
	}
	
	public static int buscarFin(int[]arr,int MAX, int inicio) {
		int fin=inicio;
		while((fin<MAX)&&(arr[fin]!=0)) {
			fin++;
		}
		return fin-1;
	}

}
