package Semp3;

import java.util.Random;
import java.util.Scanner;

public class HighestRankNumber {
    static void fillArray(int[] a){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(15);
        }
    }

    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int highestRankNumber(int[] a) {
        int maxCount = 0;
        int maxValue = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
            else if (count == maxCount){
                if(a[i] > maxValue){
                   maxValue = a[i];
                }
            }
        }
        return maxValue;
    }

    static boolean repeatingElements(int [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j <a.length ; j++) {
                if (a[i] == a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    static int uniqElements( int [] a){

        int uniqCount = 0;
        for (int i = 0; i <a.length ; i++) {
            int count = 0;
            for (int j = 0; j <a.length ; j++) {
                if(a[i] == a[j]){
                    count ++;
                }
            }
            if(count == 1 ){
                uniqCount++;
            }
        }
        return uniqCount;
        }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillArray(a);
        printArray(a);

        int hight = highestRankNumber(a);
        System.out.println("Часто повторяющееся число " + hight);
        boolean repEl = repeatingElements(a);
        System.out.println("Есть повторяющийся элемент? " + repEl);
        int uniq = uniqElements(a);
        System.out.println("Уникальных элементов " + uniq);
    }
}
