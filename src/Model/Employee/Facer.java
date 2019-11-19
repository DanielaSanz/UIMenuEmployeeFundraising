package Model.Employee;

import Model.Donation;

import java.util.ArrayList;

public class Facer extends Employee {

    public Facer(String nickName, String password, ArrayList<Donation> donations, float hoursWorked) {
        super(nickName, password, donations, hoursWorked);
    }

    @Override
    public String returnTypeEmployee() {
        return "Soy un Facer";
    }

}
