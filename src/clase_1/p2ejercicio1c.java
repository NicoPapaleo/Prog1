package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio1c {

	public static void main(String[] args) {
		char valor=0;
		
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero del 1 al 7 para saber el dia de la semana.");
			valor = entrada.readLine().charAt(0);
			switch(valor) {
				case '1': System.out.println("El dia es lunes ");break;
				case '2': System.out.println("El dia es martes");break;
				case '3': System.out.println("El dia es miercoles");break;
				case '4': System.out.println("El dia es jueves");break;
				case '5': System.out.println("El dia es viernes");break;
				case '6': System.out.println("El dia es sabado");break;
				case '7': System.out.println("El dia es domingo");break;
				default : System.out.println("No es un valor valido");
				}
			}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
