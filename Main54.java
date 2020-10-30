package by.epam.linear_program.main;

import java.util.Random;

public class Main54 {
    public static void main(String[] args) {
        // 5. Составить программу, которая в массиве A[N] находит второе по величине число
        // (вывести на печать число, которое меньше максимального элемента массива, но
        // больше всех других элементов).
        int n;
        int i;
        boolean d;

        do {
            n = randomValue(10);
            d = check(n);
        } while (!d);

        int[] mas = new int[n];
        init(mas);
        i = indexSecondMax(mas);
        printMas(mas);
        print(mas[i]);
    }

    private static int randomValue(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }

    private static boolean check(int a) {
        boolean d;
        if (a <= 0) {
            d = false;
        } else {
            d = true;
        }
        return d;
    }

    public static void init(int[] mas) {
        int i;
        for (i = 0; i < mas.length; i++) {
            mas[i] = randomValue(10);
        }
    }

    private static int indexSecondMax(int[] mas) {
        int indexMax;
        int k;
        int indexSecondMax;

        int[] mas1 = mas.clone();
        indexMax = max(0, mas1);
        k = mas1[0];
        mas1[0] = mas1[indexMax];
        mas1[indexMax] = k;
        indexSecondMax = max(1, mas1);

        return indexSecondMax;
    }

    private static int max(int q, int[] mas1) {
        int indexmax = 0;
        int max = 0;
        int i;

        for (i = q; i < mas1.length; i++) {
            if (mas1[i] > max) {
                indexmax = i;
                max = mas1[i];
            }
        }
        return indexmax;
    }

    public static void printMas(int[] mas) {
        int i;

        for (i = 0; i < mas.length; i++) {
            System.out.printf("%5d", mas[i]);
        }
        System.out.println();
    }

    public static void print(int max) {
        System.out.println("Второй по величине элемент массива: " + max);
    }
}