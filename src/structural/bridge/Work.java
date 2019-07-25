package structural.bridge;

public interface Work {
    void startsWorking();

    void doesBreak();

    void continuesWorking();

    void finishesWorking();

    Worker getWorker();
}
