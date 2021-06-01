abstract class Product {
    private Double orderCosts;
    private Double shippingCosts;
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

    public void setOrderCosts(Double orderCosts) {
        this.orderCosts = orderCosts;
    }


    public void setShippingCosts(Double shippingCosts){
        this.shippingCosts = shippingCosts;
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


    public Double getOrderCosts() {
        return orderCosts;
    }

    public Double getShippingCosts() {
        return shippingCosts;
    }

    public Double getTotalOrdercost() {
        this.totalOrderCost =  (this.getOrderCosts() + this.getShippingCosts());
        return this.totalOrderCost;
    }


    public Double getTotalPrice() {
        this.totalPrice =  (this.getOrderCosts() + this.getShippingCosts()) * (this.importfee + 1) * (this.btw +1);;
        return this.totalPrice;
    }



    public Double getCalculateBtw() {
        this.btwCost = (this.getOrderCosts() + this.getShippingCosts()) * (this.importfee+ 1) * this.btw;
        return this.btwCost;
    }


    public Double getCalculateImporfee() {
        this.totalImportfeeCost = (this.getOrderCosts() + this.getShippingCosts()) * this.importfee;
        return this.totalImportfeeCost;
    }


    public abstract String getSpecs();



}
