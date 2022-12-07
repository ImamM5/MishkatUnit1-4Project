//this is the game class

import java.util.Scanner;

public class Game
{
    //sets up all the variables
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
    private boolean c;
    private boolean p;

//sets the constructors
    public Game()
    {
        this.attackVal1 = (int)(Math.random()*5)+6;
        this.attackVal2 = (int)(Math.random()*10)+11;
        this.attackVal3 = (int)(Math.random()*5)+1;
    }

    public Game(String choice1, String choice2)
    {
        answer1 = choice1;
        answer2 = choice2;
        healthBar1 = "||||||||||||||||||||||||||||||||||||||||";
        healthBar2 = "||||||||||||||||||||||||||||||||||||||||";
    }

    //sets the void method while also setting the values for variables c and p
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
                this.c = true;
                return;
            }
            else if (this.answer.equals(answer2))
            {
                System.out.print("So you want to play against a player. \nPlease type in your name: ");
                name1 = input.nextLine();
                System.out.print("Please type in player2's name: ");
                name2 = input.nextLine();
                this.p = true;
                return;
            }
            else
            {
                System.out.print("That is neither c or p. Please press c for computer or p for player: ");
                this.answer = input.nextLine();
                count++;

            }
        }
        System.out.print("Sorry but since you are an L this game will now end.");
        System.exit(0);
    }

    //sets the void method that would print out the values
    public void showValues()
    {
        if (p)
        {
            String p1 = name1 + "'s health: " + healthBar1;
            String p2 = name2 + "'s health: " + healthBar2;
            System.out.println("\n"+p1 + "\n" + p2);
        }
        else if (c)
        {
            String p1 = name1 + "'s health: " + healthBar1;
            String p2 = "Bot's health: " + healthBar2;
            System.out.println("\n"+p1 + "\n" + p2);
        }
    }

    //sets the getter methods
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
    public String getName2()
    {
        return name2;
    }

    public int getAttackVal1()
    {
        this.attackVal1 = (int)(Math.random()*5)+6;
        return attackVal1;
    }

    public int getAttackVal2()
    {
        this.attackVal2 = (int)(Math.random()*10)+11;
        return attackVal2;
    }

    public int getAttackVal3()
    {
        this.attackVal3 = (int)(Math.random()*5)+1;
        return attackVal3;
    }

    //sets the method to return the attack type for computer
    public String getCompAttack()
    {
        String str1 = "";
        int chooseAttack = (int)(Math.random()*3)+1;
        if (chooseAttack == 1)
        {
            str1= "punch";
        }
        else if (chooseAttack == 2)
        {
            str1= "kick";
        }
        else if (chooseAttack ==3)
        {
            str1= "slap";
        }
        return str1;
    }

    //sets the method to return the attack value for computer
    public int compAttackVal()
    {
        this.attackVal1 = (int)(Math.random()*5)+6;
        this.attackVal2 = (int)(Math.random()*10)+11;
        this.attackVal3 = (int)(Math.random()*5)+1;
        if(getCompAttack().equals("punch"))
        {
            return attackVal1;
        }
        else if (getCompAttack().equals("kick"))
        {
            return attackVal2;
        }
        else
        {
            return attackVal3;
        }
    }

    //sets the method to return the attack value for player2
    public int player2Attack(int num)
    {
        this.attackVal1 = (int)(Math.random()*5)+6;
        this.attackVal2 = (int)(Math.random()*10)+11;
        this.attackVal3 = (int)(Math.random()*5)+1;
        if(num == 1)
        {
            return attackVal1;
        }
        else if (num == 2)
        {
            return attackVal2;
        }
        else if (num == 3)
        {
            return attackVal3;
        }
        else
        {
            return 0;
        }
    }

    //sets the toString method
    public String toString()
    {
        return "Press " +answer1 + " for computer and press "+ answer2 + " for player: ";
    }








}
