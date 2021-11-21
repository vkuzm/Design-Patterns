package creational.factory.blacksmith.factory;

import creational.factory.blacksmith.Armor;
import creational.factory.blacksmith.ArmorType;

public class OrcArmor implements Armor {
    private final ArmorType armorType;

    public OrcArmor(ArmorType armorType) {
        this.armorType = armorType;
    }

    @Override
    public ArmorType getArmorType() {
        return armorType;
    }
}
