import java.util.Scanner;

public class Game
{
    private String answer1;
    private String answer2;
    private String name1= "";
    private String name2 = "";
    private String healthBar;


    public Game(String n1, String n2)
    {
        this.name1 = n1;
        this.name2 = n2;
    }

    public Game()
    {
        answer1 = "c";
        answer2 = "p";
        healthBar = "||||||||||||||||||||||||||||||||||||||||";
    }

    public void gameAsk(String answer)
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 2 || (answer.equals("c") || answer.equals("p")))
        {
            if (answer.equals(answer1))
            {
                System.out.print("So you want to play against the computer. \nPlease type in your name: ");
                name1 = input.nextLine();
                return;
            }
            else if (answer.equals(answer2))
            {
                System.out.print("So you want to play against a player. \nPlease type in your name: ");
                name1 = input.nextLine();
                System.out.print("Please type in player2's name: ");
                name2 = input.nextLine();
                return;
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

    public void showValues()
    {
        if (name1.length() > 0 && name2.length() >0)
        {
            String p1 = name1 + "'s health: " + healthBar;
            String p2 = name2 + "'s health: " + healthBar;
            System.out.println("\n"+p1 + "\n" + p2);
        }
        else if (name1.length() > 0 && name2.length() == 0)
        {
            String p1 = name1 + "'s health: " + healthBar;
            String p2 = "Bot's health: " + healthBar;
            System.out.println("\n"+p1 + "\n" + p2);
        }
    }




}
