package array_tasks;

import java.util.Scanner;

public class IQTest {
    static void fillHand(int[] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите элемент");
            a[i] = scanner.nextInt();
        }
    }

//    static int findErrorNumber(int[] a) {
//        int countEven = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                countEven++;
//            }
//        }
//        if (countEven == 1) {
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] % 2 == 0) {
//                    return a[i];
//                }
//            }
//        }
//        else {
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] % 2 != 0) {
//                    return a[i];
//                }
//            }
//        }
//        return 0;
//    }

    static int findErrorNumber(int[] a) {
        int countEven = 0;
        int evenNumber = 0;
        int oddNumber = 0;

        for (int value : a) {
            if (value % 2 == 0) {
                countEven++;
                evenNumber = value;
            } else {
                oddNumber = value;
            }
        }
        if (countEven == 1) {
            return evenNumber;
        }
        else {
           return oddNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillHand(a);

        int count = findErrorNumber(a);
        System.out.println("Лишнее число = " + count);
    }
}
