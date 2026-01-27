package StringsLevel2;
import java.util.Random;
import java.util.Scanner;

public class q9 {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper")))
            return "User";
        else
            return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][3];
        stats[0][0] = "Player"; stats[0][1] = "Computer"; stats[0][2] = "Draws";
        stats[1][0] = String.valueOf(userWins); stats[1][1] = String.valueOf(computerWins); stats[1][2] = String.valueOf(totalGames - userWins - computerWins);
        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;
        stats[2][0] = String.format("%.2f%%", userPercent);
        stats[2][1] = String.format("%.2f%%", computerPercent);
        stats[2][2] = "-";
        return stats;
    }

    public static void displayResults(String[] userChoices, String[] computerChoices, String[] winners, String[][] stats) {
        System.out.println("Game\tPlayer\tComputer\tWinner");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.println((i + 1) + "\t" + userChoices[i] + "\t" + computerChoices[i] + "\t\t" + winners[i]);
        }
        System.out.println("\nOverall Stats:");
        System.out.println("Player Wins\tComputer Wins\tDraws");
        System.out.println(stats[1][0] + "\t\t" + stats[1][1] + "\t\t" + stats[1][2]);
        System.out.println("Player %\tComputer %\t-");
        System.out.println(stats[2][0] + "\t" + stats[2][1] + "\t" + stats[2][2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of games:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] userChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] winners = new String[n];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Game " + (i + 1) + " - Enter rock, paper, or scissors:");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(user, computer);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            userChoices[i] = user;
            computerChoices[i] = computer;
            winners[i] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, n);
        displayResults(userChoices, computerChoices, winners, stats);
    }
}