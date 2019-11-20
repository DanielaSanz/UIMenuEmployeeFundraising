package UIMenu.UIEmployeeMenu;

import Model.Employee.Employee;
import Model.Employee.Facer;
import Model.Employee.TeamLeader;

import static UIMenu.UIEmployeeMenu.UIFacerMenu.showFacerMenu;
import static UIMenu.UIEmployeeMenu.UITeamLeaderMenu.showTeamLeaderMenu;

public class UIEmployeeMenu {

    public static void showEmployeeMenu(Employee employee){

        if (employee instanceof Facer){
            showFacerMenu(employee);
        }
        if (employee instanceof TeamLeader){
            showTeamLeaderMenu(employee);
        }
    }

}
