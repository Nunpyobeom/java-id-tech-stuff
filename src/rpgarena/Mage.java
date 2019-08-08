package rpgarena;

public class Mage extends Character {
    public int mana = 20;
    public Mage() {
        super();
        this.strength = 12;
        this.defense = 2;
        this.health = 100;

    }
    public int attack(Character target){
        int damage = this.strength * 2;
        if(mana < 100){
            mana += Arena.generator.nextInt(20);
            System.out.println(this.name +  " is ***Charging up mana***");
        } else{
            damage = 4*Arena.generator.nextInt(12);
            System.out.println("***MAGICAL MAGICAL MAGICLY MAGIC SPELL IS CAST***");
        }
        int damageDealt = target.takeDamage(damage);
        return damageDealt;


    }
}