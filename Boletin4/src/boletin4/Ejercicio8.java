package boletin4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 1;
		int factorial = 1;
		
		System.out.println("Escribe un número");
		numero = sc.nextInt();
		
		for (int i = factorial; i <= numero; i++) {
			factorial = factorial * i;
		}
		
		System.out.println(numero + "! es " + factorial);
		
		sc.close();
	}

}
