package structural.composite.order;

public abstract class BoxComposite {
    public void add(BoxComposite boxComposite) {
        throw new UnsupportedOperationException();
    }

    public void remove(BoxComposite boxComposite) {
        throw new UnsupportedOperationException();
    }

    public BoxComposite getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public double getDeliveryPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
