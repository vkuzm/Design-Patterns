package behavioral.command.remote2;

public class RemoteControlTest { // client

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); // invoker
        Light light = new Light(); // receiver
        LightOnCommand lightOn = new LightOnCommand(light); // command

        GarageDoor garageDoor = new GarageDoor(); // receiver
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor); // command

        remote.setCommand(lightOn);
        remote.buttonWasPressed(); // execute

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed(); // execute
    }
}
