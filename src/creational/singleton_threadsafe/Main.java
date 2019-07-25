package creational.singleton_threadsafe;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 40; i++) {
            generateThreads();
        }

    }

    private static void generateThreads() {
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                Singleton.getInstance();
            }
        };

        thread.run();
    }

}
