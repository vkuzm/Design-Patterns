package creational.factory_method.blacksmith.factory;

import creational.factory_method.blacksmith.Armor;
import creational.factory_method.blacksmith.ArmorType;
import creational.factory_method.blacksmith.Blacksmith;
import creational.factory_method.blacksmith.Weapon;
import creational.factory_method.blacksmith.WeaponType;

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
