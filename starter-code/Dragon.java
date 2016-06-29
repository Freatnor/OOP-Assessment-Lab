/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{

    public Dragon(int health, int damageRange, int baseDamage) {
        super(health, damageRange, baseDamage);
    }

    public Dragon(){
        super(100, 20, 35);
    }

    public String getName(){
        return "Dragon";
    }

    @Override
    public String aboutMe() {
        if(getHealth() <= 0) return "Dragon dies!";
        return "I'm a dragon with " + getHealth() + " health and this round I do " + getDamage() + " damage!";
    }
}
