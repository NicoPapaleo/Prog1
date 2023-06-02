package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3ejercicio8 { 

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		char caracter='0';
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			num1 = pedirNumero(num1);
			num2 = pedirNumero(num2);
			System.out.println("Ingrese el caracter: \na)Para sumar.\nb)Para restar.\nc)Para multiplicar.\nd)Para dividir.");
			caracter = entrada.readLine().charAt(0);
			if((caracter=='a')||(caracter=='b')||(caracter=='c')||(caracter=='d')){
				switch(caracter) {
				case 'a': suma(num1,num2);break;
				case 'b': resta(num1,num2);break;
				case 'c': multiplicacion(num1,num2);break;
				case 'd': division(num1,num2);break;
				default :System.out.println("Error.");
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static int pedirNumero(int num) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entero.");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		return num;
	}
	
	public static int suma(int num1,int num2) {
		int resultado=0;
		resultado = num1+num2;
		System.out.println("El resultado de la suma de "+num1+" y "+num2+" es "+resultado);
		return resultado;
	}
	public static int resta(int num1,int num2) {
		int resultado=0;
		resultado = num1-num2;
		System.out.println("El resultado de la resta de "+num1+" y "+num2+" es "+resultado);
		return resultado;	
	}
	public static int multiplicacion(int num1,int num2) {
		int resultado=0;
		resultado = num1*num2;
		System.out.println("El resultado de la multiplicacion de "+num1+" y "+num2+" es "+resultado);
		return resultado;
	}
	public static double division(double num1,double num2) {
		double resultado=0;
		resultado = num1/num2;
		System.out.println("El resultado de la division de "+num1+" y "+num2+" es "+resultado);
		return resultado;
	}

}
