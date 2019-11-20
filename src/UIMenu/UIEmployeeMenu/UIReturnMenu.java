package UIMenu.UIEmployeeMenu;

import java.util.Scanner;

public class UIReturnMenu {

    private static Scanner sc;

    public static int returnMenu (){
        System.out.println("1. Volver");
        System.out.println("0. Salir");
        sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
