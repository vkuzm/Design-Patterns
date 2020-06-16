package structural.proxy.cache;

public class Cache implements CacheObject {
    private final String text;

    public Cache(String text) {
        this.text = text;
    }

    @Override
    public String get() {
       return text;
    }
}
