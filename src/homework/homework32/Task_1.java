package homework.homework32;

import java.util.Scanner;

public class Task_1 {
    /*Написать программу, которая посчитает от 1 до 10.
В конце выведет "Это всё!"
Пример вывода:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Это всё!*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(n+ "* " + i + " = ");
        }
    }
}
