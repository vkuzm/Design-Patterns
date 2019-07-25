package structural.adapter;

public class LowercaseToUppercaseAdapter implements Lowercase {
    private final Uppercase uppercase;

    public LowercaseToUppercaseAdapter(Uppercase uppercase) {
        this.uppercase = uppercase;
    }

    @Override
    public String output() {
        return uppercase.output();
    }
}
