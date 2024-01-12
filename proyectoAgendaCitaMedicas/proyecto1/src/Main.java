import static ui.UImenu.*;

import java.util.Date;
public class Main { public static void main(String[] args) {
    //showMenu();

    Doctor myDoctor = new Doctor("Andrick", "General");
    myDoctor.addAvaibleAppointmet(new Date(), "4Pm");
    myDoctor.addAvaibleAppointmet(new Date(), "6Am");
    myDoctor.addAvaibleAppointmet(new Date(), "1Pm");
    System.out.println(myDoctor.getAvaiableAppointments());

    for(Doctor.AvaiableAppointment aA: myDoctor.getAvaiableAppointments()){
        System.out.println(aA.getDate() + " " + aA.getTime());
    }

    //Patient patient = new Patient("Johana ", "Johana@mail.com");

}
}
