import java.util.Scanner;

public class Calculator {
    public static void addition(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n------ ADDITION --------\n");

            System.out.print("Write your firts number: ");
            int a = scanner.nextInt();

            System.out.print("Write the second number: ");
            int b = scanner.nextInt();
                
            int result = a + b;
            System.out.println("The result is: "+result);
        }      
    }

    public static void subtraction(){
        try (Scanner scanner2 = new Scanner(System.in)) {
            System.out.println("\n------ SUBTRACTION --------\n");

            System.out.print("Write your firts number: ");
            int a = scanner2.nextInt();

            System.out.print("Write the second number: ");
            int b = scanner2.nextInt();
                
            int result = a - b;
            System.out.println("The result is: "+result);
        }
    }

    public static void multiplication(){
        try (Scanner scanner3 = new Scanner(System.in)) {
            System.out.println("\n------ MULTIPLICATION --------\n");

            System.out.print("Write your firts number: ");
            int a = scanner3.nextInt();

            System.out.print("Write the second number: ");
            int b = scanner3.nextInt();
                
            int result = a * b;
            System.out.println("The result is: "+result);
        }
    }

    public static void division(){
        try (Scanner scanner4 = new Scanner(System.in)) {
            System.out.println("\n------ DIVISION --------\n");

            System.out.print("Write your firts number: ");
            int a = scanner4.nextInt();

            System.out.print("Write the second number: ");
            int b = scanner4.nextInt();
                
            int result = a / b;
            System.out.println("The result is: "+result);
    }
    }
}
