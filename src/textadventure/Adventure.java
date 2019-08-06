package textadventure;

import java.util.Scanner;
import java.util.Random;
public class Adventure {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int playerLevel = 5;
        boolean hasSword = false;
        int rockDamage = randomGenerator.nextInt(5);
        double playerHealth = 10.0;
        String playerName;
        int playerChoice;
        Scanner userinput = new Scanner(System.in);
        System.out.println("What is your character name? ");
        playerName = userinput.nextLine();
        System.out.println("Welcome " + playerName + "!");
        System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");
        System.out.println("1: Enter the Cave of Wonders");
        System.out.println("2: RUN!!!");
        playerChoice = userinput.nextInt();
        if (playerChoice == 1) {
            //Player decides to enter
            System.out.println("You made it into the entrance of the cave.");
            playerLevel++;
            System.out.println("You are not a scardy cat!!! You have been rewarded with an additional level. You are now level " + playerLevel);
            System.out.println("You are walking forward in the dark cave.... SUDDENLY you feel something brush against you...\nIt's a TRAP!!! Rocks bombard you from the ceiling...");
            playerHealth -= rockDamage;
            System.out.println("The rock slide hits you for " + rockDamage + " damage");
            System.out.println("You have " + playerHealth + " health remaining");
            System.out.println("You get up and brush off a cloud of dust from your clothes.");
            System.out.println("The cave narrows as you press on and you barely manage to squeeze through into a large natural cavern\nBefore you is a treasure chest!!!");
            System.out.println("1. Open the chest!");
            System.out.println("2. Ignore the chest... it looks pretty suspicious...");
            playerChoice = userinput.nextInt();
            if (playerChoice == 1) {
                System.out.println("Uneasy since this chest is really suspicious... " + playerName + " opens the chest!\nInside the chest is a GIANT SPIDER and you are going to die!!!\nHaha jk we lied... inside was a glittering magical sword!!!");
                hasSword = true;
                System.out.println("You leave the cavern with the chest and continue your journey");
                System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
                System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
                System.out.println("You swallow hard and decide it is time to leave.");
                System.out.println("As you turn, your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");
                System.out.println("1. Fight the Dragon.");
                System.out.println("2. Run for your life.");
            }
            playerChoice = userinput.nextInt();
            if(playerChoice == 1) {
                //fights dragon
                    System.out.println("You feel courage surge through your body as you charge the dragon!");
                    if(hasSword = true){
                        System.out.println("You raise the magic sword and plunge it into the dragon, slaying the beast.");
                    }  else {
                        System.out.println("You pummel the dragon with your fists to no avail. The dragon snarls and swallows you whole. Game Over!");
                        System.exit(0);
                    }

            }else{
                System.out.println("As you run away to hide in the safety of your warm bed, the dragon yawns and returns to its slumber.");
                //runs
                System.exit(0);
                }


        } else {
            System.out.println(playerName + " runs away.... You are a weakling....\nGAME OVER");
            System.exit(0);
            // The player is a scardey cat

        }
    }
}
