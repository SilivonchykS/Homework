package classwork.classwork32;

import java.util.Random;
import java.util.Scanner;

public class Main32_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Array ein");
        int[] arr = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(11);
            System.out.println(arr[11] + "  ");
        }

        /*package classwork;

public class MyArray {
    private double[]array;
    public MyArray(){
        array=new double[0];
    }
    public MyArray(double[]array){
        this.array=new double[array.length];
        copy(array,this.array);
    }
    private void copy(double[]src, double[]dst){
        for (int i=0;i<src.length;i++){
            dst[i]=src[i];
    }
}
public double get(int index){
        return array[index];
}
public void set(int index,double value){
        array[index]=value;
}
/*получение размера
        public int size(){
            return array.length;
        }

    } */


    }}
