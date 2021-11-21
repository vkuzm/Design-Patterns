package creational.factory.blacksmith.factory;

import creational.factory.blacksmith.Armor;
import creational.factory.blacksmith.ArmorType;
import creational.factory.blacksmith.Blacksmith;
import creational.factory.blacksmith.Weapon;
import creational.factory.blacksmith.WeaponType;

public class OrcBlacksmith implements Blacksmith {

    public OrcBlacksmith() {
        System.out.println("Orc's blacksmith");
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }

    @Override
    public Armor manufactureArmor(ArmorType armorType) {
        return new OrcArmor(armorType);
    }
}
