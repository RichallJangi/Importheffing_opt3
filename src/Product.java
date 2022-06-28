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


    public abstract String getSpecs();




}
