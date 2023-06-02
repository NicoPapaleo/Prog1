package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio4 {

	public static void main(String[] args) {
		int num=1000;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entre el 0 y el 999.");
			num = Integer.valueOf(entrada.readLine());
			if(num>0 && num<10){
				System.out.println("El numero ingresado tiene solo un digito");
			}
			else if(num>=10 && num<99){
				System.out.println("El numero ingresado tiene dos digitos,");
			}
			else if(num<1000) {
				System.out.println("El numero ingresado tiene tres digitos y es: " + num);
			}
			else {
				System.out.println("El numero ingresado no esta entre 0 y 999.");
			}			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
}
