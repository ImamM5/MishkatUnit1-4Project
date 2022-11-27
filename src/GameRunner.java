import java.util.Scanner;

public class GameRunner
{
    public static void main (String [] args)
    {
        Game game1 = new Game();
        Game game2 = new Game(0, 0, 0);
        Scanner input = new Scanner(System.in);
        String s = "Welcome to fighting simulator! \nIn this game you get to fight with either the computer or another player!";
        s += "\n \nThe rules are simple your health bar will have 40 points. \nWhoever has their health drop to 0 first loses.";
        s += "\nSo lets get started shall we?";

        System.out.println(s);
        System.out.print("\nDo you want to play against the computer or player? Press c for computer or p for player: ");
        String answer = input.nextLine();

        game1.gameAsk(answer);
        game1.showValues();
        game2.attackValue();

        answer = game1.getAnswer();
        int healthBar1 = game1.getHealthBar1().length();
        int healthBar2 = game1.getHealthBar2().length();

        if (answer.equals("c"))
        {
            while (healthBar2 > 0 && healthBar1 > 0)
            {
                System.out.print("\nChoose an attack (type the number): 1)Punch 2)Kick 3)Slap: ");
                String choice = input.nextLine();
                System.out.println();
                int choiceA = Integer.parseInt(choice);
                if (choiceA == 1)
                {
                    int attack1 = game2.getAttackVal1();
                    healthBar2-= attack1;
                    healthBar1-= game2.compAttack();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i =1; i <= healthBar1; i++)
                    {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print("Bot's health: ");
                    for (int i =1; i <= healthBar2; i++)
                    {
                        System.out.print("|");
                    }
                }
                else if (choiceA == 2)
                {
                    int attack2 = game2.getAttackVal2();
                    healthBar2-= attack2;
                    healthBar1-= game2.compAttack();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i =1; i <= healthBar1; i++)
                    {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print("Bot's health: ");
                    for (int i =1; i <= healthBar2; i++)
                    {
                        System.out.print("|");
                    }
                }
                else
                {
                    int attack3 = game2.getAttackVal3();
                    healthBar2-= attack3;
                    healthBar1-= game2.compAttack();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i =1; i <= healthBar1; i++)
                    {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print("Bot's health: ");
                    for (int i =1; i <= healthBar2; i++)
                    {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
            if (healthBar1 <= 0)
            {
                System.out.print("You lost! boohoo");
                System.exit(0);
            }
            else
            {
                System.out.print("You won! Yay!");
                System.exit(0);
            }

        }







    }
}
