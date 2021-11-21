package patern_of_patern;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private final List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        quackers.forEach(Quackable::quack);
    }
}