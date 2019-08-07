package tutorial;

import java.util.Random;

public class Treasure {
    public static void main(String[] args) {
        Random generator = new Random();
        int gold = generator.nextInt(5);
        System.out.println("You open a chest to find " + gold + " gold pieces");
    }
}
