package creational.factory_method.factory;

import creational.factory_method.*;

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
