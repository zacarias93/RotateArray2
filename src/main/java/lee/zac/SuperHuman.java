package lee.zac;

/**
 * Created by zaclee on 9/14/16.
 */
public class SuperHuman extends Human {

    private String heroName;
    private String side;
    private String superAbility;

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getSide() {
        return side;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
