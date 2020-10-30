package by.epam.linear_program.main;

import java.util.Random;

public class Main55 {
    public static void main(String[] args) {
        // 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
        int a;
        int b;
        int c;
        a = randomInt(100);
        printInt(" Число А = ", a);
        b = randomInt(100);
        printInt(" Число B = ", b);
        c = randomInt(100);
        printInt(" Число C = ", c);

        int nodAB = nodFinder(a, b);
        printInt(" НОД чисел А и В = ", nodAB);
        int nodBC = nodFinder(b, c);
        printInt(" НОД чисел B и C = ", nodBC);
        int nodAC = nodFinder(a, c);
        printInt(" НОД чисел A и C = ", nodAC);

        primeNum(nodAB, nodBC, nodAC);
    }

    private static void primeNum(int a, int b, int c) {
        if (a == 1 && b == 1 && c == 1) {
            System.out.println(" --------------------------------");
            System.out.println(" Числа А, B и С взаимно простые ");
        } else {
            System.out.println(" -------------------------------- ");
            System.out.println("Числа А, Б и С не взаимно простые");
        }
    }

    private static int nodFinder(int a, int b) {
        int value;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        value = a + b;
        return value;
    }

    private static int randomInt(int limit) {

        Random random = new Random();
        return (random.nextInt(limit));
    }

    private static void printInt(String mesage, int a) {
        System.out.println(mesage + a);
    }
}