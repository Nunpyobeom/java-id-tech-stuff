package tutorial;

import java.util.Scanner;
public class CharacterCreator {
    public static void main(String[] args) {
        Scanner playerInput;
        playerInput = new Scanner(System.in);
        String playerName;
        System.out.println("What is your characters name?");
        playerName = playerInput.nextLine();

        double playerHealth;
        System.out.println("How much health does " + playerName + " have?");
        playerHealth = playerInput.nextDouble();
        System.out.println("Welcome " + playerName + ". You have " + playerHealth + " health!BOb");
    }
}
