package behavioral.iterator;

public class PersonIterator implements Iterator<Person> {

    private Person[] array;
    private int position = 0;

    public PersonIterator(Person[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public Person currentItem() {
        return array[position];
    }

    @Override
    public Person next() {
        return array[position++];
    }
}
