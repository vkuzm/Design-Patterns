package structural.bridge;

public class Main {
    public static void main(String[] args) {
        ITCompany softwareEngineer = new ITCompany(new Programmer());
        softwareEngineer.startsWorking();
        softwareEngineer.doesBreak();
        softwareEngineer.continuesWorking();
        softwareEngineer.finishesWorking();
        System.out.println("--------------------------");


        ITCompany electrician = new ITCompany(new Electrician());
        electrician.startsWorking();
        electrician.doesBreak();
        electrician.continuesWorking();
        electrician.finishesWorking();
        System.out.println("--------------------------");


        Hospital doctor = new Hospital(new Doctor());
        doctor.startsWorking();
        doctor.doesBreak();
        doctor.continuesWorking();
        doctor.finishesWorking();
    }
}
