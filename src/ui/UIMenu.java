package ui;
import java.util.Scanner;
public class UIMenu {
    public static void showMenu(){
        System.out.println("Welcome to My apponments");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    //showDoctorMenu();
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

     static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Bool an appoinment");
            System.out.println("2. My appoinmrnts");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    System.out.println("::Book an appoinment");
                    break;
                case 2:
                    System.out.println("::My appoinments");
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    static void showDoctor(){
        System.out.println("1. Cambiar la agenda");
        System.out.println("2. Mostrar citas agendadas");
        System.out.println("0. Sortir");

        int response = 0;
        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());
        do {
            switch (response){
                case 1:
                    System.out.println("Has cambiado la agenda");
                    break;
                case 2:
                    System.out.println("Mostrando citas agendadas");
                    break;
                case 0:
                    showMenu();
            }

        }while (response != 0);
    }

}