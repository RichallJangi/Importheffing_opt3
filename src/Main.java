import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit;
        Menu menu = new Menu();

        menu.menuInterface();
        System.out.println("typ 1 om terug te gaan:");
        exit=scanner.nextInt();
        while(exit == 1 ){
            System.out.println(menu.menuInterface());
            System.out.println("typ 1 om terug te gaan:");
            exit=scanner.nextInt();
        }


    }
}