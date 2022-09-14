package array_tasks;

import java.util.Random;
import java.util.Scanner;

public class AverageNoRepeat {
    static void fillArray(int[] a){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }

    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static double average(int[] a) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean find = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                sum += a[i];
                count++;
            }
        }
        double avg = (double)sum/count;
        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillArray(a);
        printArray(a);

        double avg = average(a);
        System.out.println(avg);
    }
}
