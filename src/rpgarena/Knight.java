package rpgarena;

public class Knight extends Character {
    public Knight() {
        super();
        this.strength = 7;
        this.defense = 8;
        this.health = 120;

    }
    public int takeDamage( int damage ){
        boolean perfectBlock = Arena.generator.nextInt(100) < (health - 40);
        int damageTaken = damage - this.defense;
        if(perfectBlock == true){
            damageTaken = 0;
        }
        this.health -= damageTaken;
        return damageTaken;
    }
}

