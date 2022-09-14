package array_tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EvenArray {
    static void fillArray(int[] a){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
    }

    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int[] createEven(int[] a) {
        int[] b = new int[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[k] = a[i];
                k++;
            }
        }
        b = Arrays.copyOf(b, k);
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillArray(a);
        printArray(a);

        int[] b = createEven(a);
        printArray(b);
    }
}
