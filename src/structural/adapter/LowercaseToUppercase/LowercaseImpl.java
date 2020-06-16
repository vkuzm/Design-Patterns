package structural.adapter.LowercaseToUppercase;

public class LowercaseImpl implements Lowercase {
    private final Lowercase lowercase;

    public LowercaseImpl(Lowercase lowercase) {
        this.lowercase = lowercase;
    }

    @Override
    public String output() {
        return lowercase.output();
    }
}
