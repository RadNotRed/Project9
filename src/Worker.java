
public class Worker {
    private final int gamesWon; // Number of games won
    private final int gamesLost; // Number of games lost
    private final int gamesTied; // Number of games tied
    private final double winningPercentage; // Winning percentage

    public Worker(int gamesWon, int gamesLost, int gamesTied) { // Constructor
        this.gamesWon = gamesWon; // Assign the gamesWon parameter to the gamesWon field
        this.gamesLost = gamesLost; // Assign the gamesLost parameter to the gamesLost field
        this.gamesTied = gamesTied; // Assign the gamesTied parameter to the gamesTied field
        this.winningPercentage = (double) gamesWon / (gamesWon + gamesLost + gamesTied); // Calculate the winning percentage
    }

    public double getWinningPercentage() {
        return winningPercentage;
    } // Return the winning percentage

    @Override // Override the toString method
    public String toString() { // Return a String representation of the Worker object
        return "Worker{" +
                "gamesWon=" + gamesWon +
                ", gamesLost=" + gamesLost +
                ", gamesTied=" + gamesTied +
                ", winningPercentage=" + winningPercentage +
                '}';
    }
}
