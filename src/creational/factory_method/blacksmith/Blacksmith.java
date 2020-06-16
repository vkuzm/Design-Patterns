package creational.factory_method.blacksmith;

public interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);

    Armor manufactureArmor(ArmorType armorType);
}
