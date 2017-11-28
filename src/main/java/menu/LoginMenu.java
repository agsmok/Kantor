package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginMenu extends Exception implements MenuInterface {

    private String login;
    private String password;


    public void display() {

    }

    public void displayLoginMenu()  {

        System.out.println("Witaj w naszym systemie.");
        System.out.print("Podaj login:");


        login = scanner.nextLine().trim();

        System.out.print("Podaj hasło:");
        password = scanner.nextLine().trim();
        verify(login, password);
    }

    private void verify(String login, String password) {
        List<User> users = new ArrayList<>();
        users.add(new User("admin", "admin", ADMIN));
        users.add(new User("user", "user", USER));

        boolean zalogowano = false;
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                zalogowano = true;
                System.out.println("Zalogowałeś się!");
            }
        }
        if (!zalogowano)
            System.out.println("Błąd logowania");
    }
}
