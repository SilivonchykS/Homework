package classwork.classwork33;

import java.util.Scanner;

public class Main2 {
    public static int countVowels(String text){

    char[] letters = text.toCharArray();
    char[] vowels = {'a','e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O'};
    int count = 0;

    for(int i=0;i<letters.length;i++){

        for (int j = 0; j < vowels.length; j++) {

        if (letters[i] == vowels[j]) {
            count++;
        }
    }

}
return count;
        }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        System.out.println("Vowels in text you inputed: "  + countVowels(text));

    }
}
