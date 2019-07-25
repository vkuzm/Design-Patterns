package creational.factory_method.factory;

import creational.factory_method.Weapon;
import creational.factory_method.WeaponType;

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
