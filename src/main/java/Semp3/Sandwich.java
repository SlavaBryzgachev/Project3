package array_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Sandwich {
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

    static int[] sandwich(int[] a) {
        int[] b = null;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    //int size = j - i - 1;
                    //b = new int[size];
                    //for (int k = i + 1, t = 0; k < j; k++, t++) {
                        //b[t] = a[k];
                    //}

                    b = Arrays.copyOfRange(a, i+1, j);
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillArray(a);
        printArray(a);

        int[] b = sandwich(a);
        printArray(b);
    }
}
