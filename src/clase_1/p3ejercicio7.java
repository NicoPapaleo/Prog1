package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3ejercicio7 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num=1;
		while (num!=0) {
			try {
				System.out.println("Ingrese un entero distinto de 0 (o 0 para terminar).");
				num = Integer.valueOf(entrada.readLine());
				if(num!=0) {
				sumatoria200();
				}
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
		
	}
	public static void sumatoria200() {
		int valor=0;
		for(int i=1;i<=200;i++) {
			valor= valor+i;
		}
		System.out.println(valor);
	}

}



