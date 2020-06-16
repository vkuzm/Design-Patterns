package structural.proxy.cache;

import java.util.HashSet;
import java.util.Set;

public class ProxyCache implements CacheObject {
    private static Set<String> cacheText = new HashSet<>();
    private final Cache cache;

    public ProxyCache(Cache cache) {
        this.cache = cache;
    }

    @Override
    public String get() {
        String originalText = cache.get();

        if (!cacheText.isEmpty()) {
            for (String text : cacheText) {
                if (text.contains(originalText)) {
                    return text + " is cached";
                }
            }
        }

        cacheText.add(originalText);

        return originalText;
    }
}
