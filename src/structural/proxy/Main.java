package structural.proxy;

public class Main {
    public static void main(String[] args) {

        CacheObject cache = new ProxyCache(new Cache("Example text"));
        CacheObject cache2 = new ProxyCache(new Cache("Example text"));
        CacheObject cache3 = new ProxyCache(new Cache("Example text"));
        CacheObject cache4 = new ProxyCache(new Cache("Example text text"));

        System.out.println(cache.get());
        System.out.println(cache2.get());
        System.out.println(cache3.get());
        System.out.println(cache4.get());

    }
}
