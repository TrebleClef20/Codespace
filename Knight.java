public class Knight implements Type {

    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword!");
    }

    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
        System.out.println("Dodgin to avoid attack!");
        System.out.println("Creating a magic barrier for defense!");
    }

}
