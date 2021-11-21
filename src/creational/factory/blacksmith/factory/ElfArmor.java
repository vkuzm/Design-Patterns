package creational.factory.blacksmith.factory;

import creational.factory.blacksmith.Armor;
import creational.factory.blacksmith.ArmorType;

public class ElfArmor implements Armor {
    private final ArmorType armorType;

    public ElfArmor(ArmorType armorType) {
        this.armorType = armorType;
    }

    @Override
    public ArmorType getArmorType() {
        return armorType;
    }
}
