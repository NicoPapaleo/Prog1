package clase_1;

public class tp_5_18 {
	public static void main(String []args) {
		int [] arrSecuencia = {0,1,2,0,3,4,0,5,6,0};
		final int MAX =10;
		int contador=0;
		int posInicio=0;
		int posFinal=-1;
		int ult_I=-1;
		int ult_F=-1;
		while((posInicio<MAX)&&(posFinal<MAX)) {
			posInicio=ObtenerInicio(arrSecuencia,MAX,posFinal+1);
			posFinal= ObtenerFinal(arrSecuencia,MAX,posInicio);
			if ((obtener_long(arrSecuencia,posInicio,posFinal)>contador)&&
			(posInicio <MAX)&&(posFinal <MAX)) { 
				contador = obtener_long(arrSecuencia,posInicio,posFinal);
				ult_F = posFinal;
				ult_I =	posInicio;	
			}
		}
		System.out.println(ult_I + " " + ult_F);
	}

public static int ObtenerFinal(int []arrSecuencia,int MAX, int posInicio) {
	int posF=posInicio;
	while (arrSecuencia[posF] ==0) {
		posF++;
	}
	return posF-1;
}

public static int ObtenerInicio(int [] arrSecuencia, int MAX, int posFinal) {
	int pos=posFinal;
	while (arrSecuencia[pos] != 0) {
		pos++;
	}
	return pos+1;
}
public static int obtener_long(int []arrSecuencia, int posInicial, int posFinal) {
	int contador=0;
	for (int pos= posInicial; pos<=posFinal; pos++) {
	}
	return contador;
}

}
