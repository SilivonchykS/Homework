package classwork.lesson31;

import java.util.Scanner;
public class If_31 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Geben Sie ein Zahl :  ");

    int a=scanner.nextInt();
   if (a<=0){
       System.out.println("Negative oder null");
   }else {
       System.out.println("Positiv");
 /*  }else if (a==0){*/
            System.out.println("Null");


   }

}}
