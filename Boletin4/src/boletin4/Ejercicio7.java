package boletin4;

public class Ejercicio7 {

	public static void main(String[] args) {
		int impar = 1;
		int productoimpar = 1;
		
		for (int i = 1; i < 20; i++) {
            if (i % 2 == 1) {
                productoimpar = productoimpar * impar;
                impar = impar + 2;
                
            }
		}
		
		System.out.println("El producto de los primeros 10 números impares es " + productoimpar);
		
	}

}