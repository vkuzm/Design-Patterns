package structural.decorator;

public class Main {
    public static void main(String[] args) {

        // The message for showing
        String messageText = "This is a message in console!";

        // The message system for showing message
        // Show normal text and color
        Message messageSystem = new MessageSystem();
        messageSystem.show(messageText);

        // Show notice message with cyan color
        noticeMessage(messageText);

        // Show warning message with yellow color
        warningMessage(messageText);

        // Show error message with red color
        ErrorMessage(messageText);

        // Show error message with red color and uppercase chars
        errorUppercaseMessage(messageText);

        // Show warning message with red color and uppercase and reversed chars
        errorUppercaseReversedMessage(messageText);
    }

    private static void errorUppercaseReversedMessage(String messageText) {
        Message messageSystem = new MessageSystem();
        Message errorMessage = new ErrorMessage(messageSystem);
        Message uppercaseErrorMessage = new UppercaseMessage(errorMessage);

        Message errorUppercaseReversedMessage = new ReverseMessage(uppercaseErrorMessage);
        errorUppercaseReversedMessage.show(messageText);
    }

    private static void errorUppercaseMessage(String messageText) {
        Message messageSystem = new MessageSystem();
        Message errorMessage = new ErrorMessage(messageSystem);
        Message errorUppercaseMessage = new UppercaseMessage(errorMessage);
        errorUppercaseMessage.show(messageText);
    }

    private static void ErrorMessage(String messageText) {
        Message messageSystem = new MessageSystem();
        Message errorMessage = new ErrorMessage(messageSystem);
        errorMessage.show(messageText);
    }

    private static void warningMessage(String messageText) {
        Message messageSystem = new MessageSystem();
        Message warningMessage = new WarningMessage(messageSystem);
        warningMessage.show(messageText);
    }

    private static void noticeMessage(String messageText) {
        Message messageSystem = new MessageSystem();
        Message noticeMassage = new NoticeMessage(messageSystem);
        noticeMassage.show(messageText);
    }
}
