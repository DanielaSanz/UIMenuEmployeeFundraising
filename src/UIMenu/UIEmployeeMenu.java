package UIMenu;

import Model.Employee.Employee;
import Model.Employee.Facer;
import Model.Employee.TeamLeader;
import Model.Team;

import java.util.Scanner;

public class UIEmployeeMenu {

    static Scanner sc;
    static boolean flagWelcome = true;
    static int response = 0;

    public static void showEmployeeMenu(Employee employee){

        if (employee instanceof Facer){
            showFacerMenu(employee);
        }
        if (employee instanceof TeamLeader){
            showTeamLeaderMenu(employee);
        }
    }

    private static int returnMenu (){
        System.out.println("1. Volver");
        System.out.println("0. Salir");
        sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void showFacerMenu (Employee employee){

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

    private static void showTeamLeaderMenu(Employee employee) {
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
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Debe ingresar una opcion correcta");
            }

        }while (response!= 0);
    }

    private static void showTeamMenu (Team team){
        do{
            System.out.println(team.getTeamName());
            response = 0;
        }while (response !=0);
    }
}
