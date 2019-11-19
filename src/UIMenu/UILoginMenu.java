package UIMenu;

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

    public static Employee authUser(String [] data) {
        ArrayList<Employee> employees = prepareData();
        Employee employee;
        for (Employee u : employees) {
            if (data[0].equals(u.getNickName())){
                if (data[1].equals(u.getPassword())){
                    if (u instanceof Facer)
                        return employee = new Facer(u.getNickName(),u.getPassword(),u.getDonations(),u.getHoursWorked());
                    else if (u instanceof TeamLeader)
                        return employee = new TeamLeader(u.getNickName(),u.getPassword(),u.getDonations(),u.getHoursWorked(),((TeamLeader) u).getTeam());
                    else if (u instanceof Coach)
                        return null;
                }
            }
        }
        return null;
    }

    private static ArrayList<Employee> prepareData (){
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Donation> donations = new ArrayList<>();
        donations.add(new Donation(300));
        donations.add(new Donation(400));
        donations.add(new Donation(300));
        donations.add(new Donation(600));
        employees.add(new Facer("j","r",donations,23));
        Team team = new Team("Afulic",employees);
        employees.add(new TeamLeader("d","t",donations,18, team));
        team.setEmployees(employees);
        return employees;
    }
}
