package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5ejercicio4 {

	public static void main(String[] args) {
		char[]arr=new char[10];
		int pos=-1;
		char caracter='0';
		final int MAX=10;
		cargarArreglo(arr,MAX);
		caracter = pedirCaracter();
		pos=buscarCaracter(arr,caracter,MAX,pos);
		if(pos==-1) {
			System.out.println("No existe ese carcter en ninguna posicion del arreglo.");
		}
	}
	
	public static int buscarCaracter(char[]arr,char caracter,int MAX,int posi) {
		for(int i=0;i<MAX;i++) {
			if(arr[i]==caracter) {
				System.out.println("El caracter se encuentra en la posicion: " + i);
				posi=i;
			}
		}
		return posi;
	}
	
	public static void cargarArreglo(char[]arr, int MAX) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int pos=0;pos<MAX;pos++) {
				System.out.println("Ingrese un numero entero para la posicion "+pos);
				arr[pos] = entrada.readLine().charAt(0);
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	public static char pedirCaracter() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		char carac='0';
		try {
			System.out.println("Ingrese un caracter a buscar en el arreglo.");
			carac = entrada.readLine().charAt(0);
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
		return carac;
	}
}
