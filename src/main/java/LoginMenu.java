import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginMenu implements MenuInterface {
    private List<User> users = new ArrayList<>();



    public void display() { //wyswietl np displaylogin menu
//        addToList(u1, u2, u3, u4); //powinno nie dodawac do listy ale wyswietlac liste
    }

    public void displayLoginMenu() {
//        addToList(u1, u2, u3, u4);


        System.out.println("Witaj w naszym systemie.");
        System.out.print("Podaj login:");
        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine().trim();

        System.out.print("Podaj hasło:");
        String password = scanner.nextLine().trim();
        verify(login, password);


    }

    private void verify(String login, String password) {
        List<User>users = new ArrayList<>();
        users.add(new User("admin","admin",Role.ADMIN));
        users.add(new User("user","user",Role.USER));

        boolean zalogowano = false;
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                zalogowano = true;
                System.out.println("Zalogowałeś się!");
                break;
            }
        }
        if (!zalogowano)
            System.out.println("Błąd logowania");
    }


//    User u1 = new User("aaaa", "a");
//    User u2 = new User("aaaa", "b");
//    User u3 = new User("cccc", "c");
//    User u4 = new User("dddd", "d");



    public void addToList(User... userss) {  //
        for (User user : userss) {
            users.add(user);

        }


    }

}
