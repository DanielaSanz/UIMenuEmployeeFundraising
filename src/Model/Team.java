package Model;

import Model.Employee.Employee;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Employee> employees;

    public Team(String teamName) {
        this.teamName = teamName;
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

    //nombre del equipo- Afulic
    //cantidad de donaciones del  grupo 6
    //MP grupal 371,42
    //PC grupal
    //informacion facer
    // q de donaciones - MP -PC

    private int obtainTeamAmountDonations() {
        int result = 0;

        for (Employee employee : employees ) {
            if (employee != null)
                result += employee.getDonations().size();
        }
        return result;
    }

    private float obtainTeamAverageAmount() {
        //suma total de las donaciones / cantidad de donacicones
        float result = 0f;
        int amount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                for ( Donation donation : employee.getDonations() ) {
                   if (donation != null){
                       result += donation.getAmount();
                       amount ++;
                   }
                }
            }
        }
        return result / amount; // buscar acortar el numero
    }

    private float obtainTeamAverageCatchment () {
        float result = 0f;
        return result;
    }

    private String obtainFacersDetail () {
        StringBuilder result = new StringBuilder();
        String tittle = "Nombre     Horas     Cant. Donaciones    MP     PC     \n" ;
        String space = "     ";
        result.append(tittle);
        for (Employee employee : employees) {
            if (employee != null) {
                StringBuilder emp = new StringBuilder();
                emp.append(employee.getNickName()).append(space)
                        .append(employee.getHoursWorked()).append(space)
                        .append(employee.getDonations().size()).append(space)
                        .append(employee.obtainAverageAmount()).append(space)
                        .append(employee.obtainAverageCatchment()).append("\n");
                result.append(emp);
            }
        }
        return result.toString();
    }

    public String obtainTeamInformation() {
        String result = "Nombre : " + teamName + "\nCD : " + obtainTeamAmountDonations() +
                         "\nMP : " + obtainTeamAverageAmount() + "\nPC : " + obtainTeamAverageCatchment();
        return result;
    }
}
