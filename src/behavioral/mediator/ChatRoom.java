package behavioral.mediator;

public interface ChatRoom {
    void sendMessage(String message, Integer senderId, Integer receiverId);

    void addUser(User user);
}
