public class Character {
    private Type type;

    public Character(Type type) {
        this.type = type;
    }

    public void attack() {
        type.attack();
    }

    public void defend() {
        type.defend();
    }
}
