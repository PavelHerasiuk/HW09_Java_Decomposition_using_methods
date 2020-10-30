package by.epam.linear_program.main;

import java.util.Scanner;

public class Main60 {
    public static void main(String[] args) {
        // 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
        int a;
        int b;

        a = enterNum("Введите первое число:");
        b = enterNum("Введите второе число:");

        int firstNum;
        int secondNum;

        firstNum = counterMasLenght(a);
        secondNum = counterMasLenght(b);

        compareNum(firstNum, secondNum);
    }

    private static void compareNum(int a, int b) {
        if (a > b)
            System.out.println("В первом числе больше цифр.");
        else if (a < b)
            System.out.println("Во втором числе больше цифр.");
        else
            System.out.println("В обоих числах одинаковое количество цифр.");
    }

    private static int counterMasLenght(int x) {
        int count = 0;
        do {
            x = x / 10;
            count++;
        } while (x % 10 != 0);
        return count;
    }

    private static int enterNum(String message) {
        int value;

        @SuppressWarnings("resource ")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        while (!sc.hasNextInt()) {
            sc.nextInt();
            System.out.println(message);
        }
        value = sc.nextInt();
        return value;
    }
}