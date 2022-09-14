package August27;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winPlayer = 0;
        int winComp = 0;
        System.out.println("Выберите колличество игр");
        int games = scanner.nextInt();
        for (int i = 0; i < games; i++) {
            int choseComp = 1 + (int) (Math.random() * 3);
            System.out.println("1.Камень 2.Ножницы 3.Бумага");
            int chose = scanner.nextInt();
            System.out.println(choseComp);
            if (chose == choseComp) {
                System.out.println("Ничья");
            } else if (chose == 1 && choseComp == 2) {
                winPlayer++;
                System.out.println("Победа игрока " + winPlayer);
            } else if (chose == 1 && choseComp == 3) {
                winComp++;
                System.out.println("Победа компьютера " + winComp);
            } else if (chose == 2 && choseComp == 1) {
                winComp++;
                System.out.println("Победа компьютера " + winComp);

            } else if (chose == 2 && choseComp == 3) {
                winPlayer++;
                System.out.println("Победа игрока " + winPlayer);
            } else if (chose == 3 && choseComp == 1) {
                winPlayer++;
                System.out.println("Победа игрока " + winPlayer);
            } else if (chose == 3 && choseComp == 2) {
                winComp++;
                System.out.println("Победа компьютера " + winComp);


            System.out.println("Выиграно игр игроком  " + winPlayer);
            System.out.println("Выиграно игр компьютером " + winComp);

        }
    }
}
}



