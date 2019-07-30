package behavioral.iterator;

public class PersonList implements List<Person> {

    private Person[] persons;

    public PersonList(Person[] persons) {
        this.persons = persons;
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator(persons);
    }
}
