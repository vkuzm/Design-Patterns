package structural.bridge;

public class Programmer implements Worker {

    @Override
    public void workingStuff() {
        System.out.println("Codes a program");
    }

    @Override
    public void endWorkingTime() {
        System.out.println("Finish working at 16:00");
    }

    @Override
    public void breakTime() {
        System.out.println("Takes a break about 1 hour");
    }

    @Override
    public String getProfession() {
        return this.getClass().getSimpleName();
    }

}
