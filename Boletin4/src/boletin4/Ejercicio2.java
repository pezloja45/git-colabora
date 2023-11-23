package boletin4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int edad = 0;
		int sumaedad = 0;
		int contador = 0;
		int mayoredad = 0;
		
		do {
			System.out.println("Introduce la edad");
			edad = sc.nextInt();
			
			if (edad < 0) {
				edad = -1;
			} else {
				contador++;
				sumaedad = sumaedad + edad;
			}
			
			if (edad >= 18) {
				mayoredad++;
			}
			
		} while (edad > 0);
		
		double mediaedad = sumaedad / contador;
		
		System.out.println("La suma de las edades es " + sumaedad);
		System.out.println("La media de las edades es " + mediaedad);
		System.out.println("Has introducido " + contador + " edades");
		System.out.println(mayoredad + " son mayor de edad");
		
		sc.close();
	}

}
