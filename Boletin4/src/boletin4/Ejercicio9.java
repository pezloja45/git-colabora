package boletin4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int altura = 1;
		int alturamax = 0;
		
		do {
			System.out.println("¿Cuánto mide el árbol? (Centímetros)");
			altura = sc.nextInt();
			
			if (altura > alturamax) {
				alturamax = altura;
			}
		} while (altura != -1);
		
		System.out.println("El árbol más alto mide " + alturamax + " centímetros");
		
		sc.close();
	}

}
