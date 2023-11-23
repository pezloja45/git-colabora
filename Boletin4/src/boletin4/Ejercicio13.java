package boletin4;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nota = 0;
        int aprobado = 0;
        int condicionado = 0;
        int suspenso = 0;
        
        for (int i = 1; i <= 6; i++) {
            System.out.println("Escribe la nota:");
            nota = sc.nextInt();
            
            if (nota > 5) {
                aprobado++;
            }
            
            if (nota == 4) {
                condicionado++;
            } else if (nota < 5) {
                suspenso++;
            }
        }
        
        System.out.println("Han aprobado " + aprobado + " alumnos");
        System.out.println("Han condicionado " + condicionado + " alumnos");
        System.out.println("Han suspendido " + suspenso + " alumnos");


        sc.close();
    }

}