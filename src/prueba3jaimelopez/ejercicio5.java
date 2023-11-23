package prueba3jaimelopez;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero para realizarle el factorial: ");
		int numero = sc.nextInt();
		if (numero < 0)
			System.out.println("Error exponente introducido no valido");
		else
			factorial(numero);
		System.out.println("El resultado del factorial es: " + factorial(numero));
		sc.close();
	}

	// uso la misma funcion para hacer el calculo de el factorial tambien conocido
	// como recursiva
	public static int factorial(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return factorial(numero - 1) * numero;
		}
	}
}
