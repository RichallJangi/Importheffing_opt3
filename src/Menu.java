

import java.util.Scanner;

public class Menu {

    String result = "";
    Scanner scanner = new Scanner(System.in);


    public String menuInterface() {

        int selectie = MenuOpties.menuOpties();

// switch case voor menu opties
        switch (selectie) {
            case 1:
             {
                  Headset headset = new Headset(0.042,0.21);

                  System.out.println("Voer bestel bedrag in");
                  headset.setOrderCost(scanner.nextDouble());
                  System.out.println("Voer verzendkosten in");
                  headset.setShippingCost(scanner.nextDouble());
                  scanner.nextLine();
                  System.out.println("Voer het merknaam in");
                  headset.setBrand(scanner.nextLine());
                  System.out.println("Voer kleur in");
                  headset.setColor(scanner.nextLine());
                  System.out.println("de headset heeft bluethooth ja/nee");
                  headset.setBluethooth(scanner.nextLine());


                  System.out.println("de headset heeft een kabel ja/nee");
                  String wire = scanner.nextLine();

                 headset.setWire(wire.equals("ja"));

                  HeadsetHandler.getInstance().addHeadset(headset);
                  ProductHandler.addProduct(headset);

                  headset.totalOrderCost = CalculatePrice.getTotalOrdercost(headset.getOrderCost(), headset.getShippingCost());
                  System.out.println("Bestelbedrag:" + headset.totalOrderCost);
                 headset.importfee = CalculatePrice.getCalculateImporfee(headset.totalOrderCost, headset.importfee);
                 System.out.println("Invoerrechten bedrag:" + headset.importfee);
                 headset.btw = CalculatePrice.getCalculateBtw(headset.totalOrderCost, headset.getOrderCost(), headset.getShippingCost(),headset.importfee, headset.btw);
                 System.out.println("BTW bedrag:" + headset.btw );
                 headset.totalPrice = CalculatePrice.getTotalPrice(headset.totalOrderCost, headset.importfee, headset.btw);
                 System.out.println("Totale prijs" + headset.totalPrice);
              }


                break;
            case 2:
            {
                Speaker speaker = new Speaker(0.070, 0.17);
                System.out.println("Voer bestel bedrag in");
                speaker.setOrderCost(scanner.nextDouble());
                System.out.println("Voer verzendkosten in");
                speaker.setShippingCost(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Voer het merknaam in");
                speaker.setBrand(scanner.nextLine());
                System.out.println("Voer kleur in");
                speaker.setColor(scanner.nextLine());
                System.out.println("Voer in hoeveel vermogen de speaker heeft");
                speaker.setWattage(scanner.nextInt());
                System.out.println("Boxsize speaker");
                speaker.setBoxSize(scanner.nextDouble());




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




}
