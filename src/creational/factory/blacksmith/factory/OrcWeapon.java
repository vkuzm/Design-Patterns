package creational.factory.blacksmith.factory;

import creational.factory.blacksmith.Weapon;
import creational.factory.blacksmith.WeaponType;

public class OrcWeapon implements Weapon {

    private final WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
