package behavioral.template_method;

public class CarRoute extends FindRoute {

    @Override
    public void calculateDistance() {
        super.distance = super.to.length() + super.from.length();
    }

    @Override
    public String getName() {
        return "car";
    }
}
