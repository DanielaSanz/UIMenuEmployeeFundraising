package Model.Employee;

import Model.Donation;
import Model.Team;

import java.util.ArrayList;

public class TeamLeader extends Employee {


    private Team team;

    public TeamLeader(String nickName, String password, ArrayList<Donation> donations, float hoursWorked, Team team) {
        super(nickName, password, donations, hoursWorked);
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String returnTypeEmployee() {
        return "Soy un Team Leader";
    }
}
