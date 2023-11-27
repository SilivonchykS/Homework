package classwork.classwork33;

public class Main4 {
    public static void pseudoBinary(int[]arr){
        for (int i=0;i< arr.length;i++){
            arr[i]=arr[i]<5?0:1;
        }
    }
    public static void main(String[] args) {
        int[]arr={2,5,8,1,7,3,8,4,6,9,2,1,8,3,5,7,4,0,6,9};
        pseudoBinary(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i] +"  ");
        }

    }
}
