package tutorial;

public class DragonSlayer {
    public static void main(String[] args) {
        int playerStrength = 30;
        int dragonHP = 35;
        boolean hasSword = true;
        if (playerStrength > dragonHP){
            System.out.println("You defeated the dragon!!! YAY!");

        } else if(hasSword){
            System.out.println("You used your OP magic sword to beat the drgaon even though you are very weak!");
        }
        else {
            System.out.println("You became food for the dragon!!! RIP....");
        }
    }
}
