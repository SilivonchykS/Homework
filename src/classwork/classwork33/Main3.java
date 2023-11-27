package classwork.classwork33;

public class Main3 {
    public static int mean(int[]arr){
        int[]copy=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        for (int i=0;i<copy.length-1;i++){
            int index=i;
            for (int j=i;j< copy.length;j++){
                if (copy[j]<copy[index]){
                    index=j;
                    }
            }
            if (index!=i){
                int temp=copy[index];
                copy[index]=copy[i];
                copy[i]=temp;
            }
        }
        int center= copy.length/2;
        if (copy.length%2==1 ){
            return copy[copy[center]/2];
        }else{
            return (copy[center]+copy[center-1])/2;
        }
    }
    public static double avg(int[]arr) {
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {

        int[]arr={15,20,7,42,33,89,50,10,5,77,2,61,98,23,30,18,45,88,12,3,1000000000};
        System.out.println(mean(arr));
        System.out.println(avg(arr));

    }
}
