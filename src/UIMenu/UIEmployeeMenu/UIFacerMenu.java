package UIMenu.UIEmployeeMenu;

import Model.Employee.Employee;
import Model.Employee.TeamLeader;

import java.util.Scanner;

import static UIMenu.UIEmployeeMenu.UIReturnMenu.returnMenu;
import static UIMenu.UIEmployeeMenu.UITeamLeaderMenu.showTeamLeaderMenu;

public class UIFacerMenu {

    private static Scanner sc;
    private static boolean flagWelcome = true;
    private static int response = 0;

    public static void showFacerMenu (Employee employee){
        do {
            if (flagWelcome){
                System.out.println("Bienvenido a tu Dashboard " +  employee.getNickName());
                System.out.println("Selecciona opcion deseada");
            }
            System.out.println("1. Promedio de captación");
            System.out.println("2. Monto Promedio");
            if (employee instanceof TeamLeader){
                System.out.println("0. Volver");
            }else{
                System.out.println("0. Salir");
            }

            sc =  new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1:
                    flagWelcome = false;
                    System.out.println("Tu promedio de captacion es: " + employee.obtainAverageCatchment());
                    response = returnMenu();
                    break;
                case 2:
                    flagWelcome = false;
                    System.out.println("Tu monto promedio es: " + employee.obtainAverageAmount());
                    response = returnMenu();
                    break;
                case 0:
                    if (employee instanceof TeamLeader){
                        showTeamLeaderMenu(employee);
                    }else {
                        System.out.println("Adios");
                    }
                    break;
                default:
                    System.out.println("Debe ingresar una opcion correcta");

            }
        } while (response != 0);
    }
}
