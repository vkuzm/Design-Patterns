package patern_of_patern;

public class GooseAdapter implements Quackable {
    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }
}