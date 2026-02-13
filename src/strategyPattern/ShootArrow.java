package strategyPattern;

public class ShootArrow implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}

