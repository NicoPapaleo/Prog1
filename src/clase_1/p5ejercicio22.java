package clase_1;

public class p5ejercicio22 {

	public static void main(String[] args) {
		final int MAX=10, MAXSECUENCIA=2;
		int[]arr = {0,1,2,0,3,4,0,5,6,0};
		int[]ocurrencia= {1,2};
		int[]patron= {3,4};
		int inicio=0, fin=0, cantidadCarac=0;
		boolean comparador=false;
		
		while((inicio<MAX)&&(fin<MAX)) {
			inicio=buscarInicio(arr,MAX,fin+1);
			fin=buscarFin(arr,MAX,inicio);
			cantidadCarac=contarSecuencia(arr,inicio,fin);
			if(cantidadCarac==MAXSECUENCIA) {//si tienen la misma longitud, las comparo
				comparador=compararOcurrencia(arr,ocurrencia,MAXSECUENCIA,inicio);				
			}
			if(comparador) {
				reemplazarSecuencia(arr,patron,MAXSECUENCIA,inicio);
				comparador=false;
			}
		}
		mostrarArreglo(arr,MAX);
	}
	
	public static void reemplazarSecuencia(int[]arr, int[]patron, int MAXSECUENCIA, int inicio) {
		int j=inicio;
		for(int i=0;i<MAXSECUENCIA;i++) {
			arr[j]=patron[i];
			j++;
		}
	}
	
	public static boolean compararOcurrencia(int[]arr, int[]ocurrencia, int MAXSECUENCIA, int inicio) {
		boolean aux=false;
		int j=inicio;
		for(int i=0;i<MAXSECUENCIA;i++) {
			if(ocurrencia[i]==arr[j]) {
				aux=true;
			}
			else {
				return false;
			}
			j++;
		}
		return aux;
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
	
	public static void mostrarArreglo(int[]arr, int MAX) {
		for(int i=0;i<MAX;i++) {
			System.out.println(arr[i]);
		}
	}

}
