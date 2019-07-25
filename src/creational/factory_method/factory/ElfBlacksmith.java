package creational.factory_method.factory;

import creational.factory_method.*;

public class ElfBlacksmith implements Blacksmith {

    public ElfBlacksmith() {
        System.out.println("Elf's blacksmith");
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }

    @Override
    public Armor manufactureArmor(ArmorType armorType) {
        return new ElfArmor(armorType);
    }
}
