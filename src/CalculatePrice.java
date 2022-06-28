import java.util.HashMap;

public class CalculatePrice {
    public static  Double getTotalOrdercost(double orderCost, double shippingCost) {
        double totalOrderCost;
        totalOrderCost =  (orderCost + shippingCost);
        return totalOrderCost;
    }


    public static Double getTotalPrice(double totalOrderCost, double importfee, double btw) {
        double totalPrice;
        if(totalOrderCost >= 150 ) {
            totalPrice = (totalOrderCost) * (importfee + 1) * (btw + 1);
        }else {
            totalPrice = totalOrderCost ;
        }

        return totalPrice;

    }


    public static Double getCalculateBtw(HashMap<String, Double> hm) {
            return(hm.get("orderCost") + hm.get("shippingCost") * (hm.get("importfee")+ 1) * hm.get("btw"));




    }


    public static Double getCalculateImporfee(double totalOrderCost, double importfee) {
        double totalImportfeeCost;
        if(totalOrderCost > 150){
            totalImportfeeCost = (totalOrderCost * importfee);
        }else{
            totalImportfeeCost = 0.0;
        }

        return totalImportfeeCost;
    }

    public static void Hashmap(){
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("btw", 21.0);
        hm.put("kosten", 100.0);
        System.out.println(hm);

    }

}
