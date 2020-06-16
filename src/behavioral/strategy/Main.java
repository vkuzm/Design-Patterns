package behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        // Translates words: Bear, Cat, Wolf, Dog
        // From english to other languages
        TranslatorContext translator = new TranslatorContext();

        System.out.println("to Germany");
        translator.setLanguage(new TranslateToGermany());
        translator.translate("Bear");
        translator.translate("Cat");

        System.out.println("\nto Spanish");
        translator.setLanguage(new TranslateToSpanish());
        translator.translate("Wolf");
        translator.translate("Dog");

        System.out.println("\nto Japanese");
        translator.setLanguage(new TranslateToJapanese());
        translator.translate("Bear");
        translator.translate("Cat");
        translator.translate("Dog");
    }
}
