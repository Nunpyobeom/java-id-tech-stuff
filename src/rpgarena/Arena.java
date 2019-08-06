package rpgarena;
public class Arena {

    public static void main(String[] args){
        Character player1 = new Character();
        Character player2 = new Character();

        player1.name = "Billy Bob";
        player1.strength = 2;
        player1.health = 50;
        player1.defense = 1;
        player2.name = "Steve";
        player2.strength = 1;
        player2.health = 50;
        player2.defense = 2;

        System.out.println(player1.name + " vs. " + player2.name);
        System.out.println(player1.health + " vs. "  + player2.health);
        while(player1.isAlive() && player2.isAlive()){
            System.out.println(player1.name + ": " + player1.health);
            System.out.println(player2.name + " has: " + player2.health);
            player1.attack(player2);
            player2.attack(player1);
        }
    }

}