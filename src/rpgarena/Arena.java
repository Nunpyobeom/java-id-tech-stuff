package rpgarena;
import java.util.Random;
public class Arena {

    public static  Random generator = new Random();

    public static void main(String[] args){
        Character player1 = new Character(10, 2, 100);
        Character player2 = new Character();


        System.out.println(player1.name + " vs. " + player2.name);
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