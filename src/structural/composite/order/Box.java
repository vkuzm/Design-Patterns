package structural.composite.order;

import java.util.ArrayList;
import java.util.List;

public class Box extends BoxComposite {
    private final List<BoxComposite> boxes = new ArrayList<>();
    private final BoxSize boxSize;

    public Box(BoxSize boxSize) {
        this.boxSize = boxSize;
    }

    @Override
    public void add(BoxComposite packageComposite) {
        boxes.add(packageComposite);
    }

    @Override
    public void remove(BoxComposite boxComposite) {
        boxes.remove(boxComposite);
    }

    @Override
    public BoxComposite getChild(int index) {
        return boxes.get(index);
    }

    @Override
    public String getName() {
        return boxSize.getSize() + " box";
    }

    @Override
    public void print() {
        System.out.println("Box: " + getName());

        boxes.forEach(BoxComposite::print);
    }

    @Override
    public double getDeliveryPrice() {
        return boxes.stream()
            .map(BoxComposite::getDeliveryPrice)
            .reduce(Double::sum)
            .orElse(0d);
    }
}
