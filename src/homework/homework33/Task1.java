package homework.homework33;

public class Task1 {

    public static void znakchenge(int[]arr){
        for (int i=0;i< arr.length;i++){
        arr[i]=arr[i];
        arr[i]*=-1;
    }}
    public static void main(String[] args) {
    int[]arr={1,5,7,-4,8,-3,6};
    znakchenge(arr);
    for (int i=0;i< arr.length;i++){
        System.out.println(arr[i] + "   ");

    }
}}
