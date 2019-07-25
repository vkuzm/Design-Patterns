package structural.adapter;

public class Main {
    public static void main(String[] args) {

        // We have the lowercase text and pass it to the uppercase interface
        Uppercase uppercase = new UppercaseImpl("This is a lowercase text for the example!");

        // Then adapt it to the lowercase interface via the adapter
        Lowercase lowerToUpperAdapter = new LowercaseToUppercaseAdapter(uppercase);

        // After that show the uppercase text in the lowercase interface
        LowercaseImpl lowercase = new LowercaseImpl(lowerToUpperAdapter);
        System.out.println(lowercase.output());
    }
}
