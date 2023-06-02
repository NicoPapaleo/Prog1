package clase_1;

//import java.io.BufferedReader;
// import java.io.InputStreamReader;

public class p5ejercicio16 {

	public static void main(String[] args) {
		final int MAX=20;
		int[]arr = {0,1,2,3,0,4,5,6,0,0,0,6,7,8,0,4,5,6,0,0};
		int inicio=0, fin=-1,suma=0, iniresul=0, finresul=0;
		//cargarArreglo(a rr,MAX);
		
		while((inicio<MAX)&&(fin<MAX)) {
			inicio=buscarInicio(arr,MAX,fin+1);
			fin=buscarFin(arr,MAX,inicio);
			if(sumarSecuencia(arr,MAX,inicio,fin)>suma) {
				suma=sumarSecuencia(arr,MAX,inicio,fin);
				iniresul=inicio;
				finresul=fin;
			}
		}
		System.out.println(iniresul +" "+finresul);
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
	
	public static int sumarSecuencia(int[]arr, int MAX, int inicio, int fin) {
		int resultado=0;
		for(int i=inicio;i<=fin;i++) {
			resultado+=arr[i];
		}
		return resultado;
	}
}

	/*
	public static void mostrarArreglo(int[]arr,int MAX) {
		for(int pos =0;pos<MAX;pos++) {
			System.out.println(arr[pos]);
		}
	}
	
	 public static void cargarArreglo(int[]arr, int MAX) {
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
	

