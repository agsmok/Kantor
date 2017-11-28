package menu;

public class MainMenu implements MenuInterface {
    public void display() {
        showDescription();
        System.out.println("Witaj w kantorze wymiany walut");
        System.out.println("1 - Wyświetl kursy walut");

        System.out.println("9 - Wyloguj sie");

        loop:
        while (true) {
            System.out.print("\nTwój wybór:  ");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    Menu.getInstance().display(MENU.CURRENCY);
                    break loop;

                case 9:
                    System.out.println("Zakończono prace. Miłego dnia! :)");

                    break loop;

                default:
                    System.out.println("Błędny wybór!");

            }
        }

    }

    
}
