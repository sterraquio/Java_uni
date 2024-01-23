import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int number = scan.nextInt();
        EvenOrOdd.evenOrOdd(number);
        
        String result = EvenOrOdd.evenOrOdd(number);
        System.out.println("The number is: "+ result);
    }
}
