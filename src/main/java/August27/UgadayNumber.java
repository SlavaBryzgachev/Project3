package August27;

import java.util.Random;
import java.util.Scanner;

public class UgadayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int action;
        int balance = 100;

        final int COST_ONE_GAME = 10;

        do {
            int computer = random.nextInt(10) + 1;
            balance -= COST_ONE_GAME;

            boolean win = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число");
                int number = scanner.nextInt();
                if (number > computer) {
                    System.out.println("Загаданное число меньше");
                } else if (number < computer) {
                    System.out.println("Загаданное число больше");
                } else {
                    if (i == 0) {
                        balance += 50;
                    }
                    else if (i == 1) {
                        balance += 30;
                    }
                    else {
                        balance += 20;
                    }
                    win = true;
                    System.out.println("Вы угадали");
                    break;
                }
            }

            if (!win) {
                System.out.println("Попытки закончились. Загаданное число = " + computer);
            }

            System.out.println("Баланс = " + balance);
            if (balance < COST_ONE_GAME) {
                System.out.println("Недостаточно средств");
                break;
            }

            System.out.println("1.Выйти 2.Продолжить");
            action = scanner.nextInt();
        }
        while (action != 1);
    }
}
