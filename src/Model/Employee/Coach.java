package Model.Employee;

import Model.Donation;
import Model.Team;

import java.util.ArrayList;

public class Coach extends Employee {

    private ArrayList<Team> teams;

    public Coach(String nickName, String password, ArrayList<Donation> donations, float hoursWorked, ArrayList<Team> teams) {
        super(nickName, password, donations, hoursWorked);
        this.teams = teams;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public int obtainCoachTeamAmountDonations() {
        int result = 0;
            for (Team team : teams) {
                if (team != null) {
                    result += team.obtainTeamAmountDonations();
                }
            }
        return result;
    }

            @Override
            public String returnTypeEmployee () {
                return "Soy un Coach";
            }
    }