package boletin4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota = 0;
		int suspenso = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe la nota:");
			nota = sc.nextInt();
			
			if (nota < 5) {
				suspenso++;
			}
		}
		
		System.out.println("Han suspendido " + suspenso + " alumnos");

		sc.close();
	}

}
