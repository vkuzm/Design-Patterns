package creational.factory.blacksmith.factory;

import creational.factory.blacksmith.Armor;
import creational.factory.blacksmith.ArmorType;
import creational.factory.blacksmith.Blacksmith;
import creational.factory.blacksmith.Weapon;
import creational.factory.blacksmith.WeaponType;

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
