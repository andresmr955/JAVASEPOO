import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Andres Marquez";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);

        Doctor myDoctorAnd = new Doctor();
        myDoctor.showId();

        showMenu();

    }
}
