package rpgarena;
public class Arena {
    public static void main(String[] args) {

    Character player1 = new Character();
    Character player2 = new Character();

    player2.name = "Steve";
    player2.health = 50;
        System.out.println(player2.name);
        System.out.println(player1.name + " vs. " + player2.name);
        System.out.println(player1.health + " vs. " + player2.health);
    }
}