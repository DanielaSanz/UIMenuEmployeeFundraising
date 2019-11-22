package UIMenu.UIEmployeeMenu;

import Model.Team;

import java.util.Scanner;

import static UIMenu.UIEmployeeMenu.UIReturnMenu.returnMenu;

public class UITeamMenu {

    private static  Scanner sc;
    private static int response = 0;

    public static void showTeamMenu (Team team){
        do{
            //System.out.println(team.getTeamName());
            System.out.println("Bienvenido al menú del equipo " + team.getTeamName());
            System.out.println("Seleccione la opcion deseada");
            System.out.println("1. Dashboard general del equipo " + team.getTeamName());
            System.out.println("2. Dashboard de los facer del equipo" );
            System.out.println("0. Salir");

            sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1:
                    System.out.println(team.obtainTeamInformation());
                    response = returnMenu();
                    break;
                case 2:
                    System.out.println(team.obtainFacersDetail());
                    response = returnMenu();
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                    default:
                        System.out.println("Debe ingresar una opcion correcta");
            }

        }while (response !=0);
    }
}
