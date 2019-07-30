package behavioral.iterator;

public class StringCharList implements List<String> {

    private String[] chars;

    public StringCharList(String[] chars) {
        this.chars = chars;
    }

    @Override
    public Iterator<String> iterator() {
        return new StringCharIterator(chars);
    }
}
