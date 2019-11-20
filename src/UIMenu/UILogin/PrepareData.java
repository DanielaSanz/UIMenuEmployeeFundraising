package UIMenu.UILogin;

import Model.Donation;
import Model.Employee.Employee;
import Model.Employee.Facer;
import Model.Employee.TeamLeader;
import Model.Team;

import java.util.ArrayList;

public class PrepareData {

    public static ArrayList<Employee> prepareData (){

        ArrayList<Donation> donations = new ArrayList<>();
        ArrayList<Donation> donations1 = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        Team team = new Team("Afulic");

        donations.add(new Donation(300));
        donations.add(new Donation(400));
        donations.add(new Donation(300));
        donations.add(new Donation(500));

        employees.add(new Facer("j","r",donations,23));

        donations1.add(new Donation(350));
        donations1.add(new Donation(450));
        donations1.add(new Donation(300));

        employees.add(new TeamLeader("d","t",donations1,18, team));

        team.setEmployees(employees);

        return employees;

    }
}
