package behavioral.state.gumball_machine.state;

public class SoldOutState implements State {

    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Gumballs are out of stock");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Gumballs are out of stock");
    }

    @Override
    public void turnCrank() {
        System.out.println("Gumballs are out of stock");
    }

    @Override
    public void dispense() {
        System.out.println("Gumballs are out of stock");
    }
}
