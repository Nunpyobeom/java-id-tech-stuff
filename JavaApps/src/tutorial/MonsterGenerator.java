package tutorial;

import java.util.Random;
public class MonsterGenerator {

    public static void main(String[] args) {
        String[] monsters = { "Ghost", "Goblin", "Ghoul" };

        monsters[2] = "Golem";
        Random generator = new Random();
        int monsterIndex = generator.nextInt(monsters.length);
        String monster;
        monster = monsters[monsterIndex];

        System.out.println(monsters[0]);
        System.out.println(monsters[1]);
        System.out.println(monsters[2]);

        System.out.println("There are " + monsters.length + " possible monsters.");
        System.out.println("The last element is: " + monsters[monsters.length - 1]);
        System.out.println("A " + monster + " has appeared!!!");
    }

}