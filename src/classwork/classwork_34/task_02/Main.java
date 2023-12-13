package classwork.classwork_34.task_02;

import java.util.Scanner;

public class Main {
    public static int minuten(TravelMetode metode,int distance){
        return (int) ((double)distance/(metode.speedCoefficient*5))*60;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("wie viel km fuer travel");
        int km=scanner.nextInt();
        TravelMetode[] metode=TravelMetode.values();
       // вернет массив
        System.out.println("Choose travel metod");
        for (int i=0;i<metode.length;i++){
            System.out.println((i+1)+ " . " + metode[i]);
        }
        int methodeIndex=scanner.nextInt()-1;
        TravelMetode metod=metode[methodeIndex];
        int time=minuten(metod,km);
        System.out.println("Minutes to cover this distance: " + time);

    }
}
