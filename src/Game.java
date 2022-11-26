import java.util.Scanner;

public class Game
{
    private String answer1;
    private String answer2;
    private String name1;
    private String name2;


    public Game(String n1, String n2)
    {
        this.name1 = n1;
        this.name2 = n2;
    }

    public Game()
    {
        answer1 = "c";
        answer2 = "p";
    }

    public void gameAsk(String answer)
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 3)
        {
            if (answer.equals(answer1))
            {
                System.out.print("So you want to play against the computer. \nPlease type in your name: ");
                name1 = input.nextLine();
                System.exit(0);
            }
            else if (answer.equals(answer2))
            {
                System.out.print("So you want to play against a player. \nPlease type in your name: ");
                name1 = input.nextLine();
                System.out.print("Please type in player2's name: ");
                name2 = input.nextLine();

                System.exit(0);
            }
            else
            {
                System.out.print("That is neither c or p. Please press c for computer or p for player: ");
                answer = input.nextLine();
                count++;

            }
        }
        System.out.print("Sorry but due to you not following instructions the game will now end.");
        System.exit(0);

    }




}
