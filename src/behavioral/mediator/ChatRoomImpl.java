package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomImpl implements ChatRoom {
    private Map<Integer, User> users = new HashMap<>();

    @Override
    public void sendMessage(String message, Integer senderId, Integer receiverId) {
        User sender = users.get(senderId);
        User receiver = users.get(receiverId);

        receiver.receive(message, sender);
    }

    @Override
    public void addUser(User user) {
        users.put(user.getId(), user);
    }
}
