import java.util.Scanner;
import character.Player;
import enemy.Enemy;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain;

        do {
            Player player = new Player("Hero", 100, 20, 5);
            Enemy enemy = new Enemy("Dragon", 150, 15, 5);
            int potions = 3;
            playAgain = false;

            System.out.println("Selamat datang di Text RPG!");

            while (player.isAlive() && enemy.isAlive()) {
                System.out.println("\nHP Character: " + player.getHp() + " | HP Enemy: " + enemy.getHp());
                System.out.println("Pilih aksi:");
                System.out.println("1. Serang");
                System.out.println("2. Bertahan");
                System.out.println("3. Minum Ramuan (sisa: " + potions + ")");
                System.out.println("4. Keluar");
                System.out.print("> ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        player.attack(enemy);
                        break;
                    case 2:
                        player.defend();
                        break;
                    case 3:
                        if (potions > 0) {
                            player.heal(20);
                            potions--;
                        } else {
                            System.out.println("Ramuan habis!");
                        }
                        break;
                    case 4:
                        System.out.println("Keluar dari permainan.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        continue;
                }

                if (enemy.isAlive()) {
                    enemy.attack(player);
                }
            }

            if (!player.isAlive()) {
                System.out.println("Game Over, mulai lagi? (y/n)");
                String again = input.next();
                if (again.equalsIgnoreCase("y")) {
                    playAgain = true;
                }
            } else {
                System.out.println("Selamat! Kamu mengalahkan musuh.");
            }
        } while (playAgain);

        input.close();
    }
}