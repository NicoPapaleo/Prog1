package clase_1;

public class p5ejercicio17 {

	public static void main(String[] args) { 
		
		/*Intentar hacendo 3 funciones, una para buscarUltimaSecuencia, otra para 
		 encontrarFinSecuenciaAnterior(recorriendo hacia atras) a partir del ultimo inicio y la ultima que 
		 buscarInicioAnterior a partir de la posicion obtenida en la funcion encontrarFinSecuenciaAnterior */
		
		final int MAX=10;
		int[]arr = {0,1,2,0,3,4,0,5,6,0};
		int inicioUlt=0, finUlt=-1, iniAnt=0, finAnt=0;
		
		while(finUlt<MAX-2) { //encuentra ultima secuencia
			inicioUlt=buscarInicio(arr,MAX,finUlt+1,inicioUlt);
			finUlt=buscarFin(arr,MAX,inicioUlt);
		}
		finAnt=encontrarFinSecuenciaAnterior(arr,MAX,inicioUlt);
		iniAnt=buscarInicioSecuenciaAnterior(arr,MAX,finAnt);

		
		System.out.println(iniAnt +" "+finAnt);
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
	
	public static int encontrarFinSecuenciaAnterior(int[]arr,int MAX, int inicioUlt) {
		int pos=inicioUlt;
		while((arr[pos]>0)&&(arr[pos]!=0)) {
			pos--;
		}
		return pos-1;
	}
	
	
	public static int buscarInicioSecuenciaAnterior(int[]arr,int MAX, int finAnt) {
		int pos=finAnt;
		while((arr[pos]>0)&&(arr[pos]!=0)) {
			pos--;
		}
		return pos+1;
	}

}