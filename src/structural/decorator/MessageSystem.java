package structural.decorator;

public class MessageSystem implements Message {

    @Override
    public void show(String message) {
        System.out.println(message);
    }
}
