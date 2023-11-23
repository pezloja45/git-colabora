package boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Random random = new Random();
		int numero = random.nextInt(100);
		int resultado;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivina el número");
		
		do {
			resultado = sc.nextInt();
			
			contador++;
			
			if (resultado == -1) {
				System.out.println("Te has rendido");
			}else if (resultado != numero) {
				
				if (numero < resultado) {
					System.out.println("El número es menor");
				} else {
					System.out.println("El número es mayor");
				}
				
				System.out.println("Intentalo otra vez:");
			
			} else {
				System.out.print("Verdadero. Nº de intentos: " + contador);
				resultado = -1;
			}
		} while (resultado != -1);
			
        sc.close();
	}
	
}
