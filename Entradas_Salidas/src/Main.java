
import java.util.Scanner;

class Calculadora {
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // NaN representa "Not a Number"
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + Calculadora.suma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + Calculadora.resta(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + Calculadora.multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + Calculadora.division(num1, num2));
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

