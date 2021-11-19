package behavioral.template_method;

public class PublicTransportRoute extends FindRoute {

    @Override
    public void calculateDistance() {
        super.distance = super.to.length() + super.from.length();
    }

    @Override
    public String getName() {
        return "public transport";
    }
}
