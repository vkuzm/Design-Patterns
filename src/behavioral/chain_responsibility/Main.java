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
    System.out.println("#1 try");
    filterEmpty.process("");

    System.out.println("#2 try");
    filterEmpty.process("This is not a fraud!");

    System.out.println("#3 try");
    filterEmpty.process("small text");

    System.out.println("#4 try");
    filterEmpty.process("This is text that is good!");
  }
}
