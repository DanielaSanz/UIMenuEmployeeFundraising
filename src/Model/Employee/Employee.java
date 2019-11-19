package Model.Employee;


import Model.Donation;

import java.util.ArrayList;

public abstract class Employee {
    private String nickName;
    private String password;
    private ArrayList<Donation> donations;
    private float hoursWorked;

    public Employee(String nickName, String password, ArrayList<Donation> donations, float hoursWorked) {
        this.nickName = nickName;
        this.password = password;
        this.donations = donations;
        this.hoursWorked = hoursWorked;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }

    public void setDonations(ArrayList<Donation> donations) {
        this.donations = donations;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString(){
        return "employee";
    }

    public float obtainAverageCatchment(){
        return donations.size() / hoursWorked;
    }

    public float obtainAverageAmount(){
        float sum = 0f;
        for (Donation d: donations) {
            sum += d.getAmount();
        }
        return sum / donations.size();
    }

    public abstract String returnTypeEmployee();
}
