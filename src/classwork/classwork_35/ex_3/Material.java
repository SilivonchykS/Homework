package classwork.classwork_35.ex_3;

public class Material {
    private double price;
    private String name;
    private String category;
    private int amount;
    private long barcode;
    private int sale;

    public Material(double price, String name, String category, int amount, long barcode) {
        this.price = price;
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.barcode = barcode;
        sale=0;
    }

    public int getSale() {
        return sale;
    }
    public void discount(int discount){
        if (discount<0||discount>100){
            return;
        }
        sale=discount;
        if (sale==0) {
            price = (price / 100) * (100 - sale);
        }else {
            price-=price*sale/100.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
