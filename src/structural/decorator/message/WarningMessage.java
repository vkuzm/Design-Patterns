package structural.decorator.message;

import static structural.decorator.message.Colors.ANSI_RESET;

public class WarningMessage extends MessageDecorator{
    public WarningMessage(Message message) {
        super(message);
    }

    @Override
    public void show(String text) {
        super.show(Colors.ANSI_YELLOW + text + ANSI_RESET);
    }
}
