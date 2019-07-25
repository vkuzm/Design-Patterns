package creational.singleton_threadsafe;

public class Singleton {
    private volatile static Singleton INSTANCE;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {

            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }

            return INSTANCE;
        }

        System.out.println("Hashcode - " + INSTANCE.hashCode());

        return INSTANCE;
    }

}
