package behavioral.mediator;

public class Main {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoomImpl();

        User user1 = new User(chatRoom, 1, "Max");
        User user2 = new User(chatRoom, 2, "Steven");
        User user3 = new User(chatRoom, 3, "Alex");
        User user4 = new User(chatRoom, 4, "Peter");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hi, Alex! What's up?", 3);
        user3.send("Hi, Peter! Everything okay!", 1);

    }
}
