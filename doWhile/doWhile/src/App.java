import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int answer = 0;
        do {
            System.out.println("Seleciona el número de la opción");
            System.out.println("1. Movies");
            System.out.println("2. series");
            System.out.println("0. Exit");
            Scanner entrada = new Scanner(System.in);
            answer = Integer.valueOf(entrada.nextLine());

            switch (answer) {
                case 0:
                    System.out.println("Thanks for visit us");
                    break;
                case 1:
                System.out.println("Movies");
                break;
                case 2:
                System.out.println("Series");
                default:
                System.out.println("Choose a correct answer");
                    break;
            }

        } while (answer!=0);

        System.out.println("The program ends");
        
    }

}
