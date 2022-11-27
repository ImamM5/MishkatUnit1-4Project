import java.util.Scanner;

public class Game
{
    private String answer1;
    private String answer2;
    private String name1= "";
    private String name2 = "";
    private String healthBar1;
    private String healthBar2;
    private String answer;
    private int attackVal1;
    private int attackVal2;
    private int attackVal3;


    public Game(int av1, int av2, int av3)
    {
        attackVal1 = av1;
        attackVal2 = av2;
        attackVal3= av3;
    }

    public Game()
    {
        answer1 = "c";
        answer2 = "p";
        healthBar1 = "||||||||||||||||||||||||||||||||||||||||";
        healthBar2 = "||||||||||||||||||||||||||||||||||||||||";
    }

    public void gameAsk(String answer)
    {
        this.answer = answer;
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 2 || (this.answer.equals("c") || this.answer.equals("p")))
        {
            if (this.answer.equals(answer1))
            {
                System.out.print("So you want to play against the computer. \nPlease type in your name: ");
                name1 = input.nextLine();
                return;
            }
            else if (this.answer.equals(answer2))
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
                this.answer = input.nextLine();
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
            String p1 = name1 + "'s health: " + healthBar1;
            String p2 = name2 + "'s health: " + healthBar2;
            System.out.println("\n"+p1 + "\n" + p2);
        }
        else if (name1.length() > 0 && name2.length() == 0)
        {
            String p1 = name1 + "'s health: " + healthBar1;
            String p2 = "Bot's health: " + healthBar2;
            System.out.println("\n"+p1 + "\n" + p2);
        }
    }

    public String getAnswer()
    {
        return answer;
    }

    public String getHealthBar1()
    {
        return healthBar1;
    }

    public String getHealthBar2()
    {
        return healthBar2;
    }

    public String getName1()
    {
        return name1;
    }

    public void attackValue()
    {
        this.attackVal1 = (int)(Math.random()*11)+5;
        this.attackVal2 = (int)(Math.random()*11)+10;
        this.attackVal3 = (int)(Math.random()*5)+1;
    }

    public int getAttackVal1()
    {
        return attackVal1;
    }

    public int getAttackVal2()
    {
        return attackVal2;
    }

    public int getAttackVal3()
    {
        return attackVal3;
    }

    public int compAttack()
    {
        int chooseAttack = (int)(Math.random()*3)+1;
        if (chooseAttack == 1)
        {
            return attackVal1;
        }
        else if (chooseAttack == 2)
        {
            return attackVal2;
        }
        else
        {
            return attackVal3;
        }
    }








}
