package structural.decorator;

import static structural.decorator.Colors.ANSI_RESET;

public class NoticeMessage extends MessageDecorator {
    public NoticeMessage(Message message) {
        super(message);
    }

    @Override
    public void show(String text) {
        super.show(Colors.ANSI_CYAN + text + ANSI_RESET);
    }
}
