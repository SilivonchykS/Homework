package classwork.lesson31;

import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Geben Sie Zahl");
        int number=scanner.nextInt();
        if (number<0||number>10) {
        }else {
            System.out.println("Richtige Zahl");

        }
    }
}
