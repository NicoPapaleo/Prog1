package clase_1;
/*anteultima posicion */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_5_17 {
	public static void main(String []args) {
		final int MAX =10;
		int [] arrSecuencia = new int [MAX];
		cargar_arr(arrSecuencia, MAX);
		int posInicio=MAX;
		int posFinal=MAX-1;
		int veces=2;
		while (veces>0) {
		posFinal= ObtenerFinal(arrSecuencia,MAX,posInicio-1);
		posInicio=ObtenerInicio(arrSecuencia,MAX,posFinal);
		veces--;
		}
		System.out.println(posInicio + " " + posFinal);
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
	public static int ObtenerFinal(int []arrSecuencia,int MAX, int posInicio) {
		int posF=posInicio;
		while (arrSecuencia[posF] ==0) {
			posF--;
		}
		return posF;
	}
	
	public static int ObtenerInicio(int [] arrSecuencia, int MAX, int posFinal) {
		int pos=posFinal;
		while (arrSecuencia[pos] != 0) {
			pos--;
		}
		return pos+1;
	}
	
	
}
