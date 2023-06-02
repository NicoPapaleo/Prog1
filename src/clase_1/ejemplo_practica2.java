package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejemplo_practica2 {
public static void main(String[] args) {
int numero = 9;
final int MAX=10;
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
while (numero != 0) {
try {
System.out.println("Ingrese un numero entero (0 para salir): ");
numero = Integer.valueOf(entrada.readLine());
if (numero != 0) {
for (int multiplicador=1; multiplicador <= MAX; multiplicador++)
System.out.println(numero+"*"+multiplicador+"="+(numero * multiplicador));
}
}
catch (Exception exc) {
System.out.println(exc);
}
}
}
}
