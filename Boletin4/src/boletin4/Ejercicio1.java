package boletin4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		do {
			System.out.println("Escribe un número:");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("El número " + numero + " es par");
			} else {
				System.out.println("El número " + numero + " es impar");
			}
			
			if (numero >= 0) {
				System.out.println("El número " + numero + " es positivo");
			} else {
				System.out.println("El número " + numero + " es negativo");
			}
			
			System.out.println("El cuadrado de " + numero + " es " + numero * numero);			
		} while (numero != 0);

		sc.close();
	}

}
