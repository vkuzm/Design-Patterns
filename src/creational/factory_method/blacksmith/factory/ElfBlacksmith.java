package creational.factory_method.blacksmith.factory;

import creational.factory_method.blacksmith.Armor;
import creational.factory_method.blacksmith.ArmorType;
import creational.factory_method.blacksmith.Blacksmith;
import creational.factory_method.blacksmith.Weapon;
import creational.factory_method.blacksmith.WeaponType;

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
