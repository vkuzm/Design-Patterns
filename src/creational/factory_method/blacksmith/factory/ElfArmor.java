package creational.factory_method.blacksmith.factory;

import creational.factory_method.blacksmith.Armor;
import creational.factory_method.blacksmith.ArmorType;

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
