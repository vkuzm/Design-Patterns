package creational.factory.blacksmith.factory;

import creational.factory.blacksmith.Weapon;
import creational.factory.blacksmith.WeaponType;

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
