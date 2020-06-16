package structural.decorator.message;

public class MessageDecorator implements Message {
    private final Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public void show(String text) {
        message.show(text);
    }
}
