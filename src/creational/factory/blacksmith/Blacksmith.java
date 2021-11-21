package creational.factory.blacksmith;

public interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);

    Armor manufactureArmor(ArmorType armorType);
}
