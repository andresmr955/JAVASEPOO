package ui;
import java.util.Scanner;

public class UIMenu {
    public final static  String[] MONTHS = {"Janvier", "Fevrier", "Mars", "avril", "Mai", "Juin", "Julliet", "Aout", "Septembre", "octobre", "Novembre", "Decembre"};
    public static void showMenu(){
            System.out.println("Welcome to Andres Marquez appoinments");
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
                    showDoctorMenu();
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
    } //Por default es “package-private” es decir solo puede ser accedido por clases en el mismo package. Por eso al crear el package “ui” debemos agregar el modificador “public” para poder acceder a él desde la clase Main.

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("::1. Book an appoinment");
            System.out.println("::2. My appoinments");
            System.out.println("::0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    System.out.println("::Book an appoinment");
                    for (int i = 0; i < 12; i++){
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appoinments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    public static void showDoctorMenu(){
        int response = 0;

        do {

            System.out.println("1. Cambiar la agenda");
            System.out.println("2. Mostrar citas agendadas");
            System.out.println("0. Sortir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

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