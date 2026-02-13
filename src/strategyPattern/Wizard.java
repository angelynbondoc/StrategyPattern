package strategyPattern;

import java.util.Arrays;

public class Wizard extends Character {
    public Wizard() {
        this.setName("Wizard");
        this.setAttackStrategy(new CastSpell());
        this.setDefenseStrategies(Arrays.asList(new CreateMagic()));
    }
}
