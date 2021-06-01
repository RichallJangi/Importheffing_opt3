import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void totalCosts() {

        Headset headset = new Headset(0.042, 0.21);
        headset.setOrderCosts(500.0);
        headset.setShippingCosts(20.0);




        assertEquals(java.util.Optional.of(655.6264), headset.getTotalPrice());


    }
}