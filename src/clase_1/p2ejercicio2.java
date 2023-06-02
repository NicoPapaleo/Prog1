package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio2 {

	public static void main(String[] args) {
		int mes=0;
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese un numero de mes: ");
		mes = Integer.valueOf(entrada.readLine());
		if ((mes==1) || (mes>=3) && (mes<=12)){
			switch(mes) {
			case 4: 
			case 6: 
			case 9: 
			case 11: 
				System.out.println("El mes tiene 30 dias.");break;
			default : 
				System.out.println("El mes tiene 31 dias.");
			}}
		
			else if (mes==2){
				int anio=0;
				System.out.println("Ingrese un numero de anio");
				anio = Integer.valueOf(entrada.readLine());
				if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
					System.out.println("El mes tiene 29 dias.");
				}
				else {
					System.out.println("El mes tiene 28 dias.");
				}
			}

		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}


//		switch(mes) {
//case '1': case '3': case '5': case '7': case '8': case '10': case '12': System.out.println("El mes tiene 31 dias.");break;
//case '4': case '6': case '9': case '11': System.out.println("El mes tiene 30 dias.");break;
//case '2': {System.out.println("Ingrese un numero de anio.");
//			anio = entrada.readLine().charAt(0);
//			if
//		}
//}
	