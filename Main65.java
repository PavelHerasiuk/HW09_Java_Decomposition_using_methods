package by.epam.linear_program.main;

import java.util.Random;

public class Main65 {
    public static void main(String[] args) {
        // 16. Написать программу, определяющую сумму n - значных чисел, содержащих только
        // нечетные цифры. Определить также, сколько четных цифр в найденной сумме.
        // Для решения задачи использовать декомпозицию.
        int n;
        int sum;
        int countEven;
        n = randomValue(5);
        sum = countSum(n);
        countEven = countEvenNumbers(sum);
        printSumQuantity(n, sum, countEven);
    }

    public static int randomValue(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit) + 2;
    }

    private static boolean isContainsOnlyOddNumbers(int n, int x) {
        int i;
        int temp;
        for (i = 0; i < n; i++) {
            temp = x % 10;
            if (temp % 2 == 0) {
                return false;
            } else {
                x = x / 10;
            }
        }
        return true;
    }

    private static int countSum(int n) {
        int i;
        int sum = 0;
        for (i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (isContainsOnlyOddNumbers(n, i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    private static int countEvenNumbers(int x) {
        int quantity = 0;
        int temp;
        while (x / 10 != 0) {
            temp = x % 10;
            if (temp % 2 == 0) {
                quantity++;
            }
            x = x / 10;
        }
        if (x % 2 == 0) {
            quantity++;
        }
        return quantity;
    }

    private static void printSumQuantity(int n, int sum, int quantity) {
        System.out.println(n);
        System.out.println("Сумма чисел содержащих нечетные цифры равна " + sum);
        System.out.println("В сумме " + quantity + " четных цифр");
    }
}