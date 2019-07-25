package behavioral.chain_responsibility;

public interface Filter {
    void next(Filter filter);

    void process(String text);
}
