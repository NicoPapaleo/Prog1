package clase_1;

public class p5ejercicio21 {

	public static void main(String[] args) {
		int []arr = {0,3,2,3,0,4,0,8,6,0};
		final int MAX=10;
		int inicio=0, fin=-1, contador=0;
		boolean ordenSec= false;
		
		while((inicio<MAX)&&(fin<MAX)) {
			inicio=buscarInicio(arr,MAX,fin+1);
			fin=buscarFin(arr,MAX,inicio);
			contador=contarSecuencia(arr,inicio,fin);
			ordenSec=verOrdenSec(arr,MAX,inicio,fin);
			if(ordenSec) {
				eliminarSecuencia(arr,MAX,inicio,contador);
			}
		}
		mostrarArreglo(arr,MAX);
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
	public static boolean verOrdenSec(int[]arr, int MAX, int inicio, int fin) {
		boolean aux=false;
		for(int i=inicio;i<fin;i++) {
			if(arr[i]>arr[i+1]) {
				aux=true;
			}
			else {
				return false;
			}
		}
		return aux;
	}
	
	public static void mostrarArreglo(int[]arr, int MAX) {
		for(int i=0;i<MAX;i++) {
			System.out.println(arr[i]);
		}
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
	

}
