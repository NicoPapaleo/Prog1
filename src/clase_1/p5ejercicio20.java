package clase_1;

public class p5ejercicio20 {

	public static void main(String[] args) {
		final int MAX=10, MAXSECUENCIA=2;
		int[]arr = {0,1,2,0,3,4,0,5,6,0};
		int[]secuencia= {1,2};
		int inicio=0, fin=0, contador=0;
		boolean comparador=false;
		
		while((inicio<MAX)&&(fin<MAX)) {
			inicio=buscarInicio(arr,MAX,fin+1);
			fin=buscarFin(arr,MAX,inicio);
			contador=contarSecuencia(arr,inicio,fin);
			if(contador==MAXSECUENCIA) {//si tienen la misma longitud, las comparo
				comparador=compararOcurrencia(arr,secuencia,MAXSECUENCIA,inicio);				
			}
			if(comparador) {
				eliminarSecuencia(arr,MAX,inicio,contador);
				comparador=false;
			}
		}
		mostrarArreglo(arr,MAX);
	}
	
	public static boolean compararOcurrencia(int[]arr, int[]secuencia, int MAXSECUENCIA, int inicio) {
		boolean aux=false;
		int j=inicio;
		for(int i=0;i<MAXSECUENCIA;i++) {
			if(secuencia[i]==arr[j]) {
				aux=true;
			}
			else {
				return false;
			}
			j++;
		}
		return aux;
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
	
	public static void mostrarArreglo(int[]arr, int MAX) {
		for(int i=0;i<MAX;i++) {
			System.out.println(arr[i]);
		}
	}
}
