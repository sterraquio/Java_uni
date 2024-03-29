package ui;

import java.util.ArrayList;
import java.util.Scanner;

import models.Doctor;
import models.Patient;

public class UImenu {

    public static  final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    
    
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
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }


    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Andrés Salado", "andres@mail.com"));
        doctors.add(new Doctor("kamilo ramirez", "kamilo@mail.com"));
        doctors.add(new Doctor("Sara Kamalo", "sara@mail.com"));


        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Andrick Buitrago", "andrick@mail.com"));
        patients.add(new Patient("Leidy Ledesma", "leidy@mail.com"));
        patients.add(new Patient("Mateo Perez", "mateo@mail.com"));
    

        boolean emailCorrect = false;
        do {
            System.out.println("Please insert email: [example@mail.com]");
            try (Scanner sc = new Scanner(System.in)) {
                String email = sc.nextLine();
                if (userType == 1) {
                    for (Doctor d: doctors){
                        if (d.getEmail().equals(email) ){
                            emailCorrect = true;
                            //Obtener el usuario logueado 
                            doctorLogged = d;
                            //showDoctorMenu
                            UiDoctorMenu.showDoctorMenu();
                        }
                    }
                }
                if (userType == 2 ) {
                    for (Patient p: patients){
                        if (p.getEmail().equals(email) ){
                            emailCorrect = true;
                            //Obtener el usuario logueado 
                            patientLogged = p;
                            //showDoctorMenu
                        }
                    }                
                }
            }
        } while (emailCorrect);

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