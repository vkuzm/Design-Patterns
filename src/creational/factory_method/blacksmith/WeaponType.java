package creational.factory_method.blacksmith;

public enum WeaponType {
    SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe");

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Weapon type: " + title;
    }
}
