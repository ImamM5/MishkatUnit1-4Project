/*
This fighting game, where the user can choose to play either a computer or another player.
This is the runner  class for the program
 */

import java.util.Scanner;

public class
GameRunner {
    public static void main(String[] args) {
        Game game1 = new Game("c", "p"); // constructs object game1 with parameters c and p
        Game game2 = new Game(); // constructs object game2 without passing anything in the parameters
        Scanner input = new Scanner(System.in);

        //Prints out the introduction
        String s = "Welcome to fighting simulator! \nIn this game you get to fight with either the computer or another player!";
        s += "\n \nThe rules are simple your health bar will have 40 points. \nWhoever has their health drop to 0 first loses.";
        s += "\nSo lets get started shall we?";

        System.out.println(s);

        //Asks the user who they want to play against (c or p)
        System.out.print("\nDo you want to play against the computer or player? "+ game1);
        String answer = input.nextLine();

        //passes the answer in the method gameAsk and prints out the players' names and their healthbars
        game1.gameAsk(answer);
        game1.showValues();


        answer = game1.getAnswer(); //it takes what the user wrote before on who they want to play against and sets it as the variable answer
        int healthBar1 = game1.getHealthBar1().length(); //sets the length of player1's healthbar to a variable
        int healthBar2 = game1.getHealthBar2().length(); // sets the length of player2's healthbar to a variable
        String compMove = ""; // variable to decide computers move
        String player2Move = ""; // variable to decide player2's move

        //This code is executed if the user inputted c and chose to play against the computer
        if (answer.equals("c")) {
            while (healthBar2 > 0 && healthBar1 > 0) { // this is looped as long as either players' healthbars are above 0
                System.out.print("\nChoose an attack (type the number): 1)Punch 2)Kick 3)Slap: ");
                String choice = input.nextLine();
                System.out.println();
                int choiceA = Integer.parseInt(choice); // converts what the user wrote from a string to an int

                //this segment is executed if the user inputted attack choice 1
                if (choiceA == 1) {
                    int attack1 = game2.getAttackVal1();
                    int attack2 = game2.compAttackVal();

                    //this portion sets the compMove variable to the attack type
                    if (attack2 >= 6 && attack2 <= 10) {
                        compMove = "punch";
                    }  else if (attack2 >= 11 && attack2 <= 20) {
                        compMove = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        compMove = "slap";
                    }

                    //it does the math and then prints out the attack and damage dealt
                    healthBar2 -= attack1;
                    healthBar1 -= attack2;
                    System.out.println(game1.getName1() + " chose punch! It dealt " + attack1 + " damage!");
                    System.out.println("Bot chose " + compMove + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print("Bot's health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }

                    //this segment is executed if the user inputted attack choice 2
                } else if (choiceA == 2) {
                    int attack1 = game2.getAttackVal2();
                    int attack2 = game2.compAttackVal();
                    healthBar2 -= attack1;
                    healthBar1 -= attack2;

                    //this portion sets the compMove variable to the attack type
                    if (attack2 >= 6 && attack2 <= 10) {
                        compMove = "punch";
                    }  else if (attack2 >= 11 && attack2 <= 20) {
                        compMove = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        compMove = "slap";
                    }

                    // prints out the attack and damage dealt
                    System.out.println(game1.getName1() + " chose kick! It dealt " + attack1 + " damage!");
                    System.out.println("Bot chose " + compMove + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print("Bot's health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }

                    //this segment is executed if the user inputted attack choice 3
                } else if (choiceA == 3) {
                    int attack1 = game2.getAttackVal3();
                    int attack2 = game2.compAttackVal();
                    healthBar2 -= attack1;
                    healthBar1 -= attack2;

                    //this portion sets the compMove variable to the attack type
                    if (attack2 >= 6 && attack2 <= 10) {
                        compMove = "punch";
                    }  else if (attack2 >= 11 && attack2 <= 20) {
                        compMove = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        compMove = "slap";
                    }

                    // prints out the attack and damage dealt
                    System.out.println(game1.getName1() + " chose slap! It dealt " + attack1 + " damage!");
                    System.out.println("Bot chose " + compMove + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print("Bot's health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }

                    //if the user does not input either 1 2 or 3
                } else {
                    int attack2 = game2.compAttackVal();
                    healthBar2 -= 0;
                    healthBar1 -= attack2;

                    if (attack2 >= 6 && attack2 <= 10) {
                        compMove = "punch";
                    }  else if (attack2 >= 11 && attack2 <= 20) {
                        compMove = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        compMove = "slap";
                    }

                    System.out.println("No attack was chosen! It dealt 0 damage!");
                    System.out.println("Bot chose " + compMove + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print("Bot's health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
            System.out.println();
            if (healthBar1 <= 0) {
                System.out.print("Computer won! You lost! You are an L!!"); //this gets printed if the comp won
                System.exit(0);
            } else {
                System.out.print("You won! You are a W!!"); // this gets printed if the user won
                System.exit(0);
            }
        }

        //This code is executed if the user inputted p and chose to play against the player
        if (answer.equals("p")) {
            while (healthBar2 > 0 && healthBar1 > 0) {
                System.out.print("\n" + game1.getName1() + " choose an attack (type the number): 1)Punch 2)Kick 3)Slap: ");
                String choice = input.nextLine();
                System.out.print("\n" + game1.getName2() + " choose an attack (type the number): 1)Punch 2)Kick 3)Slap: ");
                String choice2 = input.nextLine();
                System.out.println();
                int choiceA = Integer.parseInt(choice);
                int choiceA2 = Integer.parseInt(choice2);

                //this segment is executed if the user inputted attack choice 1
                if (choiceA == 1) {
                    int attack1 = game2.getAttackVal1();
                    int attack2 = game2.player2Attack(choiceA2);
                    healthBar2 -= attack1;
                    healthBar1 -= attack2;

                    //this portion sets the player2Move variable to the attack type
                    if (attack2 >= 6 && attack2 <= 10) {
                        player2Move = "punch";
                    } else if (attack2 >= 11 && attack2 <= 20) {
                        player2Move = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        player2Move = "slap";
                    }

                    // prints out the attack and damage dealt
                    System.out.println(game1.getName1() + " chose punch! It dealt " + attack1 + " damage!");
                    System.out.println(game1.getName2() + " chose " + player2Move + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print(game1.getName2() + " health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }

                    //this segment is executed if the user inputted attack choice 2
                } else if (choiceA == 2) {
                    int attack1 = game2.getAttackVal2();
                    int attack2 = game2.player2Attack(choiceA2);
                    healthBar2 -= attack1;
                    healthBar1 -= attack2;

                    //this portion sets the player2Move variable to the attack type
                    if (attack2 >= 6 && attack2 <= 10) {
                        player2Move = "punch";
                    } else if (attack2 >= 11 && attack2 <= 20) {
                        player2Move = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        player2Move = "slap";
                    }

                    // prints out the attack and damage dealt
                    System.out.println(game1.getName1() + " chose kick! It dealt " + attack1 + " damage!");
                    System.out.println(game1.getName2() + " chose " + player2Move + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print(game1.getName2() + " health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }

                    //this segment is executed if the user inputted attack choice 3
                } else if (choiceA == 3) {
                    int attack1 = game2.getAttackVal3();
                    int attack2 = game2.player2Attack(choiceA2);
                    healthBar2 -= attack1;
                    healthBar1 -= attack2;

                    //this portion sets the player2Move variable to the attack type
                    if (attack2 >= 6 && attack2 <= 10) {
                        player2Move = "punch";
                    } else if (attack2 >= 11 && attack2 <= 20) {
                        player2Move = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        player2Move = "slap";
                    }

                    // prints out the attack and damage dealt
                    System.out.println(game1.getName1() + " chose slap! It dealt " + attack1 + " damage!");
                    System.out.println(game1.getName2() + " chose " + player2Move + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print(game1.getName2() + " health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }

                    //if the user does not input either 1 2 or 3
                } else {
                    int attack2 = game2.player2Attack(choiceA2);
                    healthBar2 -= 0;
                    healthBar1 -= attack2;

                    if (attack2 >= 6 && attack2 <= 10) {
                        player2Move = "punch";
                    }  else if (attack2 >= 11 && attack2 <= 20) {
                        player2Move = "kick";
                    } else if (attack2 >= 1 && attack2 <= 5) {
                        player2Move = "slap";
                    }

                    System.out.println("No attack was chosen! It dealt 0 damage!");
                    System.out.println(game1.getName2() + " chose " + player2Move + "! It dealt " + attack2 + " damage!");
                    System.out.println();
                    System.out.print(game1.getName1() + "'s health: ");
                    for (int i = 1; i <= healthBar1; i++) {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.print(game1.getName2() + " health: ");
                    for (int i = 1; i <= healthBar2; i++) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
            System.out.println();
            if (healthBar1 <= 0) {
                System.out.print(game1.getName2()+ " won! " + game1.getName1()+ " lost! They are an L!!");//this gets printed if player2 won
                System.exit(0);
            } else {
                System.out.print(game1.getName1()+ " won! " + game1.getName2()+ " lost! They are an L!!");//this gets printed if player1 won
                System.exit(0);
            }
        }

    }
}



