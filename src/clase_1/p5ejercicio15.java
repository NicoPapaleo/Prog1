package clase_1;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class p5ejercicio15 {

	public static void main(String[] args) {
		final int  MAX=10;
		int[]arr={0,0,1,2,3,0,4,5,6,0};
		int inicio=0, fin=MAX;
		//cargarArreglo(arr,MAX);
		inicio = BuscarInicio(arr,MAX,inicio);
		fin = BuscarFin(arr,MAX,inicio);
		System.out.println(inicio+" "+fin);
	}
	
	/*public static void cargarArreglo(int[]arr, int MAX) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int pos=0;pos<MAX;pos++) {
				System.out.println("Ingrese un numero entero para la posicion "+pos);
				arr[pos] = Integer.valueOf(entrada.readLine());
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}*/
	
	public static int BuscarInicio(int[]arr,int MAX,int inicio) {
		while((inicio<MAX)&&(arr[inicio]==0)) {
			inicio++;
		}
		return inicio;
	}
	
	public static int BuscarFin(int[]arr,int MAX, int inicio) {
		int fin=inicio;
		while(arr[fin]!=0) {
			fin++;
		}
		return fin-1;
	}

}
