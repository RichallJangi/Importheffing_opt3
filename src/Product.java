abstract class Product {
    private Double orderCost;
    private Double shippingCost;
    private String brand;
    private String color;



    public Double btwCost;
    public Double totalOrderCost;
    public Double totalImportfeeCost;
    public Double totalPrice;
    public Double importfee;
    public Double btw;




    Product(Double importfee, Double btw){
        this.importfee = importfee;
        this.btw = btw;
    }

    public void setOrderCost(Double orderCost) {

        this.orderCost = orderCost;
    }


    public void setShippingCost(Double shippingCost){
        this.shippingCost = shippingCost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Double getBtwCost() {
        return btwCost;
    }

    public Double getOrderCost() {
        return orderCost;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

//    public Double getTotalOrdercost() {
//        this.totalOrderCost =  (this.getOrderCosts() + this.getShippingCosts());
//        return this.totalOrderCost;
//    }
//
//
//    public Double getTotalPrice() {
//
//        if(totalOrderCost > 150) {
//            this.totalPrice = (this.getOrderCosts() + this.getShippingCosts()) * (this.importfee + 1) * (this.btw + 1);
//        }else {
//            this.totalPrice = totalOrderCost ;
//        }
//
//        return this.totalPrice;
//    }
//
//
//
//    public Double getCalculateBtw() {
//        if(totalOrderCost > 150){
//            this.btwCost = (this.getOrderCosts() + this.getShippingCosts()) * (this.importfee+ 1) * this.btw;
//        }else{
//            this.btwCost = 0.0;
//        }
//
//        return this.btwCost;
//    }
//
//
//    public Double getCalculateImporfee() {
//        if(totalOrderCost > 150){
//            this.totalImportfeeCost = (this.getOrderCosts() + this.getShippingCosts()) * this.importfee;
//        }else{
//            this.totalImportfeeCost = 0.0;
//        }
//
//        return this.totalImportfeeCost;
//    }


    public abstract String getSpecs();



}
