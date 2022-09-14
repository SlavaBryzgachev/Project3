package august28;

import java.util.Random;
import java.util.Scanner;

public class Temperature {
    static void fillArray(int[] a){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(30) + 10;
        }
    }

    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static double calcAverage(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = (double) sum / a.length;
        return avg;
    }

    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static int countLocalMax(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i-1] && a[i] > a[i+1]) {
                count++;
            }
        }
        return count;
    }
    static int MaxElementCount(int[] a) {
        int countMaxEl = 0;
        int max = findMax(a);
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                countMaxEl++;
            }
        }
        return countMaxEl;
    }
    static boolean ifSuchTemperature(int[] a, int t){
        for (int i = 0; i < a.length; i++) {
            if (t == a[i]) {
                return true;
            }
        }
            return false;
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();
        int[] a = new int[n];
        fillArray(a);
        printArray(a);


        System.out.println("Введите температуру");
        int t = scanner.nextInt();

        double avg = calcAverage(a);
        System.out.println("Среднее = " + avg);

        int max = findMax(a);
        System.out.println("Макс = " + max);

        int count = countLocalMax(a);
        System.out.println("Кол-во лок макс = " + count);

        int countMaxElements = MaxElementCount(a);
        System.out.println("Кол-во раз когда встречается максимальный элемент " + countMaxElements);

        boolean suchTemp =  ifSuchTemperature(a, t);
        System.out.println("Встречается введенная температура? " + suchTemp);

        if(suchTemp) {
            System.out.println("Да");
        }
            else
            System.out.println("Нет");
        }

    }

