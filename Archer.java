public class Archer implements Type {

    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }

    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
    }

}
