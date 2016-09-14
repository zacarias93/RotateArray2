package lee.zac;

/**
 * Created by zaclee on 9/14/16.
 */
public class App {

    public static void main(String[] args) {
        Human zac = new Human();
        Human ryan = new Human();
        Human chris = new Human();
        SuperHuman ZAC = new SuperHuman();
        SuperHuman RYAN = new SuperHuman();
        SuperHuman CHRIS = new SuperHuman();

        ZAC.setHeroName("SuperMan");
        System.out.println(ZAC.getHeroName());
        RYAN.setSuperAbility("Flying");
        System.out.println(RYAN.getSuperAbility());
        CHRIS.setSide("Dark");
        System.out.println(CHRIS.getSide());
        ZAC.setAge(22);
        System.out.println(ZAC.getAge());
        CHRIS.setGender("Male");
        System.out.println(CHRIS.getGender());
        RYAN.setOccupation("Consultant");
        System.out.println(RYAN.getOccupation());

    }
}
