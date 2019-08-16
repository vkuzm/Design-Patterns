package structural.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseMessage extends MessageDecorator {
    public ReverseMessage(Message message) {
        super(message);
    }

    @Override
    public void show(String text) {
        List<Character> characters = stringCharList(text);
        Collections.reverse(characters);
        String result = listString(characters);

        super.show(result);
    }

    @SuppressWarnings("Duplicates")
    private static List<Character> stringCharList(String str) {
        char[] chars = str.toCharArray();

        List<Character> reversed = new ArrayList<>();
        for (char character : chars) {
            reversed.add(character);
        }

        return reversed;
    }

    private static String listString(List<Character> reversed) {
        StringBuilder builder = new StringBuilder();
        for (char character : reversed) {
            builder.append(character);
        }

        return builder.toString();
    }

}
