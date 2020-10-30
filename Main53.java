package by.epam.linear_program.main;

import java.util.Random;

public class Main53 {
    public static void main(String[] args) {
        // 4. На плоскости заданы своими координатами n точек. Написать метод(методы),
        // определяющие, между какими из пар точек самое большое расстояние. Указание.
        // Координаты точек занести в массив.
        int n;
        int[] ijmax = new int[2];
        boolean d;

        do {
            n = randomValue(10);
            d = check(n);
        } while (!d);

        int[] masx = new int[n];
        int[] masy = new int[n];

        init(masx);
        init(masy);
        ijmax = maxS(masx, masy);

        printMas("x", masx);
        printMas("y", masy);
        print(ijmax);
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
            mas[i] = randomValue(20);
        }
    }

    private static int[] maxS(int[] masx, int[] masy) {
        int i;
        int j;
        int[] ijmax = new int[2];
        double s;
        double max = 0;

        for (i = 0; i < (masx.length - 1); i++) {
            for (j = 1; j < masx.length; j++) {
                s = length(masx[i], masy[i], masx[j], masy[j]);
                if (s > max) {
                    max = s;
                    ijmax[0] = i;
                    ijmax[1] = j;
                }
            }
        }
        return ijmax;
    }

    public static double length(int x1, int y1, int x2, int y2) {
        double s;
        s = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return s;
    }

    public static void printMas(String mes, int[] mas) {
        int i;
        System.out.print(mes);
        for (i = 0; i < mas.length; i++) {
            System.out.printf("%6d", mas[i]);
        }
        System.out.println();
    }

    public static void print(int[] mas) {
        System.out.println("Максимальное расстояние между точками " + (mas[0] + 1) + ", " + (mas[1] + 1) + ".");
    }
}