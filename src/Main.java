import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Andres","Programador ");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        //b=0

        Patient patient = new Patient("Andres", "Andres@gmail.oom");

        Patient patient2 = new Patient("Alejandra", "alejandra@gmail.oom");

        // Esto es para aprender la diferencia de variable vs objeto: Desde la memoria del pc
        System.out.println("Este es el paciente 1 " + patient.getName());
        System.out.println("Este es el paciente 2 " + patient2.getName());
        patient2 = patient;

        System.out.println("Este es el nuevo paciente 1 " + patient.getName());
        System.out.println( "Este es el paciente 1 asignado al dos " + patient2.getName());


    }
}
