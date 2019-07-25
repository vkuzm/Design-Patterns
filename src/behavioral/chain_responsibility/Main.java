package behavioral.chain_responsibility;

public class Main {
    public static void main(String[] args) {

        Filter filterEmpty = new FilterEmpty();
        Filter filterLength = new FilterLength();
        Filter filterSpam = new FilterSpam();

        // Make a chain
        filterEmpty.next(filterLength);
        filterLength.next(filterSpam);

        // Call a chain
        filterEmpty.process("");
        filterEmpty.process("This is not a fraud!");
        filterEmpty.process("small text");
    }
}
