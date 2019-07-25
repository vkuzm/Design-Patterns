package creational.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton.hashCode() == singleton2.hashCode()) {
            System.out.println("OK");
        }else{
            System.out.println("BAD");
        }

    }
}
