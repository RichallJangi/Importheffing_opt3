import java.util.ArrayList;
import java.util.Scanner;

public class MenuHandler {
    public static int menuOpties(){
        int selectie;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menuOpties = new ArrayList<>();
        menuOpties.add("1) Headsets");
        menuOpties.add("2) speaker");
        menuOpties.add("3) Alle headsets tonen");
        menuOpties.add("4) Alle speakers tonen");
        menuOpties.add("5) Alle products tonen");


        for(String opties :menuOpties){
            System.out.println(opties);
        }

        System.out.println("Maak een keuze");
        selectie = scanner.nextInt();
        return selectie;
    }
}
