

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    String result = "";
    Scanner scanner = new Scanner(System.in);


    public String menuInterface() {

        int selectie = menuOpties();

// switch case voor menu opties
        switch (selectie) {
            case 1:
             {
                  Headset headset = new Headset(0.042,0.21);

                  System.out.println("Voer bestel bedrag in");
                  headset.setOrderCosts(scanner.nextDouble());
                  System.out.println("Voer verzendkosten in");
                  headset.setShippingCosts(scanner.nextDouble());
                  scanner.nextLine();
                  System.out.println("Voer het merknaam in");
                  headset.setBrand(scanner.nextLine());
                  System.out.println("Voer kleur in");
                  headset.setColor(scanner.nextLine());
                  System.out.println("de headset heeft bluethooth ja/nee");
                  headset.setBluethooth(scanner.nextLine());


                  System.out.println("de headset heeft een kabel ja/nee");
                  String wire = scanner.nextLine();

                  if (wire.equals("ja")) {
                      headset.setWire(true);
                  } else {
                      headset.setWire(false);
                  }

                  HeadsetHandler.getInstance().addHeadset(headset);
                  ProductHandler.addProduct(headset);


                  System.out.println("Bestelbedrag:" + headset.getTotalOrdercost());

                 System.out.println("Invoerrechten bedrag:" + headset.getCalculateImporfee());
                 System.out.println("BTW bedrag:" + headset.getCalculateBtw());
                 System.out.println("Totale prijs" + headset.getTotalPrice());
              }


                break;
            case 2:
            {
                Speaker speaker = new Speaker(0.070, 0.17);
                System.out.println("Voer bestel bedrag in");
                speaker.setOrderCosts(scanner.nextDouble());
                System.out.println("Voer verzendkosten in");
                speaker.setShippingCosts(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Voer het merknaam in");
                speaker.setBrand(scanner.nextLine());
                System.out.println("Voer kleur in");
                speaker.setColor(scanner.nextLine());
                System.out.println("Voer in hoeveel vermogen de speaker heeft");
                speaker.setWattage(scanner.nextInt());
                System.out.println("Boxsize speaker");
                speaker.setBoxSize(scanner.nextDouble());




                ProductHandler.addProduct(speaker);
                SpeakerHandler.addSpeakers(speaker);
                System.out.println("Bestelbedrag:" + speaker.getTotalOrdercost());

                System.out.println("Invoerrechten bedrag:" + speaker.getCalculateImporfee());
                System.out.println("BTW bedrag:" + speaker.getCalculateBtw());
                System.out.println("Totale prijs" + speaker.getTotalPrice());
            }

                break;
            case 3:
                HeadsetHandler.getInstance().showHeadsets();
                break;
            case 4:
                SpeakerHandler.showSpeakers();

                break;
            case 5:
                ProductHandler.showProducts();
                break;
            case 6:
                break;
            case 7:
                result ="keuze 7";
                break;

        }
        return result;
    }


    public  int menuOpties(){
        int selectie;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menuOpties = new ArrayList<>();
        menuOpties.add("1) Headsets");
        menuOpties.add("2) Laptops");
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
