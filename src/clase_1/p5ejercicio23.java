package clase_1;

public class p5ejercicio23 {

	public static void main(String[] args) {
		final int MAX=10;
		int[]arr = {0,0,0,0,0,0,0,0,0,0};
		int inicio=0, fin=-1, cantidadCaracteres=0;
		
		while(fin<MAX-2) { //encuentra ultima secuencia
			inicio=buscarInicio(arr,MAX,fin+1,inicio);
			fin=buscarFin(arr,MAX,inicio);
			if((inicio==0)&&(fin==-1)) { //condicion para que funcione con un arreglo cargado con ceros
				fin=MAX-1;
			}
		}
		cantidadCaracteres=contarSecuencia(arr,inicio,fin);
		invertirSecuencia(arr,inicio,fin,cantidadCaracteres);
		mostrarArreglo(arr,MAX);
	}
	
	public static void invertirSecuencia(int[]arr, int inicio, int fin, int cantidadCaracteres) {
		int j=fin,aux=0;
		int mitadSec=(inicio+(cantidadCaracteres/2));
		for(int i=inicio;i<mitadSec;i++) {
			aux=arr[i];
			arr[i]=arr[j];
			arr[j]=aux;
			j--;
		}
	}
	
	public static int contarSecuencia(int[]arr, int inicio, int fin) {
		int contador=0;
		for(int i=inicio;i<=fin;i++) {
			contador++;
		}
		return contador;
	}
	
	public static int buscarInicio(int[]arr,int MAX,int inicio,int ultimoInicio) {
		int ini=ultimoInicio;
		while((inicio<MAX-1)&&(arr[inicio]==0)) {
			inicio++;
		}
		if(arr[inicio]==0) {
			return ini;
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
