package structural.adapter;

public class UppercaseImpl implements Uppercase {
    private final String text;

    public UppercaseImpl(String text) {
        this.text = text;
    }

    @Override
    public String output() {
        return toUpper(this.text);
    }

    @Override
    public String toUpper(String text) {
        return text.toUpperCase();
    }
}
