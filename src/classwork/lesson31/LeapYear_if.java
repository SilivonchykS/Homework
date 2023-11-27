package classwork.lesson31;

import java.util.Scanner;

public class LeapYear_if {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Geben Sie ein Jahr ein: ");
        int year=scanner.nextInt();
        boolean leapYear;

        if (year%400==0){
            leapYear =true;
        }else if (year%100==0){
            leapYear=false;
        }else if (year%4==0){
            leapYear=true;
        }else {
            leapYear=false;
        }
        if (leapYear==true) {
            System.out.println(year + "  ist ein Schaltjahr");
        }else {
            System.out.println(year + "   ist kein Schaltjahr");
        }
    }
}
