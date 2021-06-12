import java.util.ArrayList;

public class SpeakerHandler {
    private static ArrayList<Speaker> allSpeakers= new ArrayList<>();


    public static void addSpeakers(Speaker newSpeaker){

        allSpeakers.add(newSpeaker);
    }

    public static void showSpeakers() {
        for (Speaker speaker : allSpeakers) {
            System.out.println("_______________");
            System.out.println("Productnaam:" + speaker.getBrand());
            System.out.println("Kleur:" + speaker.getColor());
            System.out.println("totale prijs:" + speaker.totalPrice);
            System.out.println("_______________");
        }
    }
}