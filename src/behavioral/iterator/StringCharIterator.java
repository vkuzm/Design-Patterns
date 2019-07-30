package behavioral.iterator;

public class StringCharIterator implements Iterator<String> {

    private String[] chars;
    private int position = 0;

    public StringCharIterator(String[] chars) {
        this.chars = chars;
    }

    @Override
    public boolean hasNext() {
        return position < chars.length;
    }

    @Override
    public String currentItem() {
        return chars[position];
    }

    @Override
    public String next() {
        return chars[position++];
    }
}
