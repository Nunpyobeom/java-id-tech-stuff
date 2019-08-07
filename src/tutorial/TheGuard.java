package tutorial;

import java.util.Scanner;

public class TheGuard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        int playerClass = userInput.nextInt();
        System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Intimidate the guard\n6 - Bond with the guard over your shared disdain for magic");
        int playerChoice = userInput.nextInt();

        if (playerClass == 1 &&playerChoice == 1) {
            System.out.println("You win and beat the guard... GG EZ");
        } else if(playerClass == 2 && playerChoice == 2) {
            System.out.println("You steal the guards wallet with ease... EZY money");
        } else if(playerClass == 3 && playerChoice == 3) {
            System.out.println("You shoot a fireball and the Gaurd runs for his life!!! Magic is overpowered");
        } else if((playerClass == 2 || playerClass == 3) && playerChoice == 4){
            System.out.println("The guard is stupid so he leaves....");
        } else if((playerClass == 1 || playerClass == 3) && playerChoice == 5){
            System.out.println("Your scary!!! The guard runs for his life!  ");
        } else if (!(playerClass == 3) && playerChoice == 6) {
            System.out.println("Magic sucks... ya I agree...  Woah friends!!!");
        }



        userInput.close();
    }

}