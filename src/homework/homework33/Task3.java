package homework.homework33;

public class Task3 {
    /*Генератор чисел фибоначчи

Разработать метод, который сгенерирует первые n чисел последовательности фибоначчи.
n передать как параметр в метод.
Результат нужно записать в массив и вернуть этот массив.
Последовательность фибоначчи это такая последовательность, в которой первые числа 0 и 1, и каждое следующее число
это сумма предыдущих двух чисел.
Продемострировать работу метода в свободной форме.

Дополнительное задание (сложное): выполнить задачу использовав рекурсию*/
    public static int[] fibonacci(int n){
        int[]res=new int[n];
        res[0]=0;
        res[1]=1;
                for (int i=2;i< res.length;i++){
                    res[i]=res[i-1]+res[i-2];
                }
                return res;
    }

    public static void main(String[] args) {
        int amount=10;
        int[]fib=fibonacci(amount);
        for (int i=0;i< fib.length;i++){
            System.out.print(fib[i] + "   ");
        }
    }
}
