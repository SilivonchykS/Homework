package homework.homework31;

import java.util.Scanner;
public class Task31_01 {
    /*Скопировать код из задания 30 задачи 02 (там где формула).
Сделать так, чтобы числа вводились пользователем в консоли.
Пример выполнения:
    Ввод:
    5  7  2  3             Вывод:                         46.6666666*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Geben Sie hier eine Ganzzahl ein: ");
        int number1=scanner.nextInt();
        System.out.println("Geben Sie hier eine Dezimalzahl ein: ");
        double number2=scanner.nextDouble();
        System.out.println("Geben Sie hier eine Ganzzahl ein: ");
        int number3=scanner.nextInt();
        System.out.println("Geben Sie hier eine Dezimalzahl ein: ");
        double number4=scanner.nextDouble();
       /* int a =2;
        double b=2.5;
        int c=15;
        double d=15.8;*/
        var v=number1*(number2-number4)+number3*number1/number4;
        System.out.println(v);
    }
}
