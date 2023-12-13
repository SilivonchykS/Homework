package homework.homework_39.task_01;

public class Hoover extends Object {
    private String name;
    private int power;
    private String availabilityOfCable;
    private int actionRadius;

    public Hoover(String name, int power, String availabilityOfCable, int actionRadius) {
        this.name = name;
        this.power = power;
        this.availabilityOfCable = availabilityOfCable;
        this.actionRadius = actionRadius;
    }
    public void chargingTime(){
        System.out.println(name + "how mach time");
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getAvailabilityOfCable() {
        return availabilityOfCable;
    }

    public int getActionRadius() {
        return actionRadius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAvailabilityOfCable(String availabilityOfCable) {
        this.availabilityOfCable = availabilityOfCable;
    }

    public void setActionRadius(int actionRadius) {
        this.actionRadius = actionRadius;
    }

    @Override
    public String toString() {
        return "name: "+  this.name + " , "
                +"power :" + this.power + ", "
                + "availabilityOfCable :" + this.availabilityOfCable + " , "
                + "actionRadius: " + this.actionRadius + " , ";
    }
}


