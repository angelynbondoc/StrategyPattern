package strategyPattern;

public class SwingSword implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword!");
    }
}