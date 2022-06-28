public class Headset extends Product {
   public Boolean bluethooth;
   private Boolean wire;


    Headset(Double importfee, Double btw) {

            super(importfee, btw);

    }




    @Override
    public String getSpecs() {
        return bluethooth.toString()+ ' '+ wire.toString();
    }



    public void setBluethooth(String bluetooth) {
        if (bluetooth.equals("ja")) {
            this.bluethooth = true;
        } else {
            this.bluethooth = false;
        }

    }




    public void setWire(Boolean wire) {
        this.wire = wire;
    }



}
