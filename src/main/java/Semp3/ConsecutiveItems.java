package Semp3;

import java.util.Scanner;

public class ConsecutiveItems {

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

    static boolean items(int[ ] a, int b,int   c){
        for (int i = 0; i < a.length - 1 ; i++) {
            if(a[i] == b && a[i+1] == c || a[i] == c && a[i+1] == b)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Введите элементы");
        fillArray(a);
        System.out.println("Введите b и c");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        printArray(a);
        System.out.println("Элементы последовательные?" + items(a,b,c));

    }

}
