package structural.decoration;

public class MessageSystem implements Message {

    @Override
    public void show(String message) {
        System.out.println(message);
    }
}
