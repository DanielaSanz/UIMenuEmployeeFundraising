package UIMenu.UIEmployeeMenu;

import Model.Team;

public class UITeamMenu {

    private static int response = 0;

    public static void showTeamMenu (Team team){
        do{
            System.out.println(team.getTeamName());
            response = 0;
        }while (response !=0);
    }
}
