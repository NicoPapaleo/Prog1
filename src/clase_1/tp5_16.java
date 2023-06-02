package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp5_16 {

	public static void main(String[] args) {
		final int MAX = 10;
		int [] arrSecuencia = new int [MAX];
		cargar_arr(arrSecuencia, MAX);
		int posInicio=0;
		int posFinal=0;
		posInicio=ObtenerInicio(arrSecuencia,MAX);
		posFinal= ObtenerFinal(arrSecuencia,MAX,posInicio);
		int suma=0;
		suma = sumar_contenido(posInicio,posFinal,arrSecuencia);
	}
	public static void cargar_arr(int [] arrSecuencia, int MAX) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
		for (int pos=0; pos <MAX; pos++) {
			System.out.println("Ingrese numero para la pos: "+ pos);
			arrSecuencia[pos] = Integer.valueOf(entrada.readLine());
		}
		}
		catch(Exception e) {
			
		}
	}
	
	public static int ObtenerInicio(int [] arrSecuencia, int MAX) {
		int pos=0;
		while (arrSecuencia[pos] == 0) {
			pos++;
		}
		return pos;
	}
	
	public static int ObtenerFinal(int []arrSecuencia,int MAX, int posInicio) {
		int posF=posInicio;
		while (arrSecuencia[posF] !=0) {
			posF++;
		}
		return posF-1;
	}
	
	public static int sumar_contenido(int posInicio, int posFinal, int []arrSecuencia) {
		int suma=0;
		for (int pos=posInicio; pos<=posFinal; pos++) {//menor igual 
			suma=(suma+arrSecuencia [pos]);
		}
		return suma;
	}
	

	}


