package UIMenu.UIEmployeeMenu;

import Model.Employee.Employee;
import Model.Employee.TeamLeader;

import java.util.Scanner;

import static UIMenu.UIEmployeeMenu.UIFacerMenu.showFacerMenu;
import static UIMenu.UIEmployeeMenu.UITeamMenu.showTeamMenu;

public class UITeamLeaderMenu {

    private static Scanner sc;
    private static int response = 0;

    public static void showTeamLeaderMenu(Employee employee) {

        TeamLeader tl = (TeamLeader) employee;
        do{
            System.out.println("Bienvenido al menú de team leader "+ employee.getNickName());
            System.out.println("Seleccione la opcion deseada");
            System.out.println("1. Mi Dashboard");
            System.out.println("2. Dashboard de "+tl.getTeam().getTeamName());
            System.out.println("0. Salir");

            sc =  new Scanner(System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    showFacerMenu(employee);
                    break;
                case 2:
                    showTeamMenu(tl.getTeam());
                    //System.out.println(tl.getTeam().obtainTeamInformation());
                    //System.out.println(tl.getTeam().obtainTeamAverageAmount());
                    //System.out.println(tl.getTeam().obtainTeamInformation());
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
