package creational.factory_method.blacksmith;

import creational.factory_method.blacksmith.factory.ElfBlacksmith;
import creational.factory_method.blacksmith.factory.OrcBlacksmith;

public class Main {
    public static void main(String[] args) {
        elfBlacksmith();

        System.out.println("-----------------");

        orcBlacksmith();
    }

    private static void elfBlacksmith() {
        Blacksmith blacksmith = new ElfBlacksmith();

        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        Armor armor = blacksmith.manufactureArmor(ArmorType.HELMET);
        Armor armor2 = blacksmith.manufactureArmor(ArmorType.CHEST);

        System.out.println(weapon.getWeaponType());
        System.out.println(armor.getArmorType());
        System.out.println(armor2.getArmorType());
    }

    private static void orcBlacksmith() {
        Blacksmith orcBlacksmith = new OrcBlacksmith();

        Weapon weapon = orcBlacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
        Weapon weapon2 = orcBlacksmith.manufactureWeapon(WeaponType.SPEAR);
        Armor armor = orcBlacksmith.manufactureArmor(ArmorType.LEGS);
        Armor armor2 = orcBlacksmith.manufactureArmor(ArmorType.FOOTS);

        System.out.println(weapon.getWeaponType());
        System.out.println(weapon2.getWeaponType());
        System.out.println(armor.getArmorType());
        System.out.println(armor2.getArmorType());
    }

}