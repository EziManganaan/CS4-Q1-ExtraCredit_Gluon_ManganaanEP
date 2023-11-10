import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Move rock = new Move("rock");
    Move paper = new Move("paper");
    Move scissors = new Move("scissors");

    rock.setwinsAgainst(scissors);
    paper.setwinsAgainst(rock);
    scissors.setwinsAgainst(paper);

    int rounds = 2;
    int input = 0;

    while(input !=3){
      System.out.println("Welcome to Rock, Paper Scissors!\nEnter 1 to Start your Game, 2 to Adjust the number of Preferred Rounds, 3 to Exit the Game.");
      System.out.println("");
      input = sc.nextInt();
      switch(input){
        case 1:
          int playerScore = 0, programScore = 0;
          System.out.println("Welcome to your First Round. The player who wins more rounds will triumph. Good luck.");

          while(playerScore != rounds && programScore != rounds){
            Move computer = null, player = null;
            int aiChoice = (int) Math.floor(Math.random()*3) + 1;

            switch(aiChoice){
              case 1:
                computer = rock;
                break;
              case 2:
                computer = paper;
                break;
              case 3:
                computer = scissors;
                break;
            }

            System.out.println("\nPlease make your move.\nEnter 1 for Rock, 2 for Paper, 3 for Scissors.");
            int playerChoice = sc.nextInt();

            switch(playerChoice){
              case 1:
                player = rock;
                break;
              case 2:
                player = paper;
                break;
              case 3:
                player = scissors;
                break;
            }

            System.out.printf("Player chose " + player.getName() + ". Computer chose " + computer.getName() + ". ");
            System.out.println("");

            int winner = Move.assessMoves(player, computer);

            switch(winner){
              case 0:
                playerScore++;
                System.out.println("Player wins this round.");
                break;
              case 1:
                programScore++;
                System.out.println("Computer wins this round");
                break;
              case 2:
                System.out.println("Tie!");
                break;
            }

            System.out.print("Player Score: " + playerScore + " Computer Score: " + programScore);
            System.out.println("");

            if (playerScore == rounds){
              System.out.println("");
              System.out.println("The Player won the game!\n");
            }

            else if (programScore == rounds) {
              System.out.println("");
              System.out.println("The Computer won the game!\n");
            }
          }
          break; 

        case 2:
            System.out.println("");
            System.out.println("How many wins are needed to win a match?");

            rounds = sc.nextInt();

            System.out.println("");
            System.out.println("Rounds to win was changed to " + rounds);
            break;

        case 3:
            System.out.println("");
            System.out.println("Thank you for playing!");
            break;
      }
    }
  }
}