package by.epam.linear_program.main;

public class Main59 {
    public static void main(String[] args) {
        // 10. Дано натуральное число N. Написать метод(методы) для формирования массива,
        //     элементами которого являются цифры числа N.
        int num = 987654321;
        int i = numLength(num);
        int[] arr = new int[i];
        arr = fillArray(arr, num);   //заполним массив
        System.out.print(num + "\n" + "Массив ----->" + " [ " );
        printArr(arr);
    }

    private static int numLength(int a) {
        int i = 0;
        while (a > 0) {
            a = a / 10;
            i++;
        }
        return i;
    }

    private static int[] fillArray(int[] arr, int n) {
        int i = arr.length - 1;
        while (i >= 0) {
            arr[i] = n % 10;
            i--;
            n = n / 10;
        }
        return arr;
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                System.out.print(arr[i] + " ]" + "\n");
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }
}