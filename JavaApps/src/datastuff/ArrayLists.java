package datastuff;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("This is a string.");
        list.add("This is not a string");
        list.add("This is list.add u stupidoes");

        System.out.println("The List");

        for(String element : list){
            System.out.println(element);
        }
        System.out.println("This is the 2nd term in the list: ");
        System.out.println(list.get(1));
        Integer i = 10;
        Double d = 23.5;
        i = i.intValue() + 5;
        d = d.doubleValue() + 2.2;
    }

}
