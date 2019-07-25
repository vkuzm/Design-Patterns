package creational.factory_method.factory;

import creational.factory_method.Armor;
import creational.factory_method.ArmorType;

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
