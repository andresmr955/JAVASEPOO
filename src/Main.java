import java.util.Date;
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
       // showMenu();
        Doctor myDoctor = new Doctor("Angie Bareno ","Trabajo Social");
        //#paso8 se crean las nuevas fechas


        myDoctor.addAvailableAppoinment(new Date(), "4pm");
        myDoctor.addAvailableAppoinment(new Date(), "10pm");
        myDoctor.addAvailableAppoinment(new Date(), "1pm");
        //#paso10 devolver la lista de las fechas

        for(Doctor.AvailableAppoinment aA: myDoctor.getAvailableAppoinments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        };

        //#paso9 devolver la lista de objetos

        System.out.println(myDoctor.getAvailableAppoinments());

/*
        Patient patient = new Patient("David","david@gmail.com");
        Patient patient2 = new Patient("Daniel","daniel@gmail.com");

        System.out.println("Esta es la direccion en memoria del patient: => " + patient);
        System.out.println(patient.getName());
        System.out.println("Esta es la direccion en memoria del patient2: => " + patient2);
        System.out.println(patient2.getName());
        patient = patient2;
        System.out.println("Esta es la direccion en memoria actualizada: " + patient);
        System.out.println(patient.getName());




        //patient.setName("Daniel");


        System.out.print("El nombre del paciente 1 es: " + patient.getName());
        System.out.print(", el correo electronico del paciente 1 es: " + patient.getEmail());
        patient.setWeight(60.5);
        System.out.print(". El peso actual del paciente 1 es: " + patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/



    }
}

