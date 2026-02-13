package strategyPattern;

import java.util.List;

public class Character {
    private String name;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character() {
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategies(List<DefenseStrategy> defenseStrategies) {
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}