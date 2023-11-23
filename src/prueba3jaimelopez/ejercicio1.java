package prueba3jaimelopez;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero x: ");
		int numero = sc.nextInt();
		numeros(numero);
		sc.close();
	}

//con un while compruebo los numeros max y min y luego con un contador cuento los mins y los max
	public static void numeros(int numero) {
		Scanner sc = new Scanner(System.in);
		int numeromax = numero;
		int numeromin = numero;
		int contadormin = 0;
		int contadormax = 0;
		while (numero != 0) {
			if (numero > numeromax) {
				numeromax = numero;
			} else if (numero < numeromin) {
				numeromin = numero;
				contadormin++;
			} else if (numeromax == numero) {
				contadormax++;
			} else if (numeromin == numero)
				contadormin++;
			System.out.println("Dime el numero x: ");
			numero = sc.nextInt();
		}
		System.out.println("El numero maximo es: " + numeromax + " y se repite : " + contadormax + " veces");
		System.out.println("El numero minimo es: " + numeromin + " y se repite : " + contadormin + " veces");
		sc.close();
	}
}