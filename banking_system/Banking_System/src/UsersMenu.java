import java.util.Scanner;

public class UsersMenu {
    public static void users(){
        int control = 0;
        Scanner sc = new Scanner(System.in);
        while (control == 0) {
            //Menu
            System.out.print("\n----------------------USERS----------------------\n0. Back to the principal menu. \n1. Log in. \n2. Create a account. \n3. Report a error.\nInsert your answer: ");
            int answer = sc.nextInt();

            //Valid the input value
            while (answer < 0 || answer >=4) {
                System.out.print("\n\n------------------ERROR------------------\nPlease Insert a correct value. \n");
                System.out.print("\n----------------------USERS----------------------\n0. Back to the principal menu. \n1. Log in. \n2. Create a account. \n3. Report a error.\nInsert your answer: ");
                answer= sc.nextInt();
            }

            switch (answer) {
                case 0:
                    PrincipalMenu.principal();
                    break;
                
                case 1:

                
                    break;

                case 2:
                    break;

                case 3:
                    break;


            }
    
        }
    }
}
