package structural.bridge.workers;

public class ITCompany implements Work {
    private final Worker worker;

    public ITCompany(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void startsWorking() {
        System.out.println(worker.getProfession() + " starts working");

        worker.workingStuff();
    }

    @Override
    public void doesBreak() {
        System.out.println(worker.getProfession() + " takes a break");

        worker.breakTime();
    }

    @Override
    public void continuesWorking() {
        System.out.println(worker.getProfession() + " continues working");

        worker.workingStuff();
    }

    @Override
    public void finishesWorking() {
        System.out.println(worker.getProfession() + " finish working");

        worker.endWorkingTime();
    }

    @Override
    public Worker getWorker() {
        return worker;
    }
}
