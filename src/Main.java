import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] rps = {"r", "p", "s"};
        String playerbMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;
        while (true) {
            System.out.println("Enter your move [R, P, or S]: ");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
                break;
        }
        {
            System.out.println(playerMove + " is not a valid move, try again");
        }
        {
            System.out.println("Player B played: " + playerbMove);

            if (playerMove.equals(playerbMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equals("r")) {
                if (playerbMove.equals("p")) {
                    System.out.println("Paper covers rock, you lose!");
                } else if (playerbMove.equals("s")) {
                    System.out.println("Rock breaks scissors, you win!");
                } else if (playerMove.equals("p")) {
                    if (playerbMove.equals("r")) {
                        System.out.println("Paper covers rock, you win!");
                    } else if (playerbMove.equals("s")) {
                        System.out.println("Scissors beats paper, you lose!");
                    } else if (playerMove.equals("s")) {
                        if (playerbMove.equals("p")) {
                            System.out.println("Scissors cuts paper, you win!");
                        } else if (playerbMove.equals("r")) {
                            System.out.println("Rock breaks scissors, you lose!");
                        }
                    }
                }
            }
        }
    }
}

