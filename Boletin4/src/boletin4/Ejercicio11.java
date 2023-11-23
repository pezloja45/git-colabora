package boletin4;

public class Ejercicio11 {

	public static void main(String[] args) {
		int numero = 1;
		int numero2 = 0;
		
		do {
			for (int i = 0; i <= 10; i++) {
				numero2 = numero * i;
				
				System.out.println(numero + " * " + i + " = " + numero2);
			}
			numero++;
			System.out.println();
		} while (numero2 != 100);
		
	}

}
