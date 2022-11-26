import java.util.Scanner;

public class GameRunner
{
    public static void main (String [] args)
    {
        Game game1 = new Game();
        Scanner input = new Scanner(System.in);
        String s = "Welcome to fighting simulator! \nIn this game you get to fight with either the computer or another player!";
        s += "\n \nThe rules are simple your health bar will have 30 points. \nWhoever has their health drop to 0 first loses.";
        s += "\nSo lets get started shall we?";

        System.out.println(s);
        System.out.print("\nDo you want to play against the computer or player? Press c for computer or p for player: ");
        String answer = input.nextLine();

        game1.gameAsk(answer);



    }
}
