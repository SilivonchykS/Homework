package classwork.classwork_36.example1;

public class Main {
    public static void main(String[] args) {
        Ruler ruler=new Ruler(30);
        System.out.println("Dimensions:" +ruler.getLeght() + "x"
        +ruler.getWidth() + "X" +ruler.getThickness());
        System.out.println("Matherial:" + ruler.getMatherial());
        System.out.println("Centimeters:" + ruler.getCentimeters());

    }
}
