package prueba3jaimelopez;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero entero: ");
		int numero1 = sc.nextInt();
		System.out.println("Dime un numero entero: ");
		int numero2 = sc.nextInt();
		System.out.println("1 para la suma, 2 para la resta, 3 para la multiplicación y 4 para la división");
		int opc = sc.nextInt();
		System.out.println("El resultado de la calculadora es de: " + calculadora(numero1, numero2, opc));
		sc.close();
	}

	// uso una funcion para la calculadora que segun la opcion haga lo que se le
	// pida y luego lo imprimo en el main
	public static int calculadora(int numero1, int numero2, int opc) {
		int calculo = 0;
		if (opc == 1) {
			calculo = numero1 + numero2;
		} else if (opc == 2) {
			calculo = numero1 - numero2;
		} else if (opc == 3) {
			calculo = numero1 * numero2;
		} else {
			calculo = numero1 / numero2;
		}
		return calculo;
	}
}
