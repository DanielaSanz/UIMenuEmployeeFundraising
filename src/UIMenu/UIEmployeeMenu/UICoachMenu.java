package UIMenu.UIEmployeeMenu;

import Model.Employee.Coach;
import Model.Employee.Employee;

import java.util.Scanner;

import static UIMenu.UIEmployeeMenu.UIFacerMenu.showFacerMenu;
import static UIMenu.UIEmployeeMenu.UITeamMenu.showTeamMenu;

public class UICoachMenu {

    private static Scanner sc;
    private static int response = 0;

    public static void showCoachMenu(Employee employee) {

        Coach coach = (Coach) employee;
        do{
            System.out.println("Bienvenido al menú de coach "+ employee.getNickName());
            System.out.println("Seleccione la opcion deseada");
            System.out.println("1. Mi Dashboard");
            System.out.println("2. Dashboard de equipos");
            System.out.println("0. Salir");

            sc =  new Scanner(System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    showFacerMenu(employee);
                    break;
                case 2:
                    //showTeamMenu();
                    System.out.println(coach.obtainCoachTeamAmountDonations());
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Debe ingresar una opcion correcta");
            }

        }while (response!= 0);
    }
}
