package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p4ejercicio4 {

	public static void main(String[] args) {
		int numero=0, resul=0, a=1,b=2,c=3;
		boolean primo;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese numero");
			numero = Integer.valueOf(entrada.readLine());
			resul= contarDigitos(numero);
			
		/*	primo= esPrimo(numero);
			if(primo == true) {
				System.out.println("Es primo");
			}
			else {
				System.out.println("No es primo");
			}
		*/
			System.out.println("El resultado es "+resul);
		
			//stem.out.println("El numero es "+numero);
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static int obtenerProductoria(int numero) {
		int resultado=numero;
		resultado=numero;
		while(numero>1){
			resultado*=--numero;
			}
		return resultado;
	}
	
	public static int obtenerSumatoria(int numero) {
		int resultado=1;
		while(numero>0) {
			resultado+=numero--;
		}
		return resultado;
	}
	
	public static boolean esPrimo(int numero) {
		int divisor=2;
		if(numero<divisor) {
			return false;
		}
		while(divisor<numero) {
			if(numero%divisor++==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int contarDigitos(int numero){
		int contador=0;
		while(numero!=0){
			numero/=10;
			contador++;
		}
		return contador;
	}
	
	public static int buscarMayor(int a, int b, int c) {
		int mayor=a;
		if(b>mayor) {
			mayor=b;
		}
		if(c>mayor) {
			mayor=c;
		}
		return mayor;
	}
}






