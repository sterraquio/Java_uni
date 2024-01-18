import java.util.Scanner;

public class Menu {
    public static void showMenu(){
        int control = 0;
        while(control == 0){
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\n------ Menu ----------\n");
            System.out.print("Choose your option to calculate. \n1. Addition. \n2. Subtraction. \n3. Multiplication. \n4. Division. \n0. Close program. \nSelect your number:");

            //Loop of Mistake of type input
            while (!sc.hasNextLine()) {
                System.out.println("Invalid input. Please insert a valid option.");
                sc.next(); //Cleanning the Scanner's buffer
            }
            int response = sc.nextInt();

            while (response < 0 || response >=5) {
                System.out.print("\nPlease, Choose your CORRECT option to calculate. \n1. Addition. \n2. Subtraction. \n3. Multiplication. \n4.Division. \n0. Close program. \nSelect your number:");
                response = sc.nextInt();
            }

            switch (response) {
                case 0:
                System.exit(0);
                    break;
                case 1:
                Calculator.addition();
                sc.next();
                    break;
                case 2:
                Calculator.subtraction();
                    break;
                case 3:
                Calculator.multiplication();
                    break;
                case 4:
                Calculator.division();
                    break;
            
                default:
                    break;
            }
        }
    }
}
}
