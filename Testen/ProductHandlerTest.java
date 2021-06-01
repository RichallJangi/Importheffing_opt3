import org.junit.Test;

import static org.junit.Assert.*;

public class ProductHandlerTest {



    @Test
    public void addHeadset() {
        Headset headset = new Headset(0.042, 0.21);
        headset.setBrand("Test");


        assertEquals("Test", headset.getBrand());

    }

    @Test
    public void addSpeakers() {
        Speaker speaker = new Speaker(0.042, 0.21);
        speaker.setBrand("Test");
        assertEquals("Test", speaker.getBrand());
    }
}