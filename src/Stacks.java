import java.util.*;
public class Stacks {

    public static void main(String[] args) {
    String WordtoCheck = "tacocat";
    Stack word = new Stack();
    String reverseWord = "";
    for (int i = 0; i < WordtoCheck.length(); i++){
        word.push(WordtoCheck.charAt(i));
    }
    while (word.isEmpty() == false) {
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
