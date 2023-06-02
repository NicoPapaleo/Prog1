package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio5 {

	public static void main(String[] args) {
		int hora=25;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la hora.");
		hora = Integer.valueOf(entrada.readLine());
		//5a)Si la hora esta entre 0 y 5
		if(hora>=0 && hora<=5) {
			int temp=0;
			System.out.println("Ingrese la temperatura");
			temp = Integer.valueOf(entrada.readLine());
			if(temp<20) {
				System.out.println("Encender la calefaccion.");
			}
			else if(temp>25) {
				System.out.println("Apagar la calefaccion.");
			}
			else {
				System.out.println("Calefaccion encendida, no abra las ventanas!!!");
			}
		}
		//5b)Si la hora esta entre 6 y 11 se pide una letra minuscula. Si es vocal se imprime por consola la cantidad de vocales que
		//tiene la hora. Si es consonante se imprime la cantidad de consonantes que tiene la hora.
		else if(hora>=6 && hora<=11) {
			char letra=0;
			System.out.println("Ingrese una letra minuscula");
			letra = entrada.readLine().charAt(0);
			if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u')) {
				switch(hora) {
				case 6: System.out.println("6 tiene dos vocales.");break;
				case 7: System.out.println("7 tiene tres vocales");break;
				case 8: System.out.println("8 tiene dos vocales");break;
				case 9: System.out.println("9 tiene tres vocales");break;
				case 10: System.out.println("10 tiene dos vocales");break;
				case 11: System.out.println("11 tiene dos vocales");break;
				default : System.out.println(hora + " tiene dos consonantes");break;
					}
				}
			else {
				System.out.println(hora + " tiene dos consonantes.");
			}	
		//5c)	
		}
		else if(hora>=12 && hora<=17) {
			if(hora%2==0) {
				System.out.println((hora + 12)/2);
			}
			else {
				System.out.println((hora + 17)/2);
			}
		}
		//5d)
		else if(hora>=18 && hora<=23) {
			int clave=0, verif=0;
			System.out.println("Ingrese una clave numerica.");
			clave = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese una segunda clave entre 100 y 999.");
			verif = Integer.valueOf(entrada.readLine());
			if(((verif/100)%(clave/100)==0)){ 
				System.out.println("Clave correcta.");
			}
			else {
				System.out.println("Clave incorrecta.");
			}
		}
			
		}
		catch(Exception exc) {
			System.out.println("Ocurrio un error. " + exc);
		}		
	}
}
