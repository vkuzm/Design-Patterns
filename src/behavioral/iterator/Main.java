package behavioral.iterator;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[0] = new Person("Max");
        persons[1] = new Person("Peter");
        persons[2] = new Person("Nick");
        persons[3] = new Person("Alex");
        persons[4] = new Person("Victor");


        // Person iterator
        List<Person> listPerson = new PersonList(persons);
        Iterator<Person> iteratorPerson = listPerson.iterator();

        System.out.println("=== PERSON ITERATOR ===");
        while (iteratorPerson.hasNext()) {
            Person person = iteratorPerson.next();

            System.out.println(person.getName());
        }




        // String char iterator
        String[] chars = "HelloWorld".split("");

        List<String> listString = new StringCharList(chars);

        Iterator<String> iteratorString = listString.iterator();

        System.out.println("=== STRING CHARS ITERATOR ===");
        while (iteratorString.hasNext()) {
            String s = iteratorString.next();

            System.out.println(s);
        }
    }


}
