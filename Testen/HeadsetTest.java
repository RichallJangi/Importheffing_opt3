import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class HeadsetTest {

        Headset headset = new Headset(0.042, 0.21);
        @ParameterizedTest
        @CsvSource({
                "0, 0,0",
                "140,0,140",
                "149,0,149",
                "150,0,189.12",
                "150,1,190.38",

        })

        void calculatePrice(double orderCost,  double shippingCost, Double expectedTotalprice) {
            Double totalOrderCost =  (orderCost + shippingCost);
            assertEquals(totalOrderCost,CalculatePrice.getTotalOrdercost(orderCost, shippingCost));
            assertEquals(expectedTotalprice,CalculatePrice.getTotalPrice(totalOrderCost, headset.importfee, headset.btw), 0.01);
        }


    }
