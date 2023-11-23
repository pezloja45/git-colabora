package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce hasta que número quieres aprender a contar");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}

		sc.close();
	}

}
