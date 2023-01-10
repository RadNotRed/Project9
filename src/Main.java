import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the number of games won: ");
        int gamesWon = input.nextInt();
        System.out.println("Enter the number of games lost: ");
        int gamesLost = input.nextInt();
        System.out.println("Enter the number of games tied: ");
        int gamesTied = input.nextInt();
        Worker worker = new Worker(gamesWon, gamesLost, gamesTied); // Create a Worker object
        System.out.println("The team's winning percentage is " + worker.getWinningPercentage()); // Display the winning percentage
    }
}
