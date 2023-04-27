package ui;
import java.util.Scanner;
public class UIMenu {
    public static final String[]  MONTHS= {"Enero", "Febrero", "Marzo"};
    public static void showMenu(){
        System.out.println("Welcome to my appoinments");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patien");
            System.out.println("0. Sortir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

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

    static void showPatientMenu(){

        int response = 0;

        do {
            System.out.println("n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appoinment");
            System.out.println("2. My appoinments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                case 2:
                    System.out.println("::My appoinments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response !=0 );

    }
}
