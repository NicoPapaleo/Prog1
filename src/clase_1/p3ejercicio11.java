package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3ejercicio11 {

	public static void main(String[] args) {
		//BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num=0,valmayor=Integer.MIN_VALUE;
		for(int i=1;i<=20;i++) {
			num = pedirNumero(num);
			valmayor= calcularMayor(num,valmayor);
		}
		System.out.println(valmayor);
	}

	public static int calcularMayor(int num, int valmayor) {
		if(num>valmayor) {
			valmayor=num;
		}
		return valmayor;
	}
	
	public static int pedirNumero(int num) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("Ingrese un numero entero");
				num = Integer.valueOf(entrada.readLine());
			}
			catch(Exception exc) {
				System.out.println(exc);
			}
		return num;
	}
}
