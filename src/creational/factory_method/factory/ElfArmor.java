package creational.factory_method.factory;

import creational.factory_method.Armor;
import creational.factory_method.ArmorType;

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
