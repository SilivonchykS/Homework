package homework.homework_39.task_01;

public class Tefal extends Hoover{
    private String typeOfCleaning;

    public Tefal(String name, int power, String availabilityOfCable, int actionRadius, String typeOfCleanihg) {
        super(name, power, availabilityOfCable, actionRadius);
        this.typeOfCleaning = typeOfCleanihg;
    }

    @Override
    public void chargingTime() {
        System.out.println(getName()+ ":always ready");
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
                + "typeOfCleaning:" + this.typeOfCleaning;
    }
}
