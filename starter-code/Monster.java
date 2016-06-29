/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables
    private int mHealth;
    private int mDamageRange;
    private int mBaseDamage;

    public Monster(int health, int damageRange, int baseDamage){
        mHealth = health;
        mDamageRange = damageRange;
        mBaseDamage = baseDamage;
    }

    public Monster(){
        mHealth = 1;
        mDamageRange = 4;
        mBaseDamage = 1;
    }

    public int getHealth(){
        return mHealth;
    }

    public void takeDamage(int damage){
        mHealth -= damage;
    }

    public int getDamage(){
        return mBaseDamage + (int) (Math.random() * mDamageRange);
    }

    public void setHealth(int health) {
        mHealth = health;
    }

    public abstract String aboutMe();

    public abstract String getName();
}
