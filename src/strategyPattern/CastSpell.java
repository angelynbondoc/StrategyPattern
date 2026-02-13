package strategyPattern;

public class CastSpell implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}

