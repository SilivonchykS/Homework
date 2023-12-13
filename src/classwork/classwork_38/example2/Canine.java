package classwork.classwork_38.example2;

public class Canine {
    private String furColor;
    private String fueType;
    private double lenghth; //dlina
    private double hight;
    public Canine(String species, String habitationArea, double averegeLifespan, String furColor,
                  String fueType,double lenghth,double hight){

    }

    public String getFurColor() {
        return furColor;
    }

    public String getFueType() {
        return fueType;
    }

    public double getLenghth() {
        return lenghth;
    }

    public double getHight() {
        return hight;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setFueType(String fueType) {
        this.fueType = fueType;
    }

    public void setLenghth(double lenghth) {
        this.lenghth = lenghth;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
