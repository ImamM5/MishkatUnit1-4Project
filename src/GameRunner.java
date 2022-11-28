import java.util.Scanner;

public class GameRunner
{
    public static void main (String [] args)
    {
        Game game1 = new Game("c", "p");
        Game game2 = new Game();
        Scanner input = new Scanner(System.in);
        String s = "Welcome to fighting simulator! \nIn this game you get to fight with either the computer or another player!";
        s += "\n \nThe rules are simple your health bar will have 40 points. \nWhoever has their health drop to 0 first loses.";
        s += "\nSo lets get started shall we?";

        System.out.println(s);
        System.out.print("\nDo you want to play against the computer or player? Press c for computer or p for player: ");
        String answer = input.nextLine();

        game1.gameAsk(answer);
        game1.showValues();


        answer = game1.getAnswer();
        int healthBar1 = game1.getHealthBar1().length();
        int healthBar2 = game1.getHealthBar2().length();
        String compMove = "";

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
                    int attack2 = game2.compAttackVal();

                    if (attack2 >=5 && attack2 <= 15)
                    {
                        compMove = "punch";
                    } else if (attack2 >=10 && attack2 <= 20)
                    {
                        compMove = "kick";
                    } else if (attack2 >=1 && attack2 <= 5)
                    {
                        compMove = "slap";
                    }

                    healthBar2-= attack1;
                    healthBar1-= attack2;
                    System.out.println(game1.getName1() + " chose punch! It dealt "+ attack1 + " damage!");
                    System.out.println("Bot chose "+compMove+ "! It dealt "+ attack2 + " damage!");
                    System.out.println();
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
                    int attack1 = game2.getAttackVal2();
                    int attack2 = game2.compAttackVal();
                    healthBar2-= attack1; //bots health
                    healthBar1-= attack2; // players health

                    if (attack2 >=5 && attack2 <= 15)
                    {
                        compMove = "punch";
                    } else if (attack2 >=10 && attack2 <= 20)
                    {
                        compMove = "kick";
                    } else if (attack2 >=1 && attack2 <= 5)
                    {
                        compMove = "slap";
                    }

                    System.out.println(game1.getName1() + " chose kick! It dealt "+ attack1 + " damage!");
                    System.out.println("Bot chose "+compMove+ "! It dealt "+ attack2 + " damage!");
                    System.out.println();
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
                else if (choiceA == 3)
                {
                    int attack1 = game2.getAttackVal3();
                    int attack2 = game2.compAttackVal();
                    healthBar2-= attack1;
                    healthBar1-= attack2;

                    if (attack2 >=5 && attack2 <= 15)
                    {
                        compMove = "punch";
                    } else if (attack2 >=10 && attack2 <= 20)
                    {
                        compMove = "kick";
                    } else if (attack2 >=1 && attack2 <= 5)
                    {
                        compMove = "slap";
                    }

                    System.out.println(game1.getName1() + " chose slap! It dealt "+ attack1 + " damage!");
                    System.out.println("Bot chose "+compMove+ "! It dealt "+ attack2 + " damage!");
                    System.out.println();
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
                    int attack2 = game2.compAttackVal();
                    healthBar2-= 0;
                    healthBar1-= attack2;

                    if (attack2 >=5 && attack2 <= 15)
                    {
                        compMove = "punch";
                    } else if (attack2 >=10 && attack2 <= 20)
                    {
                        compMove = "kick";
                    } else if (attack2 >=1 && attack2 <= 5)
                    {
                        compMove = "slap";
                    }

                    System.out.println("No attack was chosen! It dealt 0 damage!");
                    System.out.println("Bot chose "+compMove+ "! It dealt "+ attack2 + " damage!");
                    System.out.println();
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
            if (answer.equals("p"))
            {
                while (healthBar2 > 0 && healthBar1 > 0)
                {
                    System.out.print("\n"+ game1.getName1()+ " choose an attack (type the number): 1)Punch 2)Kick 3)Slap: ");
                    String choice = input.nextLine();
                    System.out.print("\n"+ game1.getName2()+ " choose an attack (type the number): 1)Punch 2)Kick 3)Slap: ");
                    String choice2 = input.nextLine();
                    System.out.println();
                    int choiceA = Integer.parseInt(choice);
                    int choiceA2 = Integer.parseInt(choice2);
                    if (choiceA == 1)
                    {
                        int attack1 = game2.getAttackVal1();
                        healthBar2-= attack1;
                        String str = game1.getName1() + " chose punch! It dealt "+ attack1 + " damage!");
                        String showHealth = game1.getName1() + "'s health: ");
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
                        int attack1 = game2.getAttackVal2();
                        int attack2 = game2.compAttackVal();
                        healthBar2-= attack1; //bots health
                        healthBar1-= attack2; // players health

                        if (attack2 >=5 && attack2 <= 15)
                        {
                            compMove = "punch";
                        } else if (attack2 >=10 && attack2 <= 20)
                        {
                            compMove = "kick";
                        } else if (attack2 >=1 && attack2 <= 5)
                        {
                            compMove = "slap";
                        }

                        System.out.println(game1.getName1() + " chose kick! It dealt "+ attack1 + " damage!");
                        System.out.println("Bot chose "+compMove+ "! It dealt "+ attack2 + " damage!");
                        System.out.println();
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
                    else if (choiceA == 3)
                    {
                        int attack1 = game2.getAttackVal3();
                        int attack2 = game2.compAttackVal();
                        healthBar2-= attack1;
                        healthBar1-= attack2;

                        if (attack2 >=5 && attack2 <= 15)
                        {
                            compMove = "punch";
                        } else if (attack2 >=10 && attack2 <= 20)
                        {
                            compMove = "kick";
                        } else if (attack2 >=1 && attack2 <= 5)
                        {
                            compMove = "slap";
                        }

                        System.out.println(game1.getName1() + " chose slap! It dealt "+ attack1 + " damage!");
                        System.out.println("Bot chose "+compMove+ "! It dealt "+ attack2 + " damage!");
                        System.out.println();
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
                        int attack2 = game2.compAttackVal();
                        healthBar2-= 0;
                        healthBar1-= attack2;

                        if (attack2 >=5 && attack2 <= 15)
                        {
                            compMove = "punch";
                        } else if (attack2 >=10 && attack2 <= 20)
                        {
                            compMove = "kick";
                        } else if (attack2 >=1 && attack2 <= 5)
                        {
                            compMove = "slap";
                        }

                        System.out.println("No attack was chosen! It dealt 0 damage!");
                        System.out.println("Bot chose "+compMove+ "! It dealt "+ attack2 + " damage!");
                        System.out.println();
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
            }


            System.out.println();
            if (healthBar1 <= 0)
            {
                System.out.print("You lost! Boohoo!!!");
                System.exit(0);
            }
            else
            {
                System.out.print("You won! Yay!!!");
                System.exit(0);
            }


        }







    }
}
