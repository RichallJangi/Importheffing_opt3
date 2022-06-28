import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Boolean isIngelogd = false;

        while (isIngelogd == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("gebruikersnaam:");
            String gebruikersNaam = scanner.nextLine();
            System.out.println("wachtwoord");
            String wachtwoord = scanner.nextLine();
            isIngelogd = inlog(gebruikersNaam, wachtwoord);
        }
        int exit;
        Menu menu = new Menu();
        menu.menuInterface();
        Scanner scanner = new Scanner(System.in);
        System.out.println("typ 1 om terug te gaan:");
        exit = scanner.nextInt();
        while (exit == 1) {
            System.out.println(menu.menuInterface());
            System.out.println("typ 1 om terug te gaan:");
            exit = scanner.nextInt();

        }


    }
    public static Boolean inlog (String gebruikersNaam, String wachtwoord){

        return gebruikersNaam.equals("RJ") && wachtwoord.equals("qwerty");


    }

}