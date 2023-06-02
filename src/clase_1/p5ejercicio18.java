package clase_1;

public class p5ejercicio18 {

	public static void main(String[] args) {
		int []arr = {0,0,0,0,0,0,0,0,0,0};
		final int MAX=10;
		int inicio=0, fin=-1, iniResul=0, finResul=0, contador=-1, contadorMayor=-1;
		
		while((inicio<MAX)&&(fin<MAX)) {
			inicio=buscarInicio(arr,MAX,fin+1);
			fin=buscarFin(arr,MAX,inicio);
			contador=contarSecuencia(arr,MAX,inicio,fin);
			if(contador>contadorMayor) {
				iniResul=inicio;
				finResul=fin;
				contadorMayor=contador;
			}
		}
		System.out.println(iniResul+" "+finResul);
	}
	
	public static int contarSecuencia(int[]arr, int MAX, int inicio, int fin) {
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
