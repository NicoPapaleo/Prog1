package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3ejercicio12 {

	public static void main(String[] args) {
		int num=0,contador=0, dado=0;
		num = pedirNumero(num);
		for (int i=0;i<=1000;i++) {
			dado = lanzaDados(dado);
			contador = contadorDeNum(dado,num,contador);
		}
		System.out.println("El numero ingresado se repitio "+contador+" veces.");

	}
	
	public static int lanzaDados(int dado) {
		dado = (int)(Math.random()*6+1);
		//System.out.println(dado);   Si quiero mostrar cada tirada agrego esta linea
		return dado;
	}
	
	public static int pedirNumero(int num) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try {
				while(!(num>=1 && num<=6)) {
				System.out.println("Ingrese un numero entero entre 1 y 6.");
				num = Integer.valueOf(entrada.readLine());
				}
			}
			catch(Exception exc) {
				System.out.println("Numero no valido.");
			}
		return num;
	}
	
	public static int contadorDeNum(int dado, int num, int contador) {
		if(dado==num) {
			contador=contador+1;
		}
		return contador;
	}

}
