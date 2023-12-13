package homework.homework31;

import java.util.Scanner;
import java.util.Random;

public class Task31_2 {
    public static void main(String[] args) {
        /*"Кости/
Сделать программу, которая будет выкидывать кости.
Сначала программа должна спросить сколько костей выкидывать.
Если пользователь вводит 1 или 2, программа кидает соответствующее количество костей.
В противном случае, программа должна написать, что у нее нет такого количества костей.
В качестве "выкидывания костей" просто вывести нужное количество значений от 1 до 6.

Напоминание: игральные кости - кубик, на каждой стороне которого написаны числа в какой-либо форме.
Обычно это числа от 1 до 6
Сдача задания

Чтобы сдать задание, отправьте вашу ветку в ремоут, и там создайте пулл реквест слияния этой ветки в master.
Отправьте преподавателю ссылку на пулл реквест.*/

        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        System.out.println("Wie viel wuerfel spielen: 1 oder 2");
        int amount=scanner.nextInt();
        if (amount==1) {
            System.out.println(1 + random.nextInt(5));
        }else if (amount==2){
            System.out.println(1+ random.nextInt(5));
            System.out.println(1 + random.nextInt(5));
        }else {
            System.out.println("I dont have that amount of dice");
        }
    }
    }






