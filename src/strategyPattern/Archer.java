package strategyPattern;

import java.util.Arrays;

public class Archer extends Character {
    public Archer() {
        this.setName("Archer");
        this.setAttackStrategy(new ShootArrow());
        this.setDefenseStrategies(Arrays.asList(new Dodge()));
    }
}