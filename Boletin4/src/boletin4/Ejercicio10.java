package boletin4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int numero2 = 0;
		
		System.out.println("Escribe un número del 1 al 10");
		numero = sc.nextInt();
		
		if (numero > 0 && numero < 10) {
			for (int i = 0; i <= 10; i++) {
				numero2 = numero * i;
				
				System.out.println(numero + " * " + i + " = " + numero2);
			}
		}
		
		sc.close();
	}

}
