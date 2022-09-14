package August27;

import java.util.Scanner;

public class riddleAboutRabbits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Закадка: Что это такое: синий, большой, с усами и полностью набит зайцами?");
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите ответ ");
                String answer = scanner.next();
                if(answer.equals("Тролейбус")){
                    System.out.println("Правильно");
                    break;
                }
                else if (answer.equals("Сдаюсь")){
                    System.out.println("Правильный ответ: троллейбус.");
                    break;
                }
                else
                    System.out.println("Подумай еще.");
            }
        }
    }

