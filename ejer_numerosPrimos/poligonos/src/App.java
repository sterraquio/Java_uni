/*
 * Crear un programa que calcule si el número ingresado es un número primo
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " es un número compuesto.");
        }

        scanner.close();
    }

    // Método para verificar si un número es primo
    static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // El número es divisible por otro número además de 1 y sí mismo
            }
        }
        return true; // El número es primo
    }
}
