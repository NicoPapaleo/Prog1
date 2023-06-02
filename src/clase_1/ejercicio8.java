package clase_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio8 {

	public static void main(String[] args) {
		try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Tabla OR");
			System.out.println("false or true es: "+ (false||true));
			System.out.println("true or false es: "+ (true||false));
			System.out.println("false or false es: "+ (false||false));
			System.out.println("true or true es: "+ (true||true));
			System.out.println("Tabla AND");
			System.out.println("false and true es: "+ (false&&true));
			System.out.println("true and false es: "+ (true&&false));
			System.out.println("false and false es: "+ (false&&false));
			System.out.println("true and true es: "+ (true&&true));
		}
		catch (Exception exc) {System.out.println(exc);}
	}

}
