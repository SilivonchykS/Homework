package classwork.classwork32;

import java.util.Scanner;

public class Main32_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
