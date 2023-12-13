package classwork.classwork_34.task_02;

public enum TravelMetode {
    ON_FOOT(1),
BUS(8),
CAR(12),
TRAIN(24);
   final int speedCoefficient;
     TravelMetode(int speedCoefficient){
        this.speedCoefficient=speedCoefficient;
    }
}
