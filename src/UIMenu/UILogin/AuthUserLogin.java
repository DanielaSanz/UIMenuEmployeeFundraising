package UIMenu.UILogin;

import Model.Employee.Coach;
import Model.Employee.Employee;
import Model.Employee.Facer;
import Model.Employee.TeamLeader;

import java.util.ArrayList;

import static UIMenu.UILogin.PrepareData.prepareData;

public class AuthUserLogin {
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
}
