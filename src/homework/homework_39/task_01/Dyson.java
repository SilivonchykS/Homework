package homework.homework_39.task_01;

public class Dyson extends Hoover{
    private String typeOfCleaning;

    public Dyson(String name, int power, String availabilityOfCable, int actionRadius, String typeOfCleanihg) {
        super(name, power, availabilityOfCable, actionRadius);
        this.typeOfCleaning = typeOfCleanihg;
    }

    @Override
    public void chargingTime() {
        System.out.println(getName()+ ":4 hours");
            }

    public String getTypeOfCleanihg() {
        return typeOfCleaning;
    }

    public void setTypeOfCleanihg(String typeOfCleanihg) {
        this.typeOfCleaning = typeOfCleanihg;
    }

    @Override
    public String toString() {
        return super.toString() + " , "
                + "typeOfCleaning:" +this.typeOfCleaning;
    }
}
