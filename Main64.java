package by.epam.linear_program.main;

import java.util.Random;

public class Main64 {
    public static void main(String[] args) {
        // 15. Найти все натуральные n-значные числа, цифры в которых образуют строго
        // возрастающую последовательность (например, 1234, 5789). Для решения задачи
        // использовать декомпозицию.

        int n;
        n = randomValue(5);
        printMas(n, createMas(n));
    }

    private static int randomValue(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit) + 2;
    }

    private static boolean isIncreasing(int n, int x) {
        int i;
        int last;
        int previous;          // предыдущий

        last = x % 10;
        x = x / 10;
        for (i = 0; i < n; i++) {
            previous = x % 10;
            if (previous >= last) {
                return false;
            } else {
                last = previous;
                x = x / 10;
            }
        }
        return true;
    }

    private static int[] createMas(int n) {
        int i;
        int j = 0;
        int[] mas = new int[(int) (Math.pow(10, n))];

        for (i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (isIncreasing(n, i)) {
                mas[j] = i;
                j++;
            }
        }
        return mas;
    }

    public static void printMas(int n, int[] mas) {
        int i;

        System.out.println(n);
        for (i = 0; mas[i] > 0; i++) {
            System.out.print(mas[i] + ", ");
        }
    }
}