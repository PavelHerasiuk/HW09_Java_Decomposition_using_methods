package by.epam.linear_program.main;

public class Main56 {
    public static void main(String[] args) {
        // 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
        int a = 9;
        int sum;
        sum = sumFactorial(a);
        print(" Сумма факториалов всех нечетных чисел от 1 до 9 = ", sum);
    }

    private static int sumFactorial(int a) {
        int sumFactorial;
        sumFactorial = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                sumFactorial = sumFactorial + factorial(i);
            }
        }
        return factorial(a);
    }

    private static int factorial(int a) {
        int factorial;
        factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void print(String message, int a) {
        System.out.println(message + a);
    }
}