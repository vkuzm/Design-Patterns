package behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class TranslateToJapanese implements Translator {

    private Map<String, String> words = new HashMap<>();

    {
        words.put("Bear", "くま");
        words.put("Cat", "ネコ");
        words.put("Dog", "犬");
        words.put("Wolf", "狼");
    }

    @Override
    public String translate(String word) {
        return words.get(word);
    }
}
