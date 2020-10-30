package by.epam.linear_program.main;

import java.util.Scanner;

public class Main58 {
    public static void main(String[] args) {
        // 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
        // метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
        int x;
        int y;
        int z;
        int t;
        double s;
        x = enterNum(" Сторона X = ");
        y = enterNum(" Сторона Y = ");
        z = enterNum(" Сторона Z = ");
        t = enterNum(" Сторона T = ");
        s = areaQuadrate(x, y, z, t);
        print(" Площадь четырех угольника = ", s);
    }

    private static double areaQuadrate(int x, int y, int z, int t) {
        double p = 0.5 * (x + y + z + t);
        return (Math.sqrt((p - x) * (p - y) * (p - z) * (p - t)));
    }

    private static int enterNum(String message) {
        int value;
        @SuppressWarnings(" resource ")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        while (!sc.hasNextInt()) {
            sc.nextInt();
            System.out.println(message);
        }
        value = sc.nextInt();
        return value;
    }

    public static void print(String message, double s) {
        System.out.println(message + s);
    }
}