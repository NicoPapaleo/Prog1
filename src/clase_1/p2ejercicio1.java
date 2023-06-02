package clase_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2ejercicio1 {
    public static void main(String[] args) {
        double valor = 0;
        while(valor==0) {
        try { BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un valor distinto de 0");
            valor = Double.valueOf(entrada.readLine());
            if(valor>0){
                System.out.println("El valor ingresado es positivo.");
            }
            else if (valor<0){
                System.out.println("El valor ingresado es negativo.");
            }
            else{
                System.out.println("El valor ingresado es 0.");
            }
            
        } 
        catch (Exception e) {
            System.out.println("Ocurrio un error.");
        }
        }
    }
}