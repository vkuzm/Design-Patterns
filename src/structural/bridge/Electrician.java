package structural.bridge;

public class Electrician implements Worker {

    @Override
    public void workingStuff() {
        System.out.println("Repairs a wiring");
    }

    @Override
    public void endWorkingTime() {
        System.out.println("Finish working at 18:00");
    }

    @Override
    public void breakTime() {
        System.out.println("Takes a break about 30 minutes");
    }

    @Override
    public String getProfession() {
        return this.getClass().getSimpleName();
    }

}
