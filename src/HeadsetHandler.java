import java.util.ArrayList;

public class HeadsetHandler {

    private static ArrayList<Headset> allHeadsets = new ArrayList<>();
    private static  HeadsetHandler headsetHandler;

    private HeadsetHandler(){

    }
    public static HeadsetHandler getInstance(){
        if(headsetHandler == null) {
            headsetHandler = new HeadsetHandler();
        }
        return headsetHandler;
    }

    public void addHeadset(Headset newHeadset){

        allHeadsets.add(newHeadset);
    }

    public void showHeadsets() {
        for (Headset headset : allHeadsets) {
            System.out.println("_______________");
            System.out.println("Productnaam:" + headset.getBrand());
            System.out.println("Kleur:" + headset.getColor());
            System.out.println("totale prijs:" + CalculatePrice.getTotalOrdercost(headset.getOrderCost(),headset.getShippingCost()));
            System.out.println("_______________");
        }
    }
}