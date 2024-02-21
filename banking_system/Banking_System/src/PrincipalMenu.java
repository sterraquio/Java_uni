import java.util.Scanner;

public class PrincipalMenu {
public static void principal(){
Scanner sc = new Scanner(System.in);
int control =0;

while (control == 0) {
    

    System.out.print("\n----------------------- Menu -----------------------\n0. Close program. \n1.USERS. \n2. Admin.\n3. Report a error. \n4. Message to manager.\nInsert your option: ");
    //Init of variable of the answer of user.
    int answer = sc.nextInt();

    //If the user input a incorrect value
    while (answer >4 || answer < 0) {
        System.out.print("\n----------------------------------Please, Insert a correct value.----------------------------------");
        System.out.print("\n----------------------- Menu -----------------------\n0. Close program. \n1. USERS. \n2. Admin.\n3. Report a error. \n4. Message to manager.\nInsert your option: ");
        answer = sc.nextInt();
    }

    //Open the next menu 
    switch (answer) {
        case 0:
            System.out.println("Closing the program... Bye👍");
            control =1;
            break;

        case 1:
            System.out.println("Going to Users Menu");
            UsersMenu.users();
            break;
            
        case 2:
            System.out.println("Close");
            control =1;
            break;
        case 3:
            
            System.out.println("Close");
            control =1;
            break;

        case 4:
            System.out.println("\n-----Please contact with our mannagers that can help you.----- \nId: Andrick Buitrago. \nEmail: andrick.b.p@mail.com \n");
            break;
        }     
    }
}







}
