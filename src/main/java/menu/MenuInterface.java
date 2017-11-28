package menu;

import java.util.Scanner;

public interface MenuInterface {

    Scanner scanner = new Scanner(System.in);
    public void display();


    default void showDescription() {
        System.out.println("Obecne menu: " + this.getClass().getSimpleName());
    }

}
