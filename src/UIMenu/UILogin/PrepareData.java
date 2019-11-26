package UIMenu.UILogin;

import Model.Donation;
import Model.Employee.Coach;
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

        ArrayList<Donation> donations2 = new ArrayList<>();
        ArrayList<Donation> donations3 = new ArrayList<>();
        ArrayList<Donation> donations4 = new ArrayList<>();
        ArrayList<Employee> employees1 = new ArrayList<>();
        Team team1 = new Team("Greenpeace");

        donations2.add(new Donation(350));
        donations2.add(new Donation(450));
        donations2.add(new Donation(350));
        donations2.add(new Donation(500));

        employees1.add(new Facer("f","c",donations2,25));

        donations3.add(new Donation(350));
        donations3.add(new Donation(450));
        donations3.add(new Donation(330));

        donations4.add(new Donation(350));
        donations4.add(new Donation(450));


        employees1.add(new TeamLeader("v","l",donations3,20, team1));


        team1.setEmployees(employees1);

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team);

        Coach coach = new Coach("p","m",donations4,5,teams);
        employees.add(coach);


        return employees;

    }
}
