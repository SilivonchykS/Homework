package classwork.example2;

public class Main {

    /*
    Описать классы человек и домашний адрес
    У человека должен быть адрес проживания
     */
    public static void printPersonAddress(Person person) {
        System.out.println(person.getFullName() + " is living at "
                + person.getAdress().getStreet() + " " + person.getAdress().getHouseNumber()
                + ", " + person.getAdress().getPostalCode() + " " + person.getAdress().getCity()
                + ", " + person.getAdress().getCountry());
    }

    public static void main(String[] args) {
        Adress adress = new Adress("Germany", "Berlin", "Stierstraße", "20A", 12159);
        Person john = new Person("John Doe", "49685496841964", adress);
        Person mary = new Person("Mary Doe", "56498419816846", adress);
        Person jack = new Person("Jack Doe", "45594987874546", adress);
        printPersonAddress(john);
        printPersonAddress(mary);
        printPersonAddress(jack);
    }
}