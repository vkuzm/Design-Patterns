package structural.bridge;

public class Doctor implements Worker {

    @Override
    public void workingStuff() {
        System.out.println("Treats a patient");
    }

    @Override
    public void endWorkingTime() {
        System.out.println("Finish working at 20:00");
    }

    @Override
    public void breakTime() {
        System.out.println("Takes a break about 40 minutes");
    }

    @Override
    public String getProfession() {
        return this.getClass().getSimpleName();
    }

}
