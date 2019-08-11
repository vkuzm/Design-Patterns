package behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class TranslateToGermany implements Translator {

    private Map<String, String> words = new HashMap<>();

    {
        words.put("Bear", "Bär");
        words.put("Cat", "Katze");
        words.put("Dog", "Hund");
        words.put("Wolf", "Wolf");
    }

    @Override
    public String translate(String word) {
        return words.get(word);
    }
}
