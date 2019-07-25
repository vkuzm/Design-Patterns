package behavioral.chain_responsibility;

public class FilterLength implements Filter {

    private Filter nextFilter;

    @Override
    public void next(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    @Override
    public void process(String text) {
        if (text.length() < 15) {
            System.out.println("Chars of the text must be bigger then 15!");

        } else if (nextFilter != null) {
            nextFilter.process(text);
        }
    }
}
