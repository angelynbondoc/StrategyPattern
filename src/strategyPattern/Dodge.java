package strategyPattern;

public class Dodge implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Dodging to avoid attack!");
    }
}