package strategyPattern;

import java.util.Arrays;

public class Knight extends Character {
    public Knight() {
        this.setName("Knight");
        this.setAttackStrategy(new SwingSword());
        this.setDefenseStrategies(Arrays.asList(new Shield(), new Dodge(), new CreateMagic()));
    }
}
