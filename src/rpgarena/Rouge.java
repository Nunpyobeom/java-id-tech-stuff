package rpgarena;

public class Rouge extends Character {
    public int dexterity = 20;
    public Rouge() {
        super();
        this.strength = 15;
        this.defense = 0;
        this.health = 80;

    }
    public int attack(Character target){
        boolean criticalHit = Arena.generator.nextInt(100) < dexterity;
        int damage = this.strength * 2;
        if(criticalHit == true){
            damage *= 2;
            System.out.println("***Critical Hit***");
        }
        int damageDealt = target.takeDamage(damage);
        return damageDealt;


    }
}
