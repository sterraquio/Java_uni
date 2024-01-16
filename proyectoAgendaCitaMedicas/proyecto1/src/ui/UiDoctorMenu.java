package ui;

import static ui.UImenu.doctorLogged;

import java.util.Scanner;

import models.Doctor;

public static ArrayList<Doctor> doctorsAvaibleAppointments = new ArrayList<>();

public class UiDoctorMenu {
    public static void showDoctorMenu(){
        int response =0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+UImenu.doctorLogged.getName());
            System.out.println("1. Add avaible appointment");
            System.out.println("2. My schedule appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (sc) {
                case 1:
                    showAddAvaibleAppointmentMenu();
                    break;

                case 2:

                    break;

                case 0:
                UImenu.showMenu();
                    break;
                default:
                    break;
            }

        } while (response != 0);
    }

    private static void showAddAvaibleAppointmentMenu(){
        int response = 0;
        do {
            System.out.println( "::Add Available appointment");
            System.out.println( "::Select a month");

            for(int i =0; i < 3; i++){
                int j = i + 1;
                System.out.println(j + ". "+ UImenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4) {
                //1,2,3
                int monthSelect = response;
                System.out.println(monthSelect + ". "+ UImenu.MONTHS[monthSelect-1]);

                System.out.println("Insert the date avaible: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: "+ date +"\n1. Correct \n2. change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2)continue;
                int responseTime = 0;
                do {
                    System.out.println("Insert the time available for date: "+ date + " [4:00Pm]");
                    String time = sc.nextLine();
                    System.out.println("Your time is: "+ time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());
                } while (responseTime == 2); 

                UImenu.doctorLogged.addAvaibleAppointmet(date, time);
                checkDoctorAvailableAppointments(UImenu.doctorLogged);


            }else if(response ==0){
                showDoctorMenu();
            }

        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvaiableAppointments().size() > 0 && !doctorsAvaibleAppointments.contains(doctor)) {
            doctorsAvaibleAppointments.add(doctor);
        
        }
    }
}
