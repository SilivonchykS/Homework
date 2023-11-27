package classwork.lesson31;

import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if ((number>10 && number<100)&& number % 4 == 0) {
        System.out.println("Richtige Zahl");
    }else {
    }
}

}
