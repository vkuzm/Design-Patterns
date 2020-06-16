package creational.factory_method.blacksmith.factory;

import creational.factory_method.blacksmith.Armor;
import creational.factory_method.blacksmith.ArmorType;

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
