package classwork.example2;

public class Person {
    private String fullName;
    private String passportNumber;
    private Adress adress;

    public Person(String fullName, String passportNumber, Adress address) {
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.adress = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress address) {
        this.adress = address;
    }
}
