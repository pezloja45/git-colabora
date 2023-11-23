package boletin4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Números primos desde 1 hasta " + n);

        for (int j = 2; j <= n; j++) {    // j es el número que se comprueba si es primo
            i = 2;                // i son los divisores
            while (j % i != 0) {
                i++;
            }
            if (i == j) { // si se ha dividido por el propio número entonces es primo                             
                System.out.println(j);
            }
        }
        
        sc.close();
    }
}