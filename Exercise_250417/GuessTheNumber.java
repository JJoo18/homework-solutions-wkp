package Exercise_250417;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner diff = new Scanner(System.in);
        System.out.println("Choose your how many Trys you want:");
        int tries = diff.nextInt();
        System.out.println("Choose the range of numbers:");
        int range = diff.nextInt();

        int NumberToGuess = (int) (Math.random()*range) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("It's time to guess:");
        for (int i = 0; i < tries; i++) {
            int s = scanner.nextInt();
            int g = tries - 1 - i;
            if (s == NumberToGuess) {
                System.out.println("Correct!");
                break;
            }else {
                if (s > NumberToGuess) {
                    System.out.println("Wrong, too High!");
                }
                if (s < NumberToGuess){
                    System.out.println("Wrong, too Low!");
                }
                System.out.println("Guesses remaining: " + g);
                if (i == tries - 1) {
                    System.out.println("You exceed the range of Tries. Better luck next time!");
                }
            }
        }
    }
}
