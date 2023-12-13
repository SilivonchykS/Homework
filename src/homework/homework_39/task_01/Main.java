package homework.homework_39.task_01;

public class Main {
    public static void main(String[] args) {
        Dyson dyson=new Dyson("Dyson 2547", 1500,"wireless",100, "wet cleaning");
        Tefal tefal=new Tefal("Tefal 8625",2200, "withCable",30, "dry cleaning");
        System.out.println(dyson);
        System.out.println(tefal);

        dyson.chargingTime();
        tefal.chargingTime();
    }
}
