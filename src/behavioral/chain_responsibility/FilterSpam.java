package behavioral.chain_responsibility;

public class FilterSpam implements Filter {

    private Filter nextFilter;

    @Override
    public void next(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    @Override
    public void process(String text) {
        String[] spamWords = {"spam", "fraud"};
        String[] splitText = text.split(" ");

        boolean foundSpamWords = false;

        for (String t : splitText) {
            for (String sw : spamWords) {
                if (t.contains(sw)) {
                    foundSpamWords = true;
                }
            }
        }

        if (foundSpamWords) {
            System.out.println("Found SPAM words!");

        } else if (nextFilter != null) {
            nextFilter.process(text);
        }
    }
}
