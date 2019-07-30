package behavioral.mediator;

public class User {
    private int id;
    private String name;
    private ChatRoom chatRoom;

    public User(ChatRoom chatRoom, int id, String name) {
        this.chatRoom = chatRoom;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void send(String message, Integer receiverId) {
        System.out.println(this.getName() + " sent a message: " + message);
        chatRoom.sendMessage(message, this.getId(), receiverId);
    }

    public void receive(String message, User sender) {
        System.out.println(this.getName()
                + " received a message from " + sender.getName() + ": " + message);
    }
}
