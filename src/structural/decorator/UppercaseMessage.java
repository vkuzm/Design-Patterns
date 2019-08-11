package structural.decoration;

public class UppercaseMessage extends MessageDecorator {
    public UppercaseMessage(Message message) {
        super(message);
    }

    @Override
    public void show(String text) {
        super.show(text.toUpperCase());
    }
}
