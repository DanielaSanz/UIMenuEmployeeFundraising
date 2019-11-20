package UIMenu;

import java.util.Scanner;

import Model.Employee.Employee;

import static UIMenu.UIEmployeeMenu.UIEmployeeMenu.showEmployeeMenu;
import static UIMenu.UILogin.AuthUserLogin.authUser;
import static UIMenu.UILogin.UILoginMenu.*;

public class UIMainMenu {
    private static Scanner sc;

    public static void showMenu() {
       int response = 0;
        do {
            System.out.println("Seleccione la opcion deseada");
            System.out.println("1. Acceder");
            System.out.println("0. Salir");

            sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    String []data = showLoginMenu();
                    Employee employee = authUser(data);
                    if (employee != null) {
                        showEmployeeMenu(employee);
                        response = 0;
                    } else
                        System.out.println("El usuario ingresado no existe");
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default :
                    System.out.println("Ingresa una opcion correcta");
            }
        } while (response !=0);

    }

}
