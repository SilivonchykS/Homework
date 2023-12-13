package homework.homework33;

public class Task2 {
    /*Разработать метод, возвращающий массив типа char, в котором записан английский алфавит (маленькими буквами)

    Подсказка: ASCII

    Дополнительное задание: Сделать тоже самое, но возвращать тип String*/
public static char[]alphabet() {
    char[] res = new char[26];
    for (int i = 0; i < res.length; i++) {
        res[i] = (char) (i + 97);
    }
    return res;
}
    public static void main(String[] args) {
        System.out.println(alphabet());
    }


    }

