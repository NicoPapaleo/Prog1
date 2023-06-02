package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3ejercicio13 {

	public static void main(String[] args) {
	int num=0, r1=0, r2=0, r3=0; 
	double result=0;
	r1=pedirNumero();
	r2=pedirNumero();
	r3=pedirNumero();
	System.out.println("Indique que calculo desea realizar: \n(1)Calcular raiz de 1er numero - 3er numero."
			+ "\n(2)Calcular el promedio de los 3 numeros.\n(3)Calcular el cociente de la raiz de (3er numero - 2do numero)/1er numero."
			+ "\n(4)Calcular el cociente del promedio de los tres valores / la raiz del 2do valor.");
	num= pedirNumero();
	while(num>=1 && num<=4) { //para obligar al usuario a elegir una de las 4 opciones
		try {
			switch(num) {
			case 1: result = calculaRaiz(r1,r2,r3,result);break;
			case 2: result = calculaPromedio(r1,r2,r3,result);break;
			case 3: result = calculaCocienteRaiz(r1,r2,r3,result);break;
			case 4: result = calculaCocienteProm(r1,r2,r3,result);break;
			default : System.out.println("Ingreso un valor invalido.");
			 }
			num=0; //para que salga del while
			System.out.println("El resultado es: "+result);
		}
		catch(Exception exc) {
			System.out.println("Error!");
		}
	}
	}
	
	public static int pedirNumero() {
		int num=0;
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
	
	public static double calculaRaiz(double r1, double r2, double r3, double result) {
		if(r1-r3>=0){
			result = Math.sqrt(r1-r3);
		}
		return result;
	}
	public static double calculaPromedio(double r1, double r2, double r3, double result) {
		result= ((r1+r2+r3)/3);
		return result;
	}
	public static double calculaCocienteRaiz(double r1, double r2, double r3, double result) {
		double raiz=0;
		if((r3-r2>=0)&&(r1!=0)) {
			raiz = Math.sqrt(r3-r2);
			result = raiz%r1;
		}
		return result;
	}
	public static double calculaCocienteProm(double r1, double r2, double r3, double result) {
		double prom = calculaPromedio(r1,r2,r3,result);
		result = (prom)%(Math.sqrt(r2));
		return result;
	}

}
