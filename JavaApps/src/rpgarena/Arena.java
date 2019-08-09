package rpgarena;
import java.util.Random;
import java.util.Scanner;
public class Arena {

    public static  Random generator = new Random();

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);

        System.out.println("Player 1\nPlease choose a class:\n1 - Knight\n2 - Mage\n3 - Rouge");
        int playerClass = userInput.nextInt();

        Character player1;
        if (playerClass == 1) {
            player1 = new Knight();
        }
        else if (playerClass == 2) {
            player1 = new Mage();
        }
        else {
            player1 = new Rouge();
        }

        System.out.println("Player 2\nPlease choose a class:\n1 - Knight\n2 - Mage\n3 - Rouge");
        int playerClass2 = userInput2.nextInt();
        Character player2;
        if (playerClass2 == 1) {
            player2 = new Knight();
        }
        else if (playerClass2 == 2) {
            player2 = new Mage();
        }
        else {
            player2 = new Rouge();
        }

        System.out.println(player1.name + "(player 1) vs. " + player2.name + " (player2)");
        System.out.println(player1.health + " vs. "  + player2.health);
        while(player1.isAlive() && player2.isAlive()){
            int damage;
            int damage2;
            damage = player1.attack(player2);
            System.out.println(player1.name + " hits " + player2.name + " for " + damage + " damage");

            damage2 = player2.attack(player1);
            System.out.println(player2.name + " hits " + player1.name + " for " + damage2 + " damage");
            System.out.println(player1.name + " has: " + player1.health + " health");
            System.out.println(player2.name + " has: " + player2.health + " health");
            player1.attack(player2);
            player2.attack(player1);
        }
    }

}