package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class p2ejercicio12 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		char letra='0', letmax='a', letmin='z';
		while(letra!='*') {
			try {
				System.out.println("Ingrese una letra minuscula o '*' para terminar.");
				letra = entrada.readLine().charAt(0);
				if((letra>=letmax)&&(letra!='*')){
					letmax=letra;
				}
				else if ((letra<=letmin)&&(letra!='*')) {
					letmin=letra;	
				}
			}
			catch(Exception exc) {
				System.out.println("lalalalalala");
			}
		}
		System.out.println("La letra menor es: "+letmin+"\nLa letra mayor es: "+letmax);

	}

}
