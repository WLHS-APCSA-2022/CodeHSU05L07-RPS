import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    /**
     *
     * @param user lower case choice of rock, paper, or scissors
     * @param computer lower case choice of rock, paper, or scissors
     * @return the winner
     */
    public static String getWinner(String user, String computer)
    {
        //rock beats scissors, paper beats rock, scissors beats paper
        if(user.equals(computer)){
            return TIE;
        }
        if(user.equals("rock") && computer.equals("paper")){
            return COMPUTER_PLAYER;
        }

        if(user.equals("paper") && computer.equals("rock")){
            return USER_PLAYER;
        }

        if(user.equals("rock") && computer.equals("scissors")){
            return USER_PLAYER;
        }

        if(user.equals("scissors") && computer.equals("rock")){
            return COMPUTER_PLAYER;
        }

        if(user.equals("paper") && computer.equals("scissors")){
            return COMPUTER_PLAYER;
        }

        if(user.equals("scissors") && computer.equals("paper")){
            return USER_PLAYER;
        }
        return null;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            String userChoice = input.nextLine();
            userChoice = userChoice.toLowerCase();
            if(userChoice.equals("")){
                break;
            }
            if(userChoice.equals("rock")||userChoice.equals("paper")||userChoice.equals("scissors")){
                System.out.println("User: "+userChoice);

                int computerChoiceNumber = Randomizer.nextInt(0,2);
                String computerChoice = "";
                if(computerChoiceNumber == 0){
                    computerChoice = "rock";
                } else if (computerChoiceNumber == 1){
                    computerChoice = "paper";
                } else{
                    computerChoice = "scissors";
                }
                System.out.println("Computer: " + computerChoice);
                System.out.println(getWinner(userChoice,computerChoice));
            }else{
                System.out.println(userChoice+" is not a valid move. Please try again.");
            }
        }
        System.out.println("Thanks for playing!");
    }
}
