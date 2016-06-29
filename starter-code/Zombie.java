/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster{

    public Zombie(int health, int damageRange, int baseDamage) {
        super(health, damageRange, baseDamage);
    }

    public Zombie(){
        super(30, 10, 10);
    }

    public String getName(){
        return "Zombie";
    }

    @Override
    public void takeDamage(int damage) {
        if((getHealth() - damage) <= 0){
            super.setHealth(1);
            System.out.println("Zombie rises again!");
            return;
        }
        super.takeDamage(damage);
    }

    @Override
    public String aboutMe() {
        return "I'm a Zombie with " + getHealth() + " health and this round I do " + getDamage() + " damage!";
    }
}
