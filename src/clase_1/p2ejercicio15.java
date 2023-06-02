package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class p2ejercicio15 {

	public static void main(String[] args) {
		int num=1, max=-10000, min=10000 ;
		double prom=0, contador=-1;
		while(num!=0) {
			try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese numeros enteros o '0' para terminar.");
			num = Integer.valueOf(entrada.readLine());
			if((num<min)&&(num!=0)) {
				min=num;
			}
			if((num>max)&&(num!=0)) {
				max=num;
			}
			if(num!=0) {
				prom = prom+num;
			}
			contador = contador+1;
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
		System.out.println("El mayor valor ingresado es: "+max);
		System.out.println("El menor valor ingresado es: "+min);
		System.out.println("El promedio de los valores es: "+(prom/contador));
	}

}
