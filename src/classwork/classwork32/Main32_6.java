package classwork.classwork32;

public class Main32_6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i += 2) {
            if (i % 2 == 0) {
                sum = i + sum;
            }
            System.out.println(sum);
        }
    }}