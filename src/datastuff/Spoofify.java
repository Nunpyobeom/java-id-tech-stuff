package datastuff;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Spoofify {
    public static void main(String[] args) {
        Queue<String>playlist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to add a song or play another song\n");
            System.out.println("> Add (Type 1)");
            System.out.println("> Play Next (Type 2)");
            String input = scanner.nextLine();
            if (input.equals("1")){
                System.out.println("Please enter what song you would like to add: ");
                String song = scanner.nextLine();
                System.out.println(song + " was added");
                playlist.add(song);
            }
            else if (input.equals("2")) {
                System.out.println("Song played: " + playlist.remove());
            }
            else{
                System.out.println("Could not read input...");
                System.out.println("You said: " + input);
            }
        }
    }
}
