package by.epam.linear_program.main;

import java.util.Scanner;

public class Main52 {
    public static void main(String[] args) {
        // 3. Вычислить площадь правильного шестиугольника со стороной а,
        // используя метод вычисления площади треугольника.

        double side, hex, tri;
        side = initSide(" Сторона шестиугольника = ");

        tri = triangleArea(side);
        print(" Площадь треугольника = ", tri);

        hex = hexagonArea(tri);
        print(" Площадь шестиугольника = ", hex);
    }

    private static double hexagonArea(double a) {
        double hex;
        hex = a * 6;
        return hex;
    }

    private static double triangleArea(double a) {
        double tri;
        tri = Math.pow(a, 2) * Math.sqrt(3) / 4;
        return tri;
    }

    private static int initSide(String message) {
        int value;
        @SuppressWarnings("\r\n" + "resource ")
        Scanner scan = new Scanner(System.in);

        System.out.println(message);

        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println(message);
        }
        value = scan.nextInt();
        return value;
    }

    public static void print(String message, double a) {
        System.out.println(message + a);
    }
}