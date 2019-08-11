package behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class TranslateToSpanish implements Translator {

    private Map<String, String> words = new HashMap<>();

    {
        words.put("Bear", "Oso");
        words.put("Cat", "Gato");
        words.put("Dog", "Perro");
        words.put("Wolf", "Lobo");
    }

    @Override
    public String translate(String word) {
        return words.get(word);
    }
}
