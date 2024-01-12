package ui;

import java.util.Scanner;

public class UImenu {

    public static  final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

    public static void showMenu(){
        //Greetings
        System.out.println("Welcome to My Appointments");
        System.out.println("Please select your option");

        int response = 0;
        //loop do while for the principal menu
        do {
            //Options of principal menu
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            //Switch of enter numbers 
            switch (response){
                case 1:
                    System.out.println("Doctor");
                    
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    //menu patient
    static void showPatientMenu(){
        int response = 0;
        do {
            //options of the menu patient
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 12; i++) {
                        System.out.println(i+1 + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}