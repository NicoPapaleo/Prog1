package clase_1;

public class p3ejercicio5 {

	public static void main(String[] args) {
		incrementador();
		System.out.println("Termino.");
	}

	public static void incrementador() {
		final int MAX=4;
		for(int i=1;i<=MAX;i++) {
			System.out.println(i);
		}
	}
}
