package Model.Employee;

import Model.Donation;
import Model.Team;

import java.util.ArrayList;

public class Coach extends Employee {

    private ArrayList<Team> teams;

    public Coach(String nickName, String password, ArrayList<Donation> donations, float hoursWorked) {
        super(nickName, password, donations, hoursWorked);
    }

    @Override
    public String returnTypeEmployee() {
        return "Soy un Coach";
    }
}
