package ui;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UiPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("-Patient-");
            System.out.println("Welcome: " + UImenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("3. Logout" );

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    
                    break;
            
                case 2:
                    
                    break;
            
                case 3:
                    UImenu.showMenu();
                    break;
            }
        } while (response !=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println(":: Book an appointment");
            System.out.println(":: Select date: ");
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            for (int i = 0; i< UiDoctorMenu.doctorsAvaibleAppointments.size(); i++){
                ArrayList<Doctor.AvaiableAppointment> avaiableAppointments = UiDoctorMenu.doctorsAvaibleAppointments.get(i).getAvaiableAppointments();
            }
        } while (response !=0);
    }

}
