package boletin4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int asteriscos;
        
        System.out.println("¿Cuántos asteriscos quieres poner?");
        asteriscos = sc.nextInt();
        
        for (int i = 0; i < asteriscos; i++) {
        	
        	for (int j = asteriscos - i; j > 0; j--) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }
        
        sc.close();
	}

}
