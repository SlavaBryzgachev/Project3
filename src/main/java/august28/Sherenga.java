package august28;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sherenga {
    static void fillHand(int[] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите элемент");
            a[i] = scanner.nextInt();
        }
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    static void fillRand(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(40) + 150;
        }
        Arrays.sort(a);
        reverse(a);
    }

    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static boolean checkDown(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] < a[i+1]) {
                return false;
            }
        }
        return true;
    }

    static int findPlace(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < x){
                return i;
            }
        }
        return a.length;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Как заполнить? 1.Вручную 2.Рандомно");
        int action = scanner.nextInt();

        if(action == 1) {
            fillHand(a);
            if (!checkDown(a)) {
                System.out.println("Неверное заполнение массива");
                return;
            }
        }
        else {
            fillRand(a);
        }

        printArray(a);

        System.out.println("Введите рост пети");
        int x = scanner.nextInt();

        int place = findPlace(a, x);
        System.out.println("Место = " + (place + 1));
    }
}
