package august28;
import java.util.Scanner;
public class Massive {
    static void fillHand(int[] a) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите элемент");
            a[i] = scanner.nextInt();
        }
    }
    public static int[] newMassive(int[] a) {
        int[] b = new int[a.length];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[c] = a[i];
                c++;
            }
        }
        return b;
    }
    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = scanner.nextInt();
        int [] a = new int [n];
        fillHand(a);
        int [] b = newMassive(a);
        printArray(b);
    }
}
