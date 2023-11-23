package boletin4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean acierto = false;
		
		System.out.println("Escribe el valor mínimo");
		int valormin = sc.nextInt();
		
		System.out.println("Escribe el valor máximo");
		int valormax = sc.nextInt();
		
		if (valormin > valormax) {
			System.out.println("Error: El valor mínimo es mayor que el valor máximo");
		} else {
			do {
				System.out.println("Escribe un número que esté dentro de " + valormin + " y " + valormax);
				int numerodentrorango = sc.nextInt();
				
				if (valormin > valormax) {
					System.out.println("Error: El valor mínimo es mayor que el valor máximo");
				} else if ((numerodentrorango > valormin) && (numerodentrorango < valormax)) {
					System.out.println("Tu número está entre " + valormin + " y " + valormax);
					acierto = true;
				} else {
					System.out.println("Tu número no está entre " + valormin + " y " + valormax);
				}
			} while (acierto == false);
		}
		
		sc.close();
	}

}
