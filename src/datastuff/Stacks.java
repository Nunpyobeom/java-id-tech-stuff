package datastuff;

import java.util.*;
import java.util.Scanner;
public class Stacks {

    public static void main(String[] args) {
        Scanner koolthing =  new Scanner(System.in);
        System.out.println("Please enter your word:");

        String WordtoCheck = koolthing.nextLine();
        Stack word = new Stack();
        String reverseWord = "";
        for (int i = 0; i < WordtoCheck.length(); i++){
            word.push(WordtoCheck.charAt(i));
        }
        while (!word.isEmpty()) {
            reverseWord = reverseWord + word.pop();
        }
        if (WordtoCheck.equals(reverseWord)) {
            System.out.println("YAY IT'S A PALINDROME!!!");
        }
        else{
            System.out.println("Oh NOOOOOOOOES IT'S NOT A PALINDROME!!!");
        }
    }
}
