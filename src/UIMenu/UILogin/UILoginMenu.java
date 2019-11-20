package UIMenu.UILogin;

import Model.Donation;
import Model.Employee.Coach;
import Model.Employee.Employee;
import Model.Employee.Facer;
import Model.Employee.TeamLeader;
import Model.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class UILoginMenu {
    private static Scanner sc;

    public static String [] showLoginMenu(){

        String [] data = new String[2];
        sc = new Scanner(System.in);
        System.out.println("Ingrese el nickName");
        data [0] = sc.nextLine();
        System.out.println("Ingrese password");
        data [1] = sc.nextLine();

        return data;
    }


}
