package behavioral.command;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        TV tv = new TV();
        Switcher switcher = new Switcher();

        // Light is on
        switcher.setCommand(new LightOnCommand(light));
        switcher.execute();

        // Light is off
        switcher.setCommand(new LightOffCommand(light));
        switcher.execute();


        // TV is on
        switcher.setCommand(new TVOnCommand(tv));
        switcher.execute();

        // TV is off
        switcher.setCommand(new TVOffCommand(tv));
        switcher.execute();
    }
}
