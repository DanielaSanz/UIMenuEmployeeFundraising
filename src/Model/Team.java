package Model;

import Model.Employee.Employee;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Employee> employees;

    public Team(String teamName, ArrayList<Employee> employees) {
        this.teamName = teamName;
        this.employees = employees;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
