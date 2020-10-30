package by.epam.linear_program.main;

import java.util.Random;

public class Main50 {
    public static void main(String[] args) {
        // 1. Написать метод(методы) для нахождения наибольшего общего делителя и
        // наименьшего общего кратного двух натуральных чисел: (НОК(A,B)=A*B/НОД(A,B))

        int a, b;
        int nod, nok;

        a = randomValue(100);
        b = randomValue(10);

        print("A = ", a);
        print("B = ", b);

        line();
        nod = nodFinder(a, b);

        print("НОД = ", nod);
        line();

        nok = nokFinder(a, b, nod);
        print("НОК = ", nok);
    }

    private static int nokFinder(int a, int b, int c) {
        int value;
        value = a * b / c;
        return value;
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

    private static int randomValue(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }

    private static void print(String mesage, int a) {
        System.out.println(mesage + a);
    }

    private static void line() {
        System.out.println("---------");
    }
}