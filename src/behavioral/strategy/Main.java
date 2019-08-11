package behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        // Translates words: Bear, Cat, Wolf, Dog
        // From english to other languages

        TranslatorContext translator = new TranslatorContext();

        // To germany
        translator.setLanguage(new TranslateToGermany());
        translator.translate("Bear");
        translator.translate("Cat");

        // To spanish
        translator.setLanguage(new TranslateToSpanish());
        translator.translate("Wolf");
        translator.translate("Dog");

        // To japanese
        translator.setLanguage(new TranslateToJapanese());
        translator.translate("Bear");
        translator.translate("Cat");
        translator.translate("Dog");
    }
}
