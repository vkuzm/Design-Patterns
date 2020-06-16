package structural.bridge.workers;

public interface Work {
    void startsWorking();

    void doesBreak();

    void continuesWorking();

    void finishesWorking();

    Worker getWorker();
}
