package Semp3;

import java.util.Random;
import java.util.Scanner;

public class FillTheHardDiskDrive {
    static void fillArray(int[] a){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(30);
        }
    }
    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static int fillDisk(int [] a){
        int disk = 50;
        int count = 0;
        int sum =0;
        for (int i = 0; i < a.length ; i++) {
            sum += a[i];
           if (sum < disk){
               count++;
           }
           else
           break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillArray(a);
        printArray(a);
        System.out.println("Влезает файлов" + fillDisk(a));
    }
}
