package by.epam.linear_program.main;

import java.util.Random;

public class Main62 {
    public static void main(String[] args) {
        // 13. Два простых числа называются «близнецами», если они отличаются друг от
        // друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
        // [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать
        // декомпозицию.
        int n;
        n = randomValue(100);
        printMas(createMasOfTwins(n));
    }

    private static int randomValue(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit) + 3;
    }

    private static boolean isSimpleValue(int x) {
        int i;
        int delitel = 1;

        for (i = x - 1; i >= 1; i--) {
            if (x % i == 0) {
                delitel = i;
                break;
            }
        }
        if (delitel == 1)
            return true;
        else
            return false;
    }

    private static int[] createMasOfTwins(int n) {
        int i;
        int j = 0;
        int[] mas = new int[3 + n / 10];

        for (i = n; i <= 2 * n - 2; i++) {
            if (isSimpleValue(i) && isSimpleValue(i + 2)) {
                mas[j] = i;
                j++;
            }
        }
        return mas;
    }

    public static void printMas(int[] mas) {
        int i;
        for (i = 0; mas[i] > 0; i++) {
            System.out.print(mas[i] + ", ");
            System.out.print((mas[i] + 2) + "; ");
            System.out.println();
        }
    }
}