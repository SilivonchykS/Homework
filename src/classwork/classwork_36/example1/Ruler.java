package classwork.classwork_36.example1;
public class Ruler {
    private double leght;
    private double width;
    private double thickness;
    private String matherial;
    private int centimeters;

    public Ruler() {
        this(17, 2, 0.1, "Steel", 30);
    }
    public Ruler(double leght,double width,double thickness,String matherial,int centimeters){
        this.leght=leght;
        this.width=width;
        this.thickness=thickness;
        this.matherial=matherial;
        this.centimeters=centimeters;
    }
    public Ruler(int centimeters) {
        this(17, 2, 0.1, "Steel", 30);
}

    public double getLeght() {
        return leght;
    }

    public double getWidth() {
        return width;
    }

    public double getThickness() {
        return thickness;
    }

    public String getMatherial() {
        return matherial;
    }

    public int getCentimeters() {
        return centimeters;
    }

    public void setLeght(double leght) {
        this.leght = leght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setMatherial(String matherial) {
        this.matherial = matherial;
    }

    public void setCentimeters(int centimeters) {
        this.centimeters = centimeters;
    }
}
