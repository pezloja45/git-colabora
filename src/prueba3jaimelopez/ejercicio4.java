package prueba3jaimelopez;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numero por el que quieres iniciar: ");
		int num1 = sc.nextInt();
		System.out.println("Dime el numero por el que quieres finalizar: ");
		int num2 = sc.nextInt();
		if (num1 >= num2)
			System.out.println("Error el numero introducido no es valido");
		primeroultimo(num1, num2);
		sc.close();
	}

	// uso el void porque no veo necesario el tener que llamar a la funcion en el
	// main ya que es algo sencillo que no requiere de mas que 2 numeros
	// y sacar los numeros que hay entre medio de los mismos sin tener que hacer
	// ninguna otra comprobacion
	public static void primeroultimo(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}

}
