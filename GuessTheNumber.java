import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int NumberToGuess = (int) (Math.random()*20) + 1;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int s = scanner.nextInt();
            int g = 4 - i;
            if (s == NumberToGuess) {
                System.out.println("Correct!");
                break;
            }else {
                System.out.println("You were wrong!");
                if (s > NumberToGuess) {
                    System.out.println("Too High!");
                }
                if (s < NumberToGuess){
                    System.out.println("Too Low!");
                }
                System.out.println("Guesses remaining: " + g);
            }
        }
    }
}
