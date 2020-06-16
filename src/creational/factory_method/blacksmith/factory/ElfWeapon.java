package creational.factory_method.blacksmith.factory;

import creational.factory_method.blacksmith.Weapon;
import creational.factory_method.blacksmith.WeaponType;

public class ElfWeapon implements Weapon {
    private final WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
