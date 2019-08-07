package tutorial;

public class CheckInventory {

    public static void main(String[] args) {
        String[] inventory = new String[5];
        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Wooden Shield";
        printInventory(inventory);
    }

    public static boolean checkInventory(String[] inventory, String toCheck){
        for(int i = 0; i < inventory.length; i++){
            String item = inventory[i];
        }
        return false;
    }

    public static void printInventory(String[] inventory){
        for(int i = 0; i < inventory.length; i++){
            System.out.println(inventory[i]);
        }
    }

}