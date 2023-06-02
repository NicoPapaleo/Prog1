package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio13 {

	public static void main(String[] args) {
		char letra='a';
		int num=0;
		while((letra>='a') && (letra<='z')) {
			try { BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese una letra minuscula.");
				letra = entrada.readLine().charAt(0);
				if ((letra>='a') && (letra<='z')) {
					System.out.println("Ingrese un numero entero.");
					num = Integer.valueOf(entrada.readLine());
					if(num>=1 && num<=5) {
						System.out.println("Esta es la tabla del "+num);
						System.out.println(num+ "*1="+(num*1));
						System.out.println(num+ "*2="+(num*2));
						System.out.println(num+ "*3="+(num*3));
						System.out.println(num+ "*4="+(num*4));
						System.out.println(num+ "*5="+(num*5));
						System.out.println(num+ "*6="+(num*6));
						System.out.println(num+ "*7="+(num*7));
						System.out.println(num+ "*8="+(num*8));
						System.out.println(num+ "*9="+(num*9));
						System.out.println(num+ "*10="+(num*10));
					}
					else {
						System.out.println("El numero debe estar entre 1 y 5 inclusive.");
					}
				}
			}			
			catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}
}
