package structural.decorator.message;

import static structural.decorator.message.Colors.ANSI_RESET;

public class ErrorMessage extends MessageDecorator{
    public ErrorMessage(Message message) {
        super(message);
    }

    @Override
    public void show(String text) {
        super.show(Colors.ANSI_RED + text + ANSI_RESET);
    }
}
