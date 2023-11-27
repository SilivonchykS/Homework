package classwork.classwork32_02;

import java.util.Random;

public class Main3202_03 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        Random random=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt();
        }
        int sumEven=0;
        int sumOdd=0;
        int countEven=0;
        int countOdd=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
                sumEven += arr[i];
                countEven++;
            }else {
                sumOdd+=arr[i];
                countOdd++;
            }
        }
        System.out.println("Sum even:" + sumEven);
        System.out.println("Sum odd:" + sumOdd);
        System.out.println("Count even:" + countEven);
        System.out.println("Count odd: " + countOdd);

    }
}
