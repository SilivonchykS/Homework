package classwork.classwork32_02;

import java.util.Random;

public class Main3202_02 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        int min=-10;
        int max=10;
        Random random=new Random();
        for (int i=0;i<arr.length;i++) {
            arr[i] = min + random.nextInt(max - min);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
       for (int i=0;i<arr.length;i++){
           arr[i]=arr[i]< 0 ? -arr[i] :0;
           System.out.print(arr[i] + "   ");
        }
    }}

