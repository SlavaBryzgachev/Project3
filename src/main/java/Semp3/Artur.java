package Semp3;

import java.util.Random;
import java.util.Scanner;

public class Artur {
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
    static boolean inviteMoreWomen(int [] a){
        int w = 0;
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == -1){
                w++;
            }
            else
                m++;
        }
        if( m > w){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Пригласить женщину выберите -1");
        System.out.println("Пригласить мужчину выберите 1");
        fillArray(a);
        printArray(a);
        boolean res = inviteMoreWomen(a);
        System.out.println("Пригласить еще женщин?"  + res);
    }
}
