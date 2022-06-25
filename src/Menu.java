

import javax.swing.*;
import java.util.Scanner;

public class Menu {

    String result = "";
    Scanner scanner = new Scanner(System.in);
    public Headset fillInOrderHeadset(){
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

        return headset;
    }

    public void addHeadset(){
        Headset headset = fillInOrderHeadset();
        HeadsetHandler.getInstance().addHeadset(headset);
        ProductHandler.addProduct(headset);

        showOrderDetails(headset);
    }


    public Speaker fillInOrderSpeaker(){
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

        return speaker;
    }

    public void addSpeaker(){
        Speaker speaker = fillInOrderSpeaker();
        SpeakerHandler.getInstance().addSpeakers(speaker);
        ProductHandler.addProduct(speaker);
        showOrderDetails(speaker);
    }

    public void showOrderDetails(Product product){
        product.totalOrderCost = CalculatePrice.getTotalOrdercost(product.getOrderCost(), product.getShippingCost());
        System.out.println("Bestelbedrag:" + product.totalOrderCost);
        product.importfee = CalculatePrice.getCalculateImporfee(product.totalOrderCost, product.importfee);
        System.out.println("Invoerrechten bedrag:" + product.importfee);
        product.btw = CalculatePrice.getCalculateBtw(product.totalOrderCost, product.getOrderCost(), product.getShippingCost(),product.importfee, product.btw);
        System.out.println("BTW bedrag:" + product.btw );
        product.totalPrice = CalculatePrice.getTotalPrice(product.totalOrderCost, product.importfee, product.btw);
        System.out.println("Totale prijs" + product.totalPrice);
    }



    public String menuInterface() {

        int selectie = MenuHandler.menuOpties();


// switch case voor menu opties
        switch (selectie) {
            case 1:
             {
               addHeadset();

              }

                break;
            case 2:
            {

            addSpeaker();

            }

                break;
            case 3:
                HeadsetHandler.getInstance().showHeadsets();
                break;
            case 4:
                SpeakerHandler.getInstance().showSpeakers();

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
