public class Speaker extends Product{
    private Integer wattage;
    private Double boxSize;


    Speaker(Double importfee, Double btw) {
        super(importfee, btw);
    }




    public void setBoxSize(Double boxSize) {
        this.boxSize = boxSize;
    }



    @Override
    public String getSpecs() {
        return boxSize + wattage.toString();
    }

    public void setWattage(Integer wattage) {
        this.wattage = wattage;
    }

}
