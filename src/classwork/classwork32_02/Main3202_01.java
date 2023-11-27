package classwork.classwork32_02;

import java.util.Random;
import java.util.Scanner;

public class Main3202_01 {
    public static void main(String[] args) {
        int[]numbers=new int[10];
        Random random=new Random();
        for (int i=0;i<numbers.length;i++){
            numbers[i]=random.nextInt(10);
            System.out.print(numbers[i] + "  ");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A");
        int a=scanner.nextInt();
        System.out.println("Enter B");
        int b=scanner.nextInt();

        int sum=0;
        int prod=1;
        for (int i=a;i<b;i++) {
            sum += numbers[i];
            prod *= numbers[i];
        }
            System.out.print("   Sum :" + sum);
        System.out.println("  Prod: " + prod);

        }
    }

