package strategyPattern;

public class Shield implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
    }
}