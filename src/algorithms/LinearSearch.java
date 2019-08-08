package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] entries= {32, 14, 89, 62, 10, 20, 88, 40, 22,  91, 88, 65};
        System.out.println("Entry " + linearSearch(entries,88) + " is the winner");
    }
    public static int linearSearch(int values[], int key){
        for (int i = 0; i <values.length; i++){
            if (values[i] == key){
                return i + 1;
            }
        }
        return -1;
    }

}
