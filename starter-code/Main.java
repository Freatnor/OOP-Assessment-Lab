import java.util.ArrayList;
import java.util.List;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)

        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Dragon());
        monsters.add(new Zombie());


        //TODO: Loop through the array of Monsters, printing out something for each Monster


        for (int i = 0; i < 20; i++) {
            System.out.println("Round " + i);
            for (Monster m: monsters) {
                if(m.getHealth() > 0){
                    int damage = 10 + (int) (Math.random() * 10);
                    System.out.println("You deal " + damage + " damage to " + m.getName() + "!");
                    m.takeDamage(damage);
                    System.out.println(m.aboutMe());
                }
            }
            System.out.println();

        }


    }
}
