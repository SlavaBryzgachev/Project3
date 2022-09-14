package Semp3;
import java.util.Random;
import java.util.Scanner;
public class ReplaceAllItems {

    static void fillArray(int[] a) {
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
    static void replaceItems(int[] a){
        for (int i = 0; i <a.length ; i++) {
            if(a[i] != 2){
                a[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();

        int[] a = new int[n];
        fillArray(a);
        printArray(a);
        replaceItems(a);
        printArray(a);

    }
}
