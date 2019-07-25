package behavioral.chain_responsibility;

public class FilterEmpty implements Filter {

    private Filter nextFilter;

    @Override
    public void next(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    @Override
    public void process(String text) {
        if (text.length() == 0) {
            System.out.println("The text is empty!");

        } else if (nextFilter != null) {
            nextFilter.process(text);
        }
    }
}
