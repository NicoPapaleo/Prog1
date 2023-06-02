package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*posicion de inicio y fin de la primera secuencia */
public class joacoP5_15 {
	public static void main(String []args) {
		final int MAX = 10;
		int [] arrSecuencia = new int [MAX];
		cargar_arr(arrSecuencia, MAX);
		int posInicio=0;
		int posFinal=0;
		posInicio=ObtenerInicio(arrSecuencia,MAX);
		posFinal= ObtenerFinal(arrSecuencia,MAX,posInicio);
		System.out.println(posInicio + " "+ posFinal);
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
	
	
}
