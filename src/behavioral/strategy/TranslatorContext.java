package behavioral.strategy;

public class TranslatorContext {

    private Translator translator;

    public void setLanguage(Translator translator) {
        this.translator = translator;
    }

    public void translate(String word) {
        String translatedText = translator.translate(word);

        System.out.println(word + " -> " + translatedText);
    }
}
