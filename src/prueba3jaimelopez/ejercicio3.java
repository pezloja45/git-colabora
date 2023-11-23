package prueba3jaimelopez;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int numero = sc.nextInt();
		sc.close();
		// uso las funciones para calcular cada uno de los requerimientos y los imprimo
		// en el main tras ello
		System.out.println("El resultado de la suma par es: " + sumapar(numero));
		System.out.println("El resultado de la suma impar es: " + sumaimpar(numero));
		System.out.println("El resultado de la multiplicacion par es: " + multiplopar(numero));
		System.out.println("El resultado de la multiplicacion impar es: " + multiploimpar(numero));
	}

	public static int sumapar(int numero) {
		int sumatorio1 = 0;
		for (int i = 0; i < numero; i++)
			if (i % 2 == 0) {
				sumatorio1 = sumatorio1 + i;
			}
		return sumatorio1;
	}

	public static int sumaimpar(int numero) {
		int sumatorio2 = 0;
		for (int i = 0; i < numero; i++) {
			if (i % 2 != 0)
				sumatorio2 = sumatorio2 + i;
		}
		return sumatorio2;
	}

	public static int multiplopar(int numero) {
		int multiplicador1 = 1;
		for (int i = 1; i < numero; i++) {
			if (i % 2 == 0)
				multiplicador1 = multiplicador1 * i;
		}
		return multiplicador1;
	}

	public static int multiploimpar(int numero) {
		int multiplicador2 = 1;
		for (int i = 1; i < numero; i++) {
			if (i % 2 != 0)
				multiplicador2 = multiplicador2 * i;
		}
		return multiplicador2;
	}
}