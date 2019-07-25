package creational.factory_method;

public interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);

    Armor manufactureArmor(ArmorType armorType);
}
