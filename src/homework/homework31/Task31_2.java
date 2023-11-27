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
    while (amount>1&&amount>2){
        System.out.println("Geben Sie andere Zahl ein");
        amount=scanner.nextInt();
        System.out.println("Richtige Zahl");
    }
    }



          //  System.out.println("Geben Sie hier andere Zahl ein:");

      //  int wuerfel =1+ random.nextInt(6-1);



        /*int number=1+ random.nextInt(100-1);
        while (true){
            int input=scanner.nextInt();

            if (number==input){
                break;

            }else if ((Math.abs(number-input)<=5)){
                System.out.println("Warm");
            }else if ((Math.abs(number-input)<=15)){
                System.out.println("Norm");
            }else {
                System.out.println("Kalt");*/
    }


